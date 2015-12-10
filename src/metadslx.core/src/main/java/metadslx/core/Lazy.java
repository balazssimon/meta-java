package metadslx.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/**
 * Class to lazily initialize a value based on provided Factory method or
 * class's default constructor inspired from C# Lazy&lt;T> using Lambda and
 * Method reference capabilities of Java 8. All exceptions resulting from
 * factory methods are cascaded to caller. Exceptions from default constructor
 * is wrapped as a RuntimeException. Throws NullPointerException if the factory
 * method itself is null to fail fast. Available as
 * both Thread safe(default) and unsafe versions. Usage examples
 * 
 * <pre>
 * 	public Lazy&lt;IntensiveResource> r = Lazy.create(IntensiveResource.class, false);
 * 	
 * 	public Lazy&lt;IntensiveResource> r1 = Lazy.create(IntensiveResource::buildResource);
 * 	
 * 	public Lazy&lt;IntensiveResource> r2 = Lazy.create(() -> return new IntensiveResource());
 * </pre>
 * 
 * Invoking toString() will cause the object to be initialized. Accessing the
 * value of the Lazy object using Lazy.value() method causes the object to
 * initialize and execute the Factory method supplied.
 *
 * @param <V>
 *            - Type of the object obtained after deferred creation
 */
public class Lazy<V> implements Serializable {

    private static final long serialVersionUID = 1L;

    private V value;

    private Boolean created = Boolean.FALSE;

    protected Supplier<V> factory;
    
    private static ThreadLocal<ArrayList<Lazy>> stack = ThreadLocal.withInitial(() -> new ArrayList<Lazy>());

    public static <V> Lazy<V> create(Class<V> valueClass, boolean threadSafe) {
        if (threadSafe) {
            return new ThreadSafeLazy<V>(valueClass);
        } else {
            return new Lazy<V>(valueClass);
        }
    }

    public static <V> Lazy<V> create(Class<V> valueClass) {
        return create(valueClass, true);
    }

    public static <V> Lazy<V> create(Supplier<V> factoryMethod, boolean threadSafe) {
        if (threadSafe) {
            return new ThreadSafeLazy<V>(factoryMethod);
        } else {
            return new Lazy<V>(factoryMethod);
        }
    }

    public static <V> Lazy<V> create(Supplier<V> factoryMethod) {
        return create(factoryMethod, true);
    }

    private Lazy(Class<V> valueClass) {
        factory = () -> {
            try {
                return valueClass.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    private Lazy(Supplier<V> factoryMethod) {
        if (factoryMethod == null) {
            throw new NullPointerException();
        }
        this.factory = factoryMethod;
    }

    public Boolean created() {
        return created;
    }

    public V value() {
        if (!created()) {
            initialize();
        }
        return getInternalValue();
    }

    protected V getInternalValue() {
        return value;
    }

    protected void initialize() {
    	if (Lazy.stack.get().contains(this)) {
    		throw new IllegalStateException("Circular dependency between lazy values.");
    	} else {
    		Lazy.stack.get().add(this);
    	}
    	try {
    		value = factory.get();
            created = Boolean.TRUE;
    	} finally {
    		Lazy.stack.get().remove(this);
    	}
    }

    @Override
    public String toString() {
        return value().toString();
    }

    private static class ThreadSafeLazy<V> extends Lazy<V> {

        private static final long serialVersionUID = 1L;

        private AtomicBoolean created = new AtomicBoolean(false);
        private AtomicReference<V> value = new AtomicReference<V>();
        private ReentrantLock writeLock = new ReentrantLock();

        private ThreadSafeLazy(Class<V> valueClass) {
            super(valueClass);
        }

        private ThreadSafeLazy(Supplier<V> factoryMethod) {
            super(factoryMethod);
        }

        @Override
        public Boolean created() {
            return created.get();
        }

        @Override
        protected V getInternalValue() {
            return value.get();
        }

        @Override
        protected void initialize() {
            writeLock.lock();
            try {
                if (value.get() == null) {
                    if (value.compareAndSet(null, factory.get())) {
                        created.set(true);
                    }
                }
            } finally {
                writeLock.unlock();
            }
        }

    }
}