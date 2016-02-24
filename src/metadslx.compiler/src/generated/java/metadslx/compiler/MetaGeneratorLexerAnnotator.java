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

public class MetaGeneratorLexerAnnotator
{
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Integer, List<Object>> tokenAnnotations = new HashMap<>();
    private Map<Integer, List<Object>> modeAnnotations = new HashMap<>();
    
    public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }
    
    
    public MetaGeneratorLexerAnnotator()
    {
        List<Object> annotList = null;
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(MetaGeneratorLexer.MULTILINE_COMMENT, annotList);
        SyntaxAnnotation __tmp1 = new SyntaxAnnotation();
        __tmp1.setKind(SyntaxKind.Comment);
        __tmp1.setFirst(MetaGeneratorLexer.MULTILINE_COMMENT);
        __tmp1.setLast(MetaGeneratorLexer.MULTILINE_COMMENT);
        annotList.add(__tmp1);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(MetaGeneratorLexer.DOUBLEQUOTE_VERBATIM_STRING, annotList);
        SyntaxAnnotation __tmp2 = new SyntaxAnnotation();
        __tmp2.setKind(SyntaxKind.String);
        __tmp2.setFirst(MetaGeneratorLexer.DOUBLEQUOTE_VERBATIM_STRING);
        __tmp2.setLast(MetaGeneratorLexer.DOUBLEQUOTE_VERBATIM_STRING);
        annotList.add(__tmp2);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(MetaGeneratorLexer.TEMPLATE_OUTPUT, annotList);
        SyntaxAnnotation __tmp3 = new SyntaxAnnotation();
        __tmp3.setKind(MetaGeneratorSyntaxKind.TemplateOutput);
        __tmp3.setFirst(MetaGeneratorLexer.TEMPLATE_OUTPUT);
        __tmp3.setLast(MetaGeneratorLexer.TEMPLATE_OUTPUT);
        annotList.add(__tmp3);
        
        annotList = new ArrayList<>();
        this.modeAnnotations.put(MetaGeneratorLexer.TEMPLATE_STATEMENT_COMMENT, annotList);
        SyntaxAnnotation __tmp4 = new SyntaxAnnotation();
        __tmp4.setKind(SyntaxKind.Comment);
        __tmp4.setFirst(MetaGeneratorLexer.TEMPLATE_STATEMENT_COMMENT);
        __tmp4.setLast(MetaGeneratorLexer.TEMPLATE_STATEMENT_COMMENT);
        annotList.add(__tmp4);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.KNamespace, annotList);
        SyntaxAnnotation __tmp5 = new SyntaxAnnotation();
        __tmp5.setFirst(MetaGeneratorLexer.KNamespace);
        __tmp5.setLast(MetaGeneratorLexer.KDefault);
        __tmp5.setKind(SyntaxKind.Keyword);
        annotList.add(__tmp5);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TSemicolon, annotList);
        SyntaxAnnotation __tmp6 = new SyntaxAnnotation();
        __tmp6.setKind(SyntaxKind.Operator);
        __tmp6.setFirst(MetaGeneratorLexer.TSemicolon);
        __tmp6.setLast(MetaGeneratorLexer.TQuestionQuestion);
        annotList.add(__tmp6);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.IdentifierNormal, annotList);
        SyntaxAnnotation __tmp7 = new SyntaxAnnotation();
        __tmp7.setKind(SyntaxKind.Identifier);
        __tmp7.setFirst(MetaGeneratorLexer.IdentifierNormal);
        __tmp7.setLast(MetaGeneratorLexer.IdentifierNormal);
        annotList.add(__tmp7);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.IntegerLiteral, annotList);
        SyntaxAnnotation __tmp8 = new SyntaxAnnotation();
        __tmp8.setKind(SyntaxKind.Number);
        __tmp8.setFirst(MetaGeneratorLexer.IntegerLiteral);
        __tmp8.setLast(MetaGeneratorLexer.IntegerLiteral);
        annotList.add(__tmp8);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.DecimalLiteral, annotList);
        SyntaxAnnotation __tmp9 = new SyntaxAnnotation();
        __tmp9.setKind(SyntaxKind.Number);
        __tmp9.setFirst(MetaGeneratorLexer.DecimalLiteral);
        __tmp9.setLast(MetaGeneratorLexer.DecimalLiteral);
        annotList.add(__tmp9);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.ScientificLiteral, annotList);
        SyntaxAnnotation __tmp10 = new SyntaxAnnotation();
        __tmp10.setKind(SyntaxKind.Number);
        __tmp10.setFirst(MetaGeneratorLexer.ScientificLiteral);
        __tmp10.setLast(MetaGeneratorLexer.ScientificLiteral);
        annotList.add(__tmp10);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.DateTimeOffsetLiteral, annotList);
        SyntaxAnnotation __tmp11 = new SyntaxAnnotation();
        __tmp11.setKind(SyntaxKind.Number);
        __tmp11.setFirst(MetaGeneratorLexer.DateTimeOffsetLiteral);
        __tmp11.setLast(MetaGeneratorLexer.DateTimeOffsetLiteral);
        annotList.add(__tmp11);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.DateTimeLiteral, annotList);
        SyntaxAnnotation __tmp12 = new SyntaxAnnotation();
        __tmp12.setKind(SyntaxKind.Number);
        __tmp12.setFirst(MetaGeneratorLexer.DateTimeLiteral);
        __tmp12.setLast(MetaGeneratorLexer.DateTimeLiteral);
        annotList.add(__tmp12);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.DateLiteral, annotList);
        SyntaxAnnotation __tmp13 = new SyntaxAnnotation();
        __tmp13.setKind(SyntaxKind.Number);
        __tmp13.setFirst(MetaGeneratorLexer.DateLiteral);
        __tmp13.setLast(MetaGeneratorLexer.DateLiteral);
        annotList.add(__tmp13);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TimeLiteral, annotList);
        SyntaxAnnotation __tmp14 = new SyntaxAnnotation();
        __tmp14.setKind(SyntaxKind.Number);
        __tmp14.setFirst(MetaGeneratorLexer.TimeLiteral);
        __tmp14.setLast(MetaGeneratorLexer.TimeLiteral);
        annotList.add(__tmp14);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.CharLiteral, annotList);
        SyntaxAnnotation __tmp15 = new SyntaxAnnotation();
        __tmp15.setKind(SyntaxKind.String);
        __tmp15.setFirst(MetaGeneratorLexer.CharLiteral);
        __tmp15.setLast(MetaGeneratorLexer.CharLiteral);
        annotList.add(__tmp15);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.RegularStringLiteral, annotList);
        SyntaxAnnotation __tmp16 = new SyntaxAnnotation();
        __tmp16.setKind(SyntaxKind.String);
        __tmp16.setFirst(MetaGeneratorLexer.RegularStringLiteral);
        __tmp16.setLast(MetaGeneratorLexer.RegularStringLiteral);
        annotList.add(__tmp16);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.GuidLiteral, annotList);
        SyntaxAnnotation __tmp17 = new SyntaxAnnotation();
        __tmp17.setKind(SyntaxKind.Number);
        __tmp17.setFirst(MetaGeneratorLexer.GuidLiteral);
        __tmp17.setLast(MetaGeneratorLexer.GuidLiteral);
        annotList.add(__tmp17);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.LINE_COMMENT, annotList);
        SyntaxAnnotation __tmp18 = new SyntaxAnnotation();
        __tmp18.setKind(SyntaxKind.Comment);
        __tmp18.setFirst(MetaGeneratorLexer.LINE_COMMENT);
        __tmp18.setLast(MetaGeneratorLexer.LINE_COMMENT);
        annotList.add(__tmp18);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.COMMENT, annotList);
        SyntaxAnnotation __tmp19 = new SyntaxAnnotation();
        __tmp19.setKind(SyntaxKind.Comment);
        __tmp19.setFirst(MetaGeneratorLexer.COMMENT);
        __tmp19.setLast(MetaGeneratorLexer.COMMENT);
        annotList.add(__tmp19);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TH_TCloseParenthesis, annotList);
        SyntaxAnnotation __tmp20 = new SyntaxAnnotation();
        __tmp20.setKind(SyntaxKind.Operator);
        __tmp20.setFirst(MetaGeneratorLexer.TH_TCloseParenthesis);
        __tmp20.setLast(MetaGeneratorLexer.TH_TCloseParenthesis);
        annotList.add(__tmp20);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.KEndTemplate, annotList);
        SyntaxAnnotation __tmp21 = new SyntaxAnnotation();
        __tmp21.setKind(SyntaxKind.Keyword);
        __tmp21.setFirst(MetaGeneratorLexer.KEndTemplate);
        __tmp21.setLast(MetaGeneratorLexer.KEndTemplate);
        annotList.add(__tmp21);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TemplateLineControl, annotList);
        SyntaxAnnotation __tmp22 = new SyntaxAnnotation();
        __tmp22.setKind(MetaGeneratorSyntaxKind.TemplateControl);
        __tmp22.setFirst(MetaGeneratorLexer.TemplateLineControl);
        __tmp22.setLast(MetaGeneratorLexer.TemplateLineControl);
        annotList.add(__tmp22);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TemplateOutput, annotList);
        SyntaxAnnotation __tmp23 = new SyntaxAnnotation();
        __tmp23.setKind(MetaGeneratorSyntaxKind.TemplateOutput);
        __tmp23.setFirst(MetaGeneratorLexer.TemplateOutput);
        __tmp23.setLast(MetaGeneratorLexer.TemplateOutput);
        annotList.add(__tmp23);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TemplateCrLf, annotList);
        SyntaxAnnotation __tmp24 = new SyntaxAnnotation();
        __tmp24.setKind(MetaGeneratorSyntaxKind.TemplateOutput);
        __tmp24.setFirst(MetaGeneratorLexer.TemplateCrLf);
        __tmp24.setLast(MetaGeneratorLexer.TemplateCrLf);
        annotList.add(__tmp24);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TemplateLineBreak, annotList);
        SyntaxAnnotation __tmp25 = new SyntaxAnnotation();
        __tmp25.setKind(MetaGeneratorSyntaxKind.TemplateOutput);
        __tmp25.setFirst(MetaGeneratorLexer.TemplateLineBreak);
        __tmp25.setLast(MetaGeneratorLexer.TemplateLineBreak);
        annotList.add(__tmp25);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TemplateStatementStart, annotList);
        SyntaxAnnotation __tmp26 = new SyntaxAnnotation();
        __tmp26.setKind(MetaGeneratorSyntaxKind.TemplateControl);
        __tmp26.setFirst(MetaGeneratorLexer.TemplateStatementStart);
        __tmp26.setLast(MetaGeneratorLexer.TemplateStatementStart);
        annotList.add(__tmp26);
        
        annotList = new ArrayList<>();
        this.tokenAnnotations.put(MetaGeneratorLexer.TemplateStatementEnd, annotList);
        SyntaxAnnotation __tmp27 = new SyntaxAnnotation();
        __tmp27.setKind(MetaGeneratorSyntaxKind.TemplateControl);
        __tmp27.setFirst(MetaGeneratorLexer.TemplateStatementEnd);
        __tmp27.setLast(MetaGeneratorLexer.TemplateStatementEnd);
        annotList.add(__tmp27);
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

