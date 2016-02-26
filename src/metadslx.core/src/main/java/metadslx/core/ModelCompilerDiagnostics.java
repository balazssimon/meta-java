package metadslx.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ModelCompilerDiagnostics {
    private List<DiagnosticMessage> messages;

    private boolean sorted = false;
    private boolean logsIncluded = false;
    private boolean hasErrors = false;
    private boolean hasWarnings = false;
    private List<DiagnosticMessage> sortedMessages;
    
    public ModelCompilerDiagnostics() {
		this.messages = new ArrayList<>();
	}
    
    public boolean hasErrors() {
        return this.hasErrors;
    }

    public boolean hasWarnings() {
        return this.hasWarnings;
    }

    public Iterable<DiagnosticMessage> getMessages() {
    	return this.getMessages(false);
    }
    
    public Iterable<DiagnosticMessage> getMessages(boolean includeLog) {
    	if (!this.sorted || this.logsIncluded != includeLog) {
    		this.sortedMessages =
   				this.messages.stream().filter(m -> !m.isLog() || includeLog).
   					sorted(Comparator.comparing(DiagnosticMessage::getFileName).
   					thenComparing(DiagnosticMessage::getTextSpan)).distinct().
   					collect(Collectors.toList());
    		this.logsIncluded = includeLog;
    		this.sorted = true;
    	}
    	return this.sortedMessages;
    }

    public Iterable<DiagnosticMessage> getMessages(Severity severity) {
    	return this.getMessages(severity, false);
    }

    public Iterable<DiagnosticMessage> getMessages(final Severity severity, final boolean includeLog) {
    	this.getMessages(includeLog);
    	return this.sortedMessages.stream().filter(m ->  (m.getSeverity().getValue() | severity.getValue()) == m.getSeverity().getValue() && (!m.isLog() || includeLog)).collect(Collectors.toCollection(ArrayList::new));
    }
    
    public void addMessage(Severity severity, String message, String fileName, ModelObject symbol, boolean isLog) {
    	boolean added = false;
    	IModelCompiler compiler = ModelCompilerContext.current();
    	if (compiler != null) {
            for (TextSpan textSpan: compiler.getNameProvider().getSymbolTextSpans(symbol))
            {
                this.addMessage(severity, message, fileName, textSpan, isLog);
            	added = true;
            }
    	}
    	if (!added)
    	{
    		this.addMessage(severity, message, fileName, new TextSpan(), isLog);
    	}
    }
    
    public void addMessage(Severity severity, String message, String fileName, Object node, boolean isLog) {
    	TextSpan textSpan = null;
    	IModelCompiler compiler = ModelCompilerContext.current();
    	if (compiler != null) {
            textSpan = compiler.getNameProvider().getTreeNodeTextSpan(node);
    	} else {
    		textSpan = new TextSpan();
    	}
		this.addMessage(severity, message, fileName, textSpan, isLog);
    }
    
    public void addMessage(Severity severity, String message, String fileName, TextSpan textSpan, boolean isLog) {
        if (severity == Severity.Error) {
            this.hasErrors = true;
        }
        if (severity == Severity.Warning) {
            this.hasWarnings = true;
        }
        this.messages.add(new DiagnosticMessage(message, fileName, textSpan, severity, isLog));
        this.sorted = false;
    }

    public void addError(String message, String fileName, ModelObject symbol, boolean isLog) {
    	this.addMessage(Severity.Error, message, fileName, symbol, isLog);
    }

    public void addError(String message, String fileName, Object node, boolean isLog) {
    	this.addMessage(Severity.Error, message, fileName, node, isLog);
    }

    public void addError(String message, String fileName, TextSpan textSpan, boolean isLog) {
    	this.addMessage(Severity.Error, message, fileName, textSpan, isLog);
    }

    public void addWarning(String message, String fileName, ModelObject symbol, boolean isLog) {
    	this.addMessage(Severity.Warning, message, fileName, symbol, isLog);
    }

    public void addWarning(String message, String fileName, Object node, boolean isLog) {
    	this.addMessage(Severity.Warning, message, fileName, node, isLog);
    }

    public void addWarning(String message, String fileName, TextSpan textSpan, boolean isLog) {
    	this.addMessage(Severity.Warning, message, fileName, textSpan, isLog);
    }

    public void addInfo(String message, String fileName, ModelObject symbol, boolean isLog) {
    	this.addMessage(Severity.Info, message, fileName, symbol, isLog);
    }

    public void addInfo(String message, String fileName, Object node, boolean isLog) {
    	this.addMessage(Severity.Info, message, fileName, node, isLog);
    }

    public void addInfo(String message, String fileName, TextSpan textSpan, boolean isLog) {
    	this.addMessage(Severity.Info, message, fileName, textSpan, isLog);
    }
}
