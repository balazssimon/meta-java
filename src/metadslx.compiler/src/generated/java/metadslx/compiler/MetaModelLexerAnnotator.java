package metadslx.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.IModelCompiler;
import metadslx.core.ModelCompilerContext;
import metadslx.compiler.*;

@SuppressWarnings("unused")
public class MetaModelLexerAnnotator
{
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Integer, List<Object>> tokenAnnotations = new HashMap<>();
    private Map<Integer, List<Object>> modeAnnotations = new HashMap<>();
    
    public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }
    
    
    public MetaModelLexerAnnotator()
    {
        List<Object> annotList = null;
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(MetaModelLexer.MULTILINE_COMMENT, annotList);
        SyntaxAnnotation __tmp1 = new SyntaxAnnotation();
        __tmp1.setKind(SyntaxKind.Comment);
        __tmp1.setFirst(MetaModelLexer.MULTILINE_COMMENT);
        __tmp1.setLast(MetaModelLexer.MULTILINE_COMMENT);
        annotList.add(__tmp1);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.KNamespace, annotList);
        SyntaxAnnotation __tmp2 = new SyntaxAnnotation();
        __tmp2.setFirst(MetaModelLexer.KNamespace);
        __tmp2.setLast(MetaModelLexer.KStatic);
        __tmp2.setKind(SyntaxKind.Keyword);
        annotList.add(__tmp2);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.IdentifierNormal, annotList);
        SyntaxAnnotation __tmp3 = new SyntaxAnnotation();
        __tmp3.setKind(SyntaxKind.Identifier);
        __tmp3.setFirst(MetaModelLexer.IdentifierNormal);
        __tmp3.setLast(MetaModelLexer.IdentifierNormal);
        annotList.add(__tmp3);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.IntegerLiteral, annotList);
        SyntaxAnnotation __tmp4 = new SyntaxAnnotation();
        __tmp4.setKind(SyntaxKind.Number);
        __tmp4.setFirst(MetaModelLexer.IntegerLiteral);
        __tmp4.setLast(MetaModelLexer.IntegerLiteral);
        annotList.add(__tmp4);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.DecimalLiteral, annotList);
        SyntaxAnnotation __tmp5 = new SyntaxAnnotation();
        __tmp5.setKind(SyntaxKind.Number);
        __tmp5.setFirst(MetaModelLexer.DecimalLiteral);
        __tmp5.setLast(MetaModelLexer.DecimalLiteral);
        annotList.add(__tmp5);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.ScientificLiteral, annotList);
        SyntaxAnnotation __tmp6 = new SyntaxAnnotation();
        __tmp6.setKind(SyntaxKind.Number);
        __tmp6.setFirst(MetaModelLexer.ScientificLiteral);
        __tmp6.setLast(MetaModelLexer.ScientificLiteral);
        annotList.add(__tmp6);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.DateTimeOffsetLiteral, annotList);
        SyntaxAnnotation __tmp7 = new SyntaxAnnotation();
        __tmp7.setKind(SyntaxKind.Number);
        __tmp7.setFirst(MetaModelLexer.DateTimeOffsetLiteral);
        __tmp7.setLast(MetaModelLexer.DateTimeOffsetLiteral);
        annotList.add(__tmp7);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.DateTimeLiteral, annotList);
        SyntaxAnnotation __tmp8 = new SyntaxAnnotation();
        __tmp8.setKind(SyntaxKind.Number);
        __tmp8.setFirst(MetaModelLexer.DateTimeLiteral);
        __tmp8.setLast(MetaModelLexer.DateTimeLiteral);
        annotList.add(__tmp8);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.DateLiteral, annotList);
        SyntaxAnnotation __tmp9 = new SyntaxAnnotation();
        __tmp9.setKind(SyntaxKind.Number);
        __tmp9.setFirst(MetaModelLexer.DateLiteral);
        __tmp9.setLast(MetaModelLexer.DateLiteral);
        annotList.add(__tmp9);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.TimeLiteral, annotList);
        SyntaxAnnotation __tmp10 = new SyntaxAnnotation();
        __tmp10.setKind(SyntaxKind.Number);
        __tmp10.setFirst(MetaModelLexer.TimeLiteral);
        __tmp10.setLast(MetaModelLexer.TimeLiteral);
        annotList.add(__tmp10);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.RegularStringLiteral, annotList);
        SyntaxAnnotation __tmp11 = new SyntaxAnnotation();
        __tmp11.setKind(SyntaxKind.String);
        __tmp11.setFirst(MetaModelLexer.RegularStringLiteral);
        __tmp11.setLast(MetaModelLexer.RegularStringLiteral);
        annotList.add(__tmp11);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.GuidLiteral, annotList);
        SyntaxAnnotation __tmp12 = new SyntaxAnnotation();
        __tmp12.setKind(SyntaxKind.String);
        __tmp12.setFirst(MetaModelLexer.GuidLiteral);
        __tmp12.setLast(MetaModelLexer.GuidLiteral);
        annotList.add(__tmp12);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.LINE_COMMENT, annotList);
        SyntaxAnnotation __tmp13 = new SyntaxAnnotation();
        __tmp13.setKind(SyntaxKind.Comment);
        __tmp13.setFirst(MetaModelLexer.LINE_COMMENT);
        __tmp13.setLast(MetaModelLexer.LINE_COMMENT);
        annotList.add(__tmp13);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaModelLexer.COMMENT, annotList);
        SyntaxAnnotation __tmp14 = new SyntaxAnnotation();
        __tmp14.setKind(SyntaxKind.Comment);
        __tmp14.setFirst(MetaModelLexer.COMMENT);
        __tmp14.setLast(MetaModelLexer.COMMENT);
        annotList.add(__tmp14);
    }
    
    public Object visitTerminal(TerminalNode node, Map<Object, List<Object>> treeAnnotations)
    {
        Token token = node.getSymbol();
        if (token != null)
        {
            List<Object> annotList = this.tokenAnnotations.get(token.getType());
            if (annotList != null)
            {
                List<Object> treeAnnotList = treeAnnotations.get(node);
                if (treeAnnotList == null)
                {
                    treeAnnotList = new ArrayList<>();
                    treeAnnotations.put(node, treeAnnotList);
                }
                treeAnnotList.addAll(annotList);
            }
        }
        return null;
    }
}

