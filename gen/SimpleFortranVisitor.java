// Generated from /home/dimitris/IdeaProjects/Project/src/SimpleFortran.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleFortranParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleFortranVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleFortranParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SimpleFortranParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SimpleFortranParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleFortranParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(SimpleFortranParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#undef_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_variable(SimpleFortranParser.Undef_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#listspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListspec(SimpleFortranParser.ListspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(SimpleFortranParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(SimpleFortranParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#cblock_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCblock_list(SimpleFortranParser.Cblock_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#cblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCblock(SimpleFortranParser.CblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(SimpleFortranParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(SimpleFortranParser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(SimpleFortranParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SimpleFortranParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SimpleFortranParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(SimpleFortranParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SimpleFortranParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SimpleFortranParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_constant(SimpleFortranParser.Simple_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#complex_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_constant(SimpleFortranParser.Complex_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SimpleFortranParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(SimpleFortranParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SimpleFortranParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleFortranParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(SimpleFortranParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleFortranParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SimpleFortranParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SimpleFortranParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleFortranParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#listexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListexpression(SimpleFortranParser.ListexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(SimpleFortranParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels(SimpleFortranParser.LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SimpleFortranParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_call(SimpleFortranParser.Subroutine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#io_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo_statement(SimpleFortranParser.Io_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#read_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_list(SimpleFortranParser.Read_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#read_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_item(SimpleFortranParser.Read_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#iter_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_space(SimpleFortranParser.Iter_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(SimpleFortranParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#write_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_list(SimpleFortranParser.Write_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#write_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_item(SimpleFortranParser.Write_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(SimpleFortranParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(SimpleFortranParser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(SimpleFortranParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SimpleFortranParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#subprograms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprograms(SimpleFortranParser.SubprogramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram(SimpleFortranParser.SubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SimpleFortranParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortranParser#formal_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameters(SimpleFortranParser.Formal_parametersContext ctx);
}