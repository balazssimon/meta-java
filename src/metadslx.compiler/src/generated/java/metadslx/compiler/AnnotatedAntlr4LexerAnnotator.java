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

public class AnnotatedAntlr4LexerAnnotator
{
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Integer, List<Object>> tokenAnnotations = new HashMap<>();
    private Map<Integer, List<Object>> modeAnnotations = new HashMap<>();
    
    public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }
    
    
    public AnnotatedAntlr4LexerAnnotator()
    {
        List<Object> annotList = null;
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(AnnotatedAntlr4Lexer.ArgAction, annotList);
        SyntaxAnnotation __tmp1 = new SyntaxAnnotation();
        __tmp1.setKind(Antlr4SyntaxKind.Action);
        __tmp1.setFirst(AnnotatedAntlr4Lexer.ArgAction);
        __tmp1.setLast(AnnotatedAntlr4Lexer.ArgAction);
        annotList.add(__tmp1);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(AnnotatedAntlr4Lexer.DOC_COMMENT_MODE, annotList);
        SyntaxAnnotation __tmp2 = new SyntaxAnnotation();
        __tmp2.setKind(SyntaxKind.DocComment);
        __tmp2.setFirst(AnnotatedAntlr4Lexer.DOC_COMMENT_MODE);
        __tmp2.setLast(AnnotatedAntlr4Lexer.DOC_COMMENT_MODE);
        annotList.add(__tmp2);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(AnnotatedAntlr4Lexer.BLOCK_COMMENT_MODE, annotList);
        SyntaxAnnotation __tmp3 = new SyntaxAnnotation();
        __tmp3.setKind(SyntaxKind.Comment);
        __tmp3.setFirst(AnnotatedAntlr4Lexer.BLOCK_COMMENT_MODE);
        __tmp3.setLast(AnnotatedAntlr4Lexer.BLOCK_COMMENT_MODE);
        annotList.add(__tmp3);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.TOKEN_REF, annotList);
        SyntaxAnnotation __tmp4 = new SyntaxAnnotation();
        __tmp4.setKind(Antlr4SyntaxKind.Token);
        __tmp4.setFirst(AnnotatedAntlr4Lexer.TOKEN_REF);
        __tmp4.setLast(AnnotatedAntlr4Lexer.TOKEN_REF);
        annotList.add(__tmp4);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.RULE_REF, annotList);
        SyntaxAnnotation __tmp5 = new SyntaxAnnotation();
        __tmp5.setKind(Antlr4SyntaxKind.Rule);
        __tmp5.setFirst(AnnotatedAntlr4Lexer.RULE_REF);
        __tmp5.setLast(AnnotatedAntlr4Lexer.RULE_REF);
        annotList.add(__tmp5);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.LEXER_CHAR_SET, annotList);
        SyntaxAnnotation __tmp6 = new SyntaxAnnotation();
        __tmp6.setKind(SyntaxKind.Operator);
        __tmp6.setFirst(AnnotatedAntlr4Lexer.LEXER_CHAR_SET);
        __tmp6.setLast(AnnotatedAntlr4Lexer.LEXER_CHAR_SET);
        annotList.add(__tmp6);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.LINE_COMMENT, annotList);
        SyntaxAnnotation __tmp7 = new SyntaxAnnotation();
        __tmp7.setKind(SyntaxKind.Comment);
        __tmp7.setFirst(AnnotatedAntlr4Lexer.LINE_COMMENT);
        __tmp7.setLast(AnnotatedAntlr4Lexer.LINE_COMMENT);
        annotList.add(__tmp7);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.OPTIONS, annotList);
        SyntaxAnnotation __tmp8 = new SyntaxAnnotation();
        __tmp8.setKind(Antlr4SyntaxKind.Options);
        __tmp8.setFirst(AnnotatedAntlr4Lexer.OPTIONS);
        __tmp8.setLast(AnnotatedAntlr4Lexer.OPTIONS);
        annotList.add(__tmp8);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.TOKENS, annotList);
        SyntaxAnnotation __tmp9 = new SyntaxAnnotation();
        __tmp9.setKind(Antlr4SyntaxKind.Options);
        __tmp9.setFirst(AnnotatedAntlr4Lexer.TOKENS);
        __tmp9.setLast(AnnotatedAntlr4Lexer.TOKENS);
        annotList.add(__tmp9);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.IMPORT, annotList);
        SyntaxAnnotation __tmp10 = new SyntaxAnnotation();
        __tmp10.setFirst(AnnotatedAntlr4Lexer.IMPORT);
        __tmp10.setLast(AnnotatedAntlr4Lexer.NULL);
        __tmp10.setKind(SyntaxKind.Keyword);
        annotList.add(__tmp10);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.ID, annotList);
        SyntaxAnnotation __tmp11 = new SyntaxAnnotation();
        __tmp11.setKind(SyntaxKind.Identifier);
        __tmp11.setFirst(AnnotatedAntlr4Lexer.ID);
        __tmp11.setLast(AnnotatedAntlr4Lexer.ID);
        annotList.add(__tmp11);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.INTEGER_LITERAL, annotList);
        SyntaxAnnotation __tmp12 = new SyntaxAnnotation();
        __tmp12.setKind(SyntaxKind.Number);
        __tmp12.setFirst(AnnotatedAntlr4Lexer.INTEGER_LITERAL);
        __tmp12.setLast(AnnotatedAntlr4Lexer.INTEGER_LITERAL);
        annotList.add(__tmp12);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.DECIMAL_LITERAL, annotList);
        SyntaxAnnotation __tmp13 = new SyntaxAnnotation();
        __tmp13.setKind(SyntaxKind.Number);
        __tmp13.setFirst(AnnotatedAntlr4Lexer.DECIMAL_LITERAL);
        __tmp13.setLast(AnnotatedAntlr4Lexer.DECIMAL_LITERAL);
        annotList.add(__tmp13);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.SCIENTIFIC_LITERAL, annotList);
        SyntaxAnnotation __tmp14 = new SyntaxAnnotation();
        __tmp14.setKind(SyntaxKind.Number);
        __tmp14.setFirst(AnnotatedAntlr4Lexer.SCIENTIFIC_LITERAL);
        __tmp14.setLast(AnnotatedAntlr4Lexer.SCIENTIFIC_LITERAL);
        annotList.add(__tmp14);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.STRING_LITERAL, annotList);
        SyntaxAnnotation __tmp15 = new SyntaxAnnotation();
        __tmp15.setKind(SyntaxKind.String);
        __tmp15.setFirst(AnnotatedAntlr4Lexer.STRING_LITERAL);
        __tmp15.setLast(AnnotatedAntlr4Lexer.STRING_LITERAL);
        annotList.add(__tmp15);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.UNTERMINATED_STRING_LITERAL, annotList);
        SyntaxAnnotation __tmp16 = new SyntaxAnnotation();
        __tmp16.setKind(SyntaxKind.String);
        __tmp16.setFirst(AnnotatedAntlr4Lexer.UNTERMINATED_STRING_LITERAL);
        __tmp16.setLast(AnnotatedAntlr4Lexer.UNTERMINATED_STRING_LITERAL);
        annotList.add(__tmp16);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.ACTION, annotList);
        SyntaxAnnotation __tmp17 = new SyntaxAnnotation();
        __tmp17.setKind(Antlr4SyntaxKind.Action);
        __tmp17.setFirst(AnnotatedAntlr4Lexer.ACTION);
        __tmp17.setLast(AnnotatedAntlr4Lexer.ACTION);
        annotList.add(__tmp17);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.ARG_ACTION, annotList);
        SyntaxAnnotation __tmp18 = new SyntaxAnnotation();
        __tmp18.setKind(Antlr4SyntaxKind.Action);
        __tmp18.setFirst(AnnotatedAntlr4Lexer.ARG_ACTION);
        __tmp18.setLast(AnnotatedAntlr4Lexer.ARG_ACTION);
        annotList.add(__tmp18);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.UNTERMINATED_ARG_ACTION, annotList);
        SyntaxAnnotation __tmp19 = new SyntaxAnnotation();
        __tmp19.setKind(Antlr4SyntaxKind.Action);
        __tmp19.setFirst(AnnotatedAntlr4Lexer.UNTERMINATED_ARG_ACTION);
        __tmp19.setLast(AnnotatedAntlr4Lexer.UNTERMINATED_ARG_ACTION);
        annotList.add(__tmp19);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.DOC_COMMENT, annotList);
        SyntaxAnnotation __tmp20 = new SyntaxAnnotation();
        __tmp20.setKind(SyntaxKind.Comment);
        __tmp20.setFirst(AnnotatedAntlr4Lexer.DOC_COMMENT);
        __tmp20.setLast(AnnotatedAntlr4Lexer.DOC_COMMENT);
        annotList.add(__tmp20);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(AnnotatedAntlr4Lexer.BLOCK_COMMENT, annotList);
        SyntaxAnnotation __tmp21 = new SyntaxAnnotation();
        __tmp21.setKind(SyntaxKind.Comment);
        __tmp21.setFirst(AnnotatedAntlr4Lexer.BLOCK_COMMENT);
        __tmp21.setLast(AnnotatedAntlr4Lexer.BLOCK_COMMENT);
        annotList.add(__tmp21);
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

