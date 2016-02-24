package metadslx.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.IModelCompiler;
import metadslx.core.ModelCompilerContext;
import metadslx.compiler.*;

public class MetaGeneratorParserAnnotator extends MetaGeneratorParserBaseVisitor<Object>
{
    private MetaGeneratorLexerAnnotator lexerAnnotator = new MetaGeneratorLexerAnnotator();
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Class, List<Object>> ruleAnnotations = new HashMap<>();
    private Map<Object, List<Object>> treeAnnotations = new HashMap<>();
    
    public List<Object> getParserAnnotations() { return this.grammarAnnotations; }
    public List<Object> getLexerAnnotations() { return this.lexerAnnotator.getLexerAnnotations(); }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.lexerAnnotator.getTokenAnnotations(); }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.lexerAnnotator.getModeAnnotations(); }
    public Map<Class, List<Object>> getRuleAnnotations() { return this.ruleAnnotations; }
    public Map<Object, List<Object>> getTreeAnnotations() { return this.treeAnnotations; }
    
    
    public MetaGeneratorParserAnnotator()
    {
        List<Object> annotList = null;
    }
    
    public Object visitTerminal(TerminalNode node)
    {
        this.lexerAnnotator.visitTerminal(node, treeAnnotations);
        this.handleSymbolType(node);
        return null;
    }
    
    private void handleSymbolType(ParseTree node)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(node);
        if (treeAnnotList != null)
        {
            for (Object treeAnnot: treeAnnotList)
            {
                if (treeAnnot instanceof SymbolTypeAnnotation)
                {
                    SymbolTypeAnnotation sta = (SymbolTypeAnnotation)treeAnnot;
                    if (sta.hasName())
                    {
                        ModelCompilerContext.requireContext();
                        IModelCompiler compiler = ModelCompilerContext.current();
                        String name = compiler.getNameProvider().getName(node);
                        if (sta.getName() == name)
                        {
                            this.overrideSymbolType(node, sta.getSymbolType());
                        }
                    }
                    else
                    {
                        this.overrideSymbolType(node, sta.getSymbolType());
                    }
                }
            }
            treeAnnotList.removeIf(a -> a instanceof SymbolTypeAnnotation);
        }
    }
    
    private void overrideSymbolType(ParseTree node, Class symbolType)
    {
        if (node == null) return;
        if (symbolType == null) return;
        boolean set = false;
        while(!set && node != null)
        {
            List<Object> treeAnnotList = this.treeAnnotations.get(node);
            if (treeAnnotList != null)
            {
                for (Object treeAnnot: treeAnnotList)
                {
                    if (treeAnnot instanceof SymbolBasedAnnotation)
                    {
                        SymbolBasedAnnotation sta = (SymbolBasedAnnotation)treeAnnot;
                        set = true;
                        if (sta.getSymbolType() == null)
                        {
                            sta.setSymbolType(symbolType);
                        }
                        else if (sta.overrideSymbolType())
                        {
                            sta.setSymbolType(symbolType);
                        }
                        else
                        {
                            throw new IllegalStateException("Cannot change symbol type from '"+sta.getSymbolType()+"' to '"+symbolType+"'");
                        }
                    }
                }
            }
            node = node.getParent();
        }
    }
    
    @Override
    public Object visitMain(MetaGeneratorParser.MainContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMain(ctx);
    }
    
    @Override
    public Object visitNamespaceDeclaration(MetaGeneratorParser.NamespaceDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNamespaceDeclaration(ctx);
    }
    
    @Override
    public Object visitGeneratorDeclaration(MetaGeneratorParser.GeneratorDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitGeneratorDeclaration(ctx);
    }
    
    @Override
    public Object visitUsingNamespaceDeclaration(MetaGeneratorParser.UsingNamespaceDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitUsingNamespaceDeclaration(ctx);
    }
    
    @Override
    public Object visitUsingGeneratorDeclaration(MetaGeneratorParser.UsingGeneratorDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitUsingGeneratorDeclaration(ctx);
    }
    
    @Override
    public Object visitConfigDeclaration(MetaGeneratorParser.ConfigDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitConfigDeclaration(ctx);
    }
    
    @Override
    public Object visitConfigPropertyDeclaration(MetaGeneratorParser.ConfigPropertyDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitConfigPropertyDeclaration(ctx);
    }
    
    @Override
    public Object visitConfigPropertyGroupDeclaration(MetaGeneratorParser.ConfigPropertyGroupDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitConfigPropertyGroupDeclaration(ctx);
    }
    
    @Override
    public Object visitMethodDeclaration(MetaGeneratorParser.MethodDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMethodDeclaration(ctx);
    }
    
    @Override
    public Object visitFunctionDeclaration(MetaGeneratorParser.FunctionDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitFunctionDeclaration(ctx);
    }
    
    @Override
    public Object visitFunctionSignature(MetaGeneratorParser.FunctionSignatureContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitFunctionSignature(ctx);
    }
    
    @Override
    public Object visitParamList(MetaGeneratorParser.ParamListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitParamList(ctx);
    }
    
    @Override
    public Object visitParameter(MetaGeneratorParser.ParameterContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitParameter(ctx);
    }
    
    @Override
    public Object visitBody(MetaGeneratorParser.BodyContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBody(ctx);
    }
    
    @Override
    public Object visitStatement(MetaGeneratorParser.StatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitStatement(ctx);
    }
    
    @Override
    public Object visitVariableDeclarationStatement(MetaGeneratorParser.VariableDeclarationStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitVariableDeclarationStatement(ctx);
    }
    
    @Override
    public Object visitReturnStatement(MetaGeneratorParser.ReturnStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitReturnStatement(ctx);
    }
    
    @Override
    public Object visitExpressionStatement(MetaGeneratorParser.ExpressionStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionStatement(ctx);
    }
    
    @Override
    public Object visitIfStatement(MetaGeneratorParser.IfStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIfStatement(ctx);
    }
    
    @Override
    public Object visitIfStatementBegin(MetaGeneratorParser.IfStatementBeginContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIfStatementBegin(ctx);
    }
    
    @Override
    public Object visitElseIfStatement(MetaGeneratorParser.ElseIfStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitElseIfStatement(ctx);
    }
    
    @Override
    public Object visitIfStatementElse(MetaGeneratorParser.IfStatementElseContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIfStatementElse(ctx);
    }
    
    @Override
    public Object visitIfStatementEnd(MetaGeneratorParser.IfStatementEndContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIfStatementEnd(ctx);
    }
    
    @Override
    public Object visitLoopStatement(MetaGeneratorParser.LoopStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopStatement(ctx);
    }
    
    @Override
    public Object visitLoopStatementBegin(MetaGeneratorParser.LoopStatementBeginContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopStatementBegin(ctx);
    }
    
    @Override
    public Object visitLoopStatementEnd(MetaGeneratorParser.LoopStatementEndContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopStatementEnd(ctx);
    }
    
    @Override
    public Object visitLoopChain(MetaGeneratorParser.LoopChainContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopChain(ctx);
    }
    
    @Override
    public Object visitLoopChainItem(MetaGeneratorParser.LoopChainItemContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopChainItem(ctx);
    }
    
    @Override
    public Object visitLoopChainTypeofExpression(MetaGeneratorParser.LoopChainTypeofExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopChainTypeofExpression(ctx);
    }
    
    @Override
    public Object visitLoopChainIdentifierExpression(MetaGeneratorParser.LoopChainIdentifierExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopChainIdentifierExpression(ctx);
    }
    
    @Override
    public Object visitLoopChainMemberAccessExpression(MetaGeneratorParser.LoopChainMemberAccessExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopChainMemberAccessExpression(ctx);
    }
    
    @Override
    public Object visitLoopChainMethodCallExpression(MetaGeneratorParser.LoopChainMethodCallExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopChainMethodCallExpression(ctx);
    }
    
    @Override
    public Object visitLoopWhereExpression(MetaGeneratorParser.LoopWhereExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopWhereExpression(ctx);
    }
    
    @Override
    public Object visitLoopRunExpression(MetaGeneratorParser.LoopRunExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopRunExpression(ctx);
    }
    
    @Override
    public Object visitLoopRunList(MetaGeneratorParser.LoopRunListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopRunList(ctx);
    }
    
    @Override
    public Object visitLoopRun(MetaGeneratorParser.LoopRunContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLoopRun(ctx);
    }
    
    @Override
    public Object visitSwitchStatement(MetaGeneratorParser.SwitchStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchStatement(ctx);
    }
    
    @Override
    public Object visitSwitchStatementBegin(MetaGeneratorParser.SwitchStatementBeginContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchStatementBegin(ctx);
    }
    
    @Override
    public Object visitSwitchStatementEnd(MetaGeneratorParser.SwitchStatementEndContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchStatementEnd(ctx);
    }
    
    @Override
    public Object visitSwitchBranchStatement(MetaGeneratorParser.SwitchBranchStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchBranchStatement(ctx);
    }
    
    @Override
    public Object visitSwitchBranchHeadStatement(MetaGeneratorParser.SwitchBranchHeadStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchBranchHeadStatement(ctx);
    }
    
    @Override
    public Object visitSwitchCaseOrTypeIsHeadStatement(MetaGeneratorParser.SwitchCaseOrTypeIsHeadStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchCaseOrTypeIsHeadStatement(ctx);
    }
    
    @Override
    public Object visitSwitchCaseHeadStatement(MetaGeneratorParser.SwitchCaseHeadStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchCaseHeadStatement(ctx);
    }
    
    @Override
    public Object visitSwitchTypeIsHeadStatement(MetaGeneratorParser.SwitchTypeIsHeadStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchTypeIsHeadStatement(ctx);
    }
    
    @Override
    public Object visitSwitchTypeAsHeadStatement(MetaGeneratorParser.SwitchTypeAsHeadStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchTypeAsHeadStatement(ctx);
    }
    
    @Override
    public Object visitSwitchDefaultStatement(MetaGeneratorParser.SwitchDefaultStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchDefaultStatement(ctx);
    }
    
    @Override
    public Object visitSwitchDefaultHeadStatement(MetaGeneratorParser.SwitchDefaultHeadStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSwitchDefaultHeadStatement(ctx);
    }
    
    @Override
    public Object visitTemplateDeclaration(MetaGeneratorParser.TemplateDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateDeclaration(ctx);
    }
    
    @Override
    public Object visitTemplateSignature(MetaGeneratorParser.TemplateSignatureContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateSignature(ctx);
    }
    
    @Override
    public Object visitTemplateBody(MetaGeneratorParser.TemplateBodyContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateBody(ctx);
    }
    
    @Override
    public Object visitTemplateContentLine(MetaGeneratorParser.TemplateContentLineContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateContentLine(ctx);
    }
    
    @Override
    public Object visitTemplateOutput(MetaGeneratorParser.TemplateOutputContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateOutput(ctx);
    }
    
    @Override
    public Object visitTemplateLineEnd(MetaGeneratorParser.TemplateLineEndContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateLineEnd(ctx);
    }
    
    @Override
    public Object visitTemplateStatementStartEnd(MetaGeneratorParser.TemplateStatementStartEndContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateStatementStartEnd(ctx);
    }
    
    @Override
    public Object visitTemplateStatement(MetaGeneratorParser.TemplateStatementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTemplateStatement(ctx);
    }
    
    @Override
    public Object visitTypeArgumentList(MetaGeneratorParser.TypeArgumentListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeArgumentList(ctx);
    }
    
    @Override
    public Object visitPredefinedType(MetaGeneratorParser.PredefinedTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPredefinedType(ctx);
    }
    
    @Override
    public Object visitTypeReferenceList(MetaGeneratorParser.TypeReferenceListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeReferenceList(ctx);
    }
    
    @Override
    public Object visitTypeReference(MetaGeneratorParser.TypeReferenceContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeReference(ctx);
    }
    
    @Override
    public Object visitArrayType(MetaGeneratorParser.ArrayTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitArrayType(ctx);
    }
    
    @Override
    public Object visitNullableType(MetaGeneratorParser.NullableTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNullableType(ctx);
    }
    
    @Override
    public Object visitGenericType(MetaGeneratorParser.GenericTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitGenericType(ctx);
    }
    
    @Override
    public Object visitSimpleType(MetaGeneratorParser.SimpleTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSimpleType(ctx);
    }
    
    @Override
    public Object visitVoidType(MetaGeneratorParser.VoidTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitVoidType(ctx);
    }
    
    @Override
    public Object visitReturnType(MetaGeneratorParser.ReturnTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitReturnType(ctx);
    }
    
    @Override
    public Object visitExpressionList(MetaGeneratorParser.ExpressionListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionList(ctx);
    }
    
    @Override
    public Object visitVariableReference(MetaGeneratorParser.VariableReferenceContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitVariableReference(ctx);
    }
    
    @Override
    public Object visitRankSpecifiers(MetaGeneratorParser.RankSpecifiersContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRankSpecifiers(ctx);
    }
    
    @Override
    public Object visitRankSpecifier(MetaGeneratorParser.RankSpecifierContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRankSpecifier(ctx);
    }
    
    @Override
    public Object visitUnboundTypeName(MetaGeneratorParser.UnboundTypeNameContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitUnboundTypeName(ctx);
    }
    
    @Override
    public Object visitGenericDimensionSpecifier(MetaGeneratorParser.GenericDimensionSpecifierContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitGenericDimensionSpecifier(ctx);
    }
    
    @Override
    public Object visitExplicitAnonymousFunctionSignature(MetaGeneratorParser.ExplicitAnonymousFunctionSignatureContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExplicitAnonymousFunctionSignature(ctx);
    }
    
    @Override
    public Object visitImplicitAnonymousFunctionSignature(MetaGeneratorParser.ImplicitAnonymousFunctionSignatureContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitImplicitAnonymousFunctionSignature(ctx);
    }
    
    @Override
    public Object visitSingleParamAnonymousFunctionSignature(MetaGeneratorParser.SingleParamAnonymousFunctionSignatureContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSingleParamAnonymousFunctionSignature(ctx);
    }
    
    @Override
    public Object visitExplicitParameter(MetaGeneratorParser.ExplicitParameterContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExplicitParameter(ctx);
    }
    
    @Override
    public Object visitImplicitParameter(MetaGeneratorParser.ImplicitParameterContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitImplicitParameter(ctx);
    }
    
    @Override
    public Object visitThisExpression(MetaGeneratorParser.ThisExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitThisExpression(ctx);
    }
    
    @Override
    public Object visitLiteralExpression(MetaGeneratorParser.LiteralExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLiteralExpression(ctx);
    }
    
    @Override
    public Object visitTypeofVoidExpression(MetaGeneratorParser.TypeofVoidExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeofVoidExpression(ctx);
    }
    
    @Override
    public Object visitTypeofUnboundTypeExpression(MetaGeneratorParser.TypeofUnboundTypeExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeofUnboundTypeExpression(ctx);
    }
    
    @Override
    public Object visitTypeofTypeExpression(MetaGeneratorParser.TypeofTypeExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypeofTypeExpression(ctx);
    }
    
    @Override
    public Object visitDefaultValueExpression(MetaGeneratorParser.DefaultValueExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDefaultValueExpression(ctx);
    }
    
    @Override
    public Object visitNewObjectOrCollectionWithConstructorExpression(MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNewObjectOrCollectionWithConstructorExpression(ctx);
    }
    
    @Override
    public Object visitIdentifierExpression(MetaGeneratorParser.IdentifierExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifierExpression(ctx);
    }
    
    @Override
    public Object visitHasLoopExpression(MetaGeneratorParser.HasLoopExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitHasLoopExpression(ctx);
    }
    
    @Override
    public Object visitParenthesizedExpression(MetaGeneratorParser.ParenthesizedExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitParenthesizedExpression(ctx);
    }
    
    @Override
    public Object visitElementAccessExpression(MetaGeneratorParser.ElementAccessExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitElementAccessExpression(ctx);
    }
    
    @Override
    public Object visitFunctionCallExpression(MetaGeneratorParser.FunctionCallExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitFunctionCallExpression(ctx);
    }
    
    @Override
    public Object visitPredefinedTypeMemberAccessExpression(MetaGeneratorParser.PredefinedTypeMemberAccessExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPredefinedTypeMemberAccessExpression(ctx);
    }
    
    @Override
    public Object visitMemberAccessExpression(MetaGeneratorParser.MemberAccessExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMemberAccessExpression(ctx);
    }
    
    @Override
    public Object visitTypecastExpression(MetaGeneratorParser.TypecastExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypecastExpression(ctx);
    }
    
    @Override
    public Object visitUnaryExpression(MetaGeneratorParser.UnaryExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitUnaryExpression(ctx);
    }
    
    @Override
    public Object visitPostExpression(MetaGeneratorParser.PostExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPostExpression(ctx);
    }
    
    @Override
    public Object visitMultiplicationExpression(MetaGeneratorParser.MultiplicationExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMultiplicationExpression(ctx);
    }
    
    @Override
    public Object visitAdditionExpression(MetaGeneratorParser.AdditionExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAdditionExpression(ctx);
    }
    
    @Override
    public Object visitRelationalExpression(MetaGeneratorParser.RelationalExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRelationalExpression(ctx);
    }
    
    @Override
    public Object visitTypecheckExpression(MetaGeneratorParser.TypecheckExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTypecheckExpression(ctx);
    }
    
    @Override
    public Object visitEqualityExpression(MetaGeneratorParser.EqualityExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEqualityExpression(ctx);
    }
    
    @Override
    public Object visitBitwiseAndExpression(MetaGeneratorParser.BitwiseAndExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBitwiseAndExpression(ctx);
    }
    
    @Override
    public Object visitBitwiseXorExpression(MetaGeneratorParser.BitwiseXorExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBitwiseXorExpression(ctx);
    }
    
    @Override
    public Object visitBitwiseOrExpression(MetaGeneratorParser.BitwiseOrExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBitwiseOrExpression(ctx);
    }
    
    @Override
    public Object visitLogicalAndExpression(MetaGeneratorParser.LogicalAndExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLogicalAndExpression(ctx);
    }
    
    @Override
    public Object visitLogicalXorExpression(MetaGeneratorParser.LogicalXorExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLogicalXorExpression(ctx);
    }
    
    @Override
    public Object visitLogicalOrExpression(MetaGeneratorParser.LogicalOrExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLogicalOrExpression(ctx);
    }
    
    @Override
    public Object visitConditionalExpression(MetaGeneratorParser.ConditionalExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitConditionalExpression(ctx);
    }
    
    @Override
    public Object visitAssignmentExpression(MetaGeneratorParser.AssignmentExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAssignmentExpression(ctx);
    }
    
    @Override
    public Object visitLambdaExpression(MetaGeneratorParser.LambdaExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLambdaExpression(ctx);
    }
    
    @Override
    public Object visitQualifiedName(MetaGeneratorParser.QualifiedNameContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitQualifiedName(ctx);
    }
    
    @Override
    public Object visitIdentifierList(MetaGeneratorParser.IdentifierListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifierList(ctx);
    }
    
    @Override
    public Object visitIdentifier(MetaGeneratorParser.IdentifierContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifier(ctx);
    }
    
    @Override
    public Object visitLiteral(MetaGeneratorParser.LiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLiteral(ctx);
    }
    
    @Override
    public Object visitNullLiteral(MetaGeneratorParser.NullLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNullLiteral(ctx);
    }
    
    @Override
    public Object visitBooleanLiteral(MetaGeneratorParser.BooleanLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBooleanLiteral(ctx);
    }
    
    @Override
    public Object visitNumberLiteral(MetaGeneratorParser.NumberLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNumberLiteral(ctx);
    }
    
    @Override
    public Object visitIntegerLiteral(MetaGeneratorParser.IntegerLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIntegerLiteral(ctx);
    }
    
    @Override
    public Object visitDecimalLiteral(MetaGeneratorParser.DecimalLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDecimalLiteral(ctx);
    }
    
    @Override
    public Object visitScientificLiteral(MetaGeneratorParser.ScientificLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitScientificLiteral(ctx);
    }
    
    @Override
    public Object visitDateOrTimeLiteral(MetaGeneratorParser.DateOrTimeLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDateOrTimeLiteral(ctx);
    }
    
    @Override
    public Object visitDateTimeOffsetLiteral(MetaGeneratorParser.DateTimeOffsetLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDateTimeOffsetLiteral(ctx);
    }
    
    @Override
    public Object visitDateTimeLiteral(MetaGeneratorParser.DateTimeLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDateTimeLiteral(ctx);
    }
    
    @Override
    public Object visitDateLiteral(MetaGeneratorParser.DateLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDateLiteral(ctx);
    }
    
    @Override
    public Object visitTimeLiteral(MetaGeneratorParser.TimeLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTimeLiteral(ctx);
    }
    
    @Override
    public Object visitCharLiteral(MetaGeneratorParser.CharLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitCharLiteral(ctx);
    }
    
    @Override
    public Object visitStringLiteral(MetaGeneratorParser.StringLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitStringLiteral(ctx);
    }
    
    @Override
    public Object visitGuidLiteral(MetaGeneratorParser.GuidLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitGuidLiteral(ctx);
    }
}

