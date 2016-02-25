package metadslx.tempconsole; //1:1

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class GenTest { //3:1
    private ArrayList<Program.Person> Instances; //3:1

    public GenTest() { //3:1
        this.properties = new __Properties();
    }

    public GenTest(ArrayList<Program.Person> instances) { //3:1
        this();
        this.Instances = instances;
    }

    private BufferedReader __toReader(String text) {
        String enc = "UTF-8";
        byte[] bytes = null;
        try {
            if (text != null) {
                bytes = text.getBytes(enc);
            }
        } catch (UnsupportedEncodingException e) {
            bytes = null;
        }
        if (bytes == null) {
            bytes = new byte[0];
        }
        try {
            return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes), enc));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    private <T> Stream<T> __var(T item) {
        ArrayList<T> result = new ArrayList<>();
        result.add(item);
        return result.stream();
    }

    private <T> Stream<T> __enumerate(T item) {
        ArrayList<T> result = new ArrayList<>();
        result.add(item);
        return result.stream();
    }

    private <T> Stream<T> __enumerate(Iterable<T> items) {
        ArrayList<T> result = new ArrayList<>();
        for (T item: items) {
            result.add(item);
        }
        return result.stream();
    }

    private int counter = 0;
    private int nextCounter() {
        return ++counter;
    }

    private __Properties properties; //5:1
    public __Properties getProperties() { //5:1
        return properties;
    }

    public static class __Properties { //5:1
        private __Properties() {
            this.lineCount = 0; //6:18
            this.functionCount = 0; //7:22
        }
        private int lineCount; //5:1
        public int getLineCount() { //5:1
            return lineCount;
        }
        public void setLineCount(int lineCount) { //5:1
            this.lineCount = lineCount;
        }

        private int functionCount; //5:1
        public int getFunctionCount() { //5:1
            return functionCount;
        }
        public void setFunctionCount(int functionCount) { //5:1
            this.functionCount = functionCount;
        }

    }

    public String generate() { //10:1
        StringBuilder __out = new StringBuilder();
        String __tmp2Line = "Hello "; //11:1
        if (__tmp2Line != null) __out.append(__tmp2Line);
        StringBuilder __tmp3 = new StringBuilder();
        __tmp3.append(echo("World"));
        try (BufferedReader __tmp3Reader = this.__toReader(__tmp3.toString())) {
            boolean __tmp3_first = true;
            boolean __tmp3_last = !__tmp3Reader.ready();
            while(__tmp3_first || !__tmp3_last) {
                __tmp3_first = false;
                String __tmp3Line = __tmp3Reader.readLine();
                __tmp3_last = !__tmp3Reader.ready();
                if (__tmp3Line != null) __out.append(__tmp3Line);
                if (!__tmp3_last) __out.appendLine(true);
            }
        } catch (IOException e) {
            // nop
        }
        String __tmp4Line = "!"; //11:22
        if (__tmp4Line != null) __out.append(__tmp4Line);
        __out.appendLine(false); //11:23
        if (__enumerate(Instances).anyMatch(__loop1_var1 -> //12:14
            __enumerate(__loop1_var1).filter(s_filter -> (Object)s_filter instanceof Program.Student).map(s_map -> (Program.Student)(Object)s_map).anyMatch(s -> //12:25
                s.getAge() > 40
            )
        )) {//12:2
            __out.append("HASLOOP"); //13:1
            __out.appendLine(false); //13:8
        }
        AtomicInteger __loop2_counter = new AtomicInteger();
        __enumerate(Instances).forEach(s -> { //15:7
            int __loop2_iteration = __loop2_counter.incrementAndGet();
            String __tmp5Prefix = "	"; //16:1
            StringBuilder __tmp6 = new StringBuilder();
            __tmp6.append(write(s));
            try (BufferedReader __tmp6Reader = this.__toReader(__tmp6.toString())) {
                boolean __tmp6_first = true;
                boolean __tmp6_last = !__tmp6Reader.ready();
                while(__tmp6_first || !__tmp6_last) {
                    __tmp6_first = false;
                    String __tmp6Line = __tmp6Reader.readLine();
                    __tmp6_last = !__tmp6Reader.ready();
                    __out.append(__tmp5Prefix);
                    if (__tmp6Line != null) __out.append(__tmp6Line);
                    if (!__tmp6_last) __out.appendLine(true);
                    __out.appendLine(false); //16:12
                }
            } catch (IOException e) {
                // nop
            }
            String __tmp7Prefix = "	"; //17:1
            StringBuilder __tmp8 = new StringBuilder();
            __tmp8.append(write40(s));
            try (BufferedReader __tmp8Reader = this.__toReader(__tmp8.toString())) {
                boolean __tmp8_first = true;
                boolean __tmp8_last = !__tmp8Reader.ready();
                while(__tmp8_first || !__tmp8_last) {
                    __tmp8_first = false;
                    String __tmp8Line = __tmp8Reader.readLine();
                    __tmp8_last = !__tmp8Reader.ready();
                    __out.append(__tmp7Prefix);
                    if (__tmp8Line != null) __out.append(__tmp8Line);
                    if (!__tmp8_last) __out.appendLine(true);
                    __out.appendLine(false); //17:14
                }
            } catch (IOException e) {
                // nop
            }
        });
        return __out.toString();
    }

    public String echo(String text) { //21:1
        return text; //22:2
    }

    public String write(Program.Person p) { //25:1
        StringBuilder __out = new StringBuilder();
        __var(p).forEach(__tmp1 -> { //26:9
            if (p instanceof Program.Student) //27:2
            {
                StringBuilder __tmp4 = new StringBuilder();
                __tmp4.append(((Program.Student)p).getName());
                try (BufferedReader __tmp4Reader = this.__toReader(__tmp4.toString())) {
                    boolean __tmp4_first = true;
                    boolean __tmp4_last = !__tmp4Reader.ready();
                    while(__tmp4_first || !__tmp4_last) {
                        __tmp4_first = false;
                        String __tmp4Line = __tmp4Reader.readLine();
                        __tmp4_last = !__tmp4Reader.ready();
                        if (__tmp4Line != null) __out.append(__tmp4Line);
                        if (!__tmp4_last) __out.appendLine(true);
                    }
                } catch (IOException e) {
                    // nop
                }
                String __tmp5Line = " ("; //27:35
                if (__tmp5Line != null) __out.append(__tmp5Line);
                StringBuilder __tmp6 = new StringBuilder();
                __tmp6.append(((Program.Student)p).getNeptun());
                try (BufferedReader __tmp6Reader = this.__toReader(__tmp6.toString())) {
                    boolean __tmp6_first = true;
                    boolean __tmp6_last = !__tmp6Reader.ready();
                    while(__tmp6_first || !__tmp6_last) {
                        __tmp6_first = false;
                        String __tmp6Line = __tmp6Reader.readLine();
                        __tmp6_last = !__tmp6Reader.ready();
                        if (__tmp6Line != null) __out.append(__tmp6Line);
                        if (!__tmp6_last) __out.appendLine(true);
                    }
                } catch (IOException e) {
                    // nop
                }
                String __tmp7Line = "): "; //27:47
                if (__tmp7Line != null) __out.append(__tmp7Line);
                StringBuilder __tmp8 = new StringBuilder();
                __tmp8.append(((Program.Student)p).getAge());
                try (BufferedReader __tmp8Reader = this.__toReader(__tmp8.toString())) {
                    boolean __tmp8_first = true;
                    boolean __tmp8_last = !__tmp8Reader.ready();
                    while(__tmp8_first || !__tmp8_last) {
                        __tmp8_first = false;
                        String __tmp8Line = __tmp8Reader.readLine();
                        __tmp8_last = !__tmp8Reader.ready();
                        if (__tmp8Line != null) __out.append(__tmp8Line);
                        if (!__tmp8_last) __out.appendLine(true);
                        __out.appendLine(false); //27:57
                    }
                } catch (IOException e) {
                    // nop
                }
            }
            else if (p instanceof Program.Person) //28:2
            {
                StringBuilder __tmp11 = new StringBuilder();
                __tmp11.append(((Program.Person)p).getName());
                try (BufferedReader __tmp11Reader = this.__toReader(__tmp11.toString())) {
                    boolean __tmp11_first = true;
                    boolean __tmp11_last = !__tmp11Reader.ready();
                    while(__tmp11_first || !__tmp11_last) {
                        __tmp11_first = false;
                        String __tmp11Line = __tmp11Reader.readLine();
                        __tmp11_last = !__tmp11Reader.ready();
                        if (__tmp11Line != null) __out.append(__tmp11Line);
                        if (!__tmp11_last) __out.appendLine(true);
                    }
                } catch (IOException e) {
                    // nop
                }
                String __tmp12Line = ": "; //28:34
                if (__tmp12Line != null) __out.append(__tmp12Line);
                StringBuilder __tmp13 = new StringBuilder();
                __tmp13.append(((Program.Person)p).getAge());
                try (BufferedReader __tmp13Reader = this.__toReader(__tmp13.toString())) {
                    boolean __tmp13_first = true;
                    boolean __tmp13_last = !__tmp13Reader.ready();
                    while(__tmp13_first || !__tmp13_last) {
                        __tmp13_first = false;
                        String __tmp13Line = __tmp13Reader.readLine();
                        __tmp13_last = !__tmp13Reader.ready();
                        if (__tmp13Line != null) __out.append(__tmp13Line);
                        if (!__tmp13_last) __out.appendLine(true);
                        __out.appendLine(false); //28:43
                    }
                } catch (IOException e) {
                    // nop
                }
            }
        }); //29:2

        return __out.toString();
    }

    public String write40(Program.Person p) { //33:1
        StringBuilder __out = new StringBuilder();
        __var(p.getAge()).forEach(__tmp1 -> { //34:9
            if (__tmp1 == 40) //35:2
            {
                String __tmp4Line = " HELLO "; //35:11
                if (__tmp4Line != null) __out.append(__tmp4Line);
                StringBuilder __tmp5 = new StringBuilder();
                __tmp5.append(p.getAge());
                try (BufferedReader __tmp5Reader = this.__toReader(__tmp5.toString())) {
                    boolean __tmp5_first = true;
                    boolean __tmp5_last = !__tmp5Reader.ready();
                    while(__tmp5_first || !__tmp5_last) {
                        __tmp5_first = false;
                        String __tmp5Line = __tmp5Reader.readLine();
                        __tmp5_last = !__tmp5Reader.ready();
                        if (__tmp5Line != null) __out.append(__tmp5Line);
                        if (!__tmp5_last) __out.appendLine(true);
                    }
                } catch (IOException e) {
                    // nop
                }
                String __tmp6Line = "!!!"; //35:25
                if (__tmp6Line != null) __out.append(__tmp6Line);
                __out.appendLine(false); //35:28
            } else { //36:2
                String __tmp9Line = " NON-40: "; //36:11
                if (__tmp9Line != null) __out.append(__tmp9Line);
                StringBuilder __tmp10 = new StringBuilder();
                __tmp10.append(p.getAge());
                try (BufferedReader __tmp10Reader = this.__toReader(__tmp10.toString())) {
                    boolean __tmp10_first = true;
                    boolean __tmp10_last = !__tmp10Reader.ready();
                    while(__tmp10_first || !__tmp10_last) {
                        __tmp10_first = false;
                        String __tmp10Line = __tmp10Reader.readLine();
                        __tmp10_last = !__tmp10Reader.ready();
                        if (__tmp10Line != null) __out.append(__tmp10Line);
                        if (!__tmp10_last) __out.appendLine(true);
                        __out.appendLine(false); //36:27
                    }
                } catch (IOException e) {
                    // nop
                }
            }
        }); //37:2

        return __out.toString();
    }

    private static class StringBuilder {
        private boolean newLine;
        private java.lang.StringBuilder builder = new java.lang.StringBuilder();
        
        public StringBuilder() {
            this.newLine = true;
        }
        
        public void append(String str) {
            if (str == null) return;
            if (!"".equals(str)) {
                this.newLine = false;
            }
            builder.append(str);
        }
        
        public void append(Object obj) {
            if (obj == null) return;
            String text = obj.toString();
            this.append(text);
        }
        
        public void appendLine() {
            this.appendLine(false);
        }
        
        public void appendLine(boolean force) {
            if (force || !this.newLine) {
                builder.append("\n");
                this.newLine = true;
            }
        }
        
        @Override
        public String toString() {
            return builder.toString();
        }
    }
}

