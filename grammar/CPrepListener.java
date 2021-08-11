// Generated from CPrep.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPrepParser}.
 */
public interface CPrepListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPrepParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CPrepParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CPrepParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#defineDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDefineDeclaration(CPrepParser.DefineDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#defineDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDefineDeclaration(CPrepParser.DefineDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#defineBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefineBlock(CPrepParser.DefineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#defineBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefineBlock(CPrepParser.DefineBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#preprocessorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorDeclaration(CPrepParser.PreprocessorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#preprocessorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorDeclaration(CPrepParser.PreprocessorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclaration(CPrepParser.IncludeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclaration(CPrepParser.IncludeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#pragmaDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDeclaration(CPrepParser.PragmaDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#pragmaDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDeclaration(CPrepParser.PragmaDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CPrepParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CPrepParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(CPrepParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(CPrepParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(CPrepParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(CPrepParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(CPrepParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(CPrepParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CPrepParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CPrepParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(CPrepParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(CPrepParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CPrepParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CPrepParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CPrepParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CPrepParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CPrepParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CPrepParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CPrepParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CPrepParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CPrepParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CPrepParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CPrepParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CPrepParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CPrepParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CPrepParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CPrepParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CPrepParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CPrepParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CPrepParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CPrepParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CPrepParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CPrepParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CPrepParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CPrepParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CPrepParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CPrepParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CPrepParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CPrepParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CPrepParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CPrepParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CPrepParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CPrepParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CPrepParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CPrepParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CPrepParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CPrepParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CPrepParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPrepParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPrepParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(CPrepParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(CPrepParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(CPrepParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(CPrepParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(CPrepParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(CPrepParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CPrepParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CPrepParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CPrepParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CPrepParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CPrepParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CPrepParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CPrepParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CPrepParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(CPrepParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(CPrepParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(CPrepParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(CPrepParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(CPrepParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(CPrepParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CPrepParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CPrepParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(CPrepParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(CPrepParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(CPrepParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(CPrepParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(CPrepParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(CPrepParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CPrepParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CPrepParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(CPrepParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(CPrepParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CPrepParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CPrepParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(CPrepParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(CPrepParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(CPrepParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(CPrepParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CPrepParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CPrepParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CPrepParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CPrepParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(CPrepParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(CPrepParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CPrepParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CPrepParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(CPrepParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(CPrepParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(CPrepParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(CPrepParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(CPrepParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(CPrepParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(CPrepParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(CPrepParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(CPrepParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(CPrepParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(CPrepParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(CPrepParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CPrepParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CPrepParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(CPrepParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(CPrepParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CPrepParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CPrepParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CPrepParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CPrepParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CPrepParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CPrepParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CPrepParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CPrepParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CPrepParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CPrepParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(CPrepParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(CPrepParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(CPrepParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(CPrepParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CPrepParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CPrepParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CPrepParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CPrepParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CPrepParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CPrepParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(CPrepParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(CPrepParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(CPrepParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(CPrepParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(CPrepParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(CPrepParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CPrepParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CPrepParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CPrepParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CPrepParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CPrepParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CPrepParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CPrepParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CPrepParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CPrepParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CPrepParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CPrepParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CPrepParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CPrepParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CPrepParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CPrepParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CPrepParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CPrepParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CPrepParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CPrepParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CPrepParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(CPrepParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(CPrepParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CPrepParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CPrepParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CPrepParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CPrepParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CPrepParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CPrepParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(CPrepParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(CPrepParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CPrepParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CPrepParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CPrepParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CPrepParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPrepParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CPrepParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPrepParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CPrepParser.DeclarationListContext ctx);
}