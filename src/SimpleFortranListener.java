// Generated from SimpleFortran.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleFortranParser}.
 */
public interface SimpleFortranListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleFortranParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleFortranParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimpleFortranParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimpleFortranParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SimpleFortranParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SimpleFortranParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleFortranParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleFortranParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(SimpleFortranParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(SimpleFortranParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#undef_variable}.
	 * @param ctx the parse tree
	 */
	void enterUndef_variable(SimpleFortranParser.Undef_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#undef_variable}.
	 * @param ctx the parse tree
	 */
	void exitUndef_variable(SimpleFortranParser.Undef_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#listspec}.
	 * @param ctx the parse tree
	 */
	void enterListspec(SimpleFortranParser.ListspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#listspec}.
	 * @param ctx the parse tree
	 */
	void exitListspec(SimpleFortranParser.ListspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(SimpleFortranParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(SimpleFortranParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(SimpleFortranParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(SimpleFortranParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#cblock_list}.
	 * @param ctx the parse tree
	 */
	void enterCblock_list(SimpleFortranParser.Cblock_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#cblock_list}.
	 * @param ctx the parse tree
	 */
	void exitCblock_list(SimpleFortranParser.Cblock_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#cblock}.
	 * @param ctx the parse tree
	 */
	void enterCblock(SimpleFortranParser.CblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#cblock}.
	 * @param ctx the parse tree
	 */
	void exitCblock(SimpleFortranParser.CblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(SimpleFortranParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(SimpleFortranParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterVals(SimpleFortranParser.ValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitVals(SimpleFortranParser.ValsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(SimpleFortranParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(SimpleFortranParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(SimpleFortranParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(SimpleFortranParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SimpleFortranParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SimpleFortranParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(SimpleFortranParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(SimpleFortranParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SimpleFortranParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SimpleFortranParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SimpleFortranParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SimpleFortranParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#simple_constant}.
	 * @param ctx the parse tree
	 */
	void enterSimple_constant(SimpleFortranParser.Simple_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#simple_constant}.
	 * @param ctx the parse tree
	 */
	void exitSimple_constant(SimpleFortranParser.Simple_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#complex_constant}.
	 * @param ctx the parse tree
	 */
	void enterComplex_constant(SimpleFortranParser.Complex_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#complex_constant}.
	 * @param ctx the parse tree
	 */
	void exitComplex_constant(SimpleFortranParser.Complex_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SimpleFortranParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SimpleFortranParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(SimpleFortranParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(SimpleFortranParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SimpleFortranParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SimpleFortranParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleFortranParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleFortranParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(SimpleFortranParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(SimpleFortranParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleFortranParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleFortranParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SimpleFortranParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SimpleFortranParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SimpleFortranParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SimpleFortranParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleFortranParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleFortranParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#listexpression}.
	 * @param ctx the parse tree
	 */
	void enterListexpression(SimpleFortranParser.ListexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#listexpression}.
	 * @param ctx the parse tree
	 */
	void exitListexpression(SimpleFortranParser.ListexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(SimpleFortranParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(SimpleFortranParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLabels(SimpleFortranParser.LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLabels(SimpleFortranParser.LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SimpleFortranParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SimpleFortranParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#subroutine_call}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_call(SimpleFortranParser.Subroutine_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#subroutine_call}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_call(SimpleFortranParser.Subroutine_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement(SimpleFortranParser.Io_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement(SimpleFortranParser.Io_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#read_list}.
	 * @param ctx the parse tree
	 */
	void enterRead_list(SimpleFortranParser.Read_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#read_list}.
	 * @param ctx the parse tree
	 */
	void exitRead_list(SimpleFortranParser.Read_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#read_item}.
	 * @param ctx the parse tree
	 */
	void enterRead_item(SimpleFortranParser.Read_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#read_item}.
	 * @param ctx the parse tree
	 */
	void exitRead_item(SimpleFortranParser.Read_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#iter_space}.
	 * @param ctx the parse tree
	 */
	void enterIter_space(SimpleFortranParser.Iter_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#iter_space}.
	 * @param ctx the parse tree
	 */
	void exitIter_space(SimpleFortranParser.Iter_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(SimpleFortranParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(SimpleFortranParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#write_list}.
	 * @param ctx the parse tree
	 */
	void enterWrite_list(SimpleFortranParser.Write_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#write_list}.
	 * @param ctx the parse tree
	 */
	void exitWrite_list(SimpleFortranParser.Write_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#write_item}.
	 * @param ctx the parse tree
	 */
	void enterWrite_item(SimpleFortranParser.Write_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#write_item}.
	 * @param ctx the parse tree
	 */
	void exitWrite_item(SimpleFortranParser.Write_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(SimpleFortranParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(SimpleFortranParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(SimpleFortranParser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(SimpleFortranParser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(SimpleFortranParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(SimpleFortranParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(SimpleFortranParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(SimpleFortranParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void enterSubprograms(SimpleFortranParser.SubprogramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void exitSubprograms(SimpleFortranParser.SubprogramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram(SimpleFortranParser.SubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram(SimpleFortranParser.SubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SimpleFortranParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SimpleFortranParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFortranParser#formal_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameters(SimpleFortranParser.Formal_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFortranParser#formal_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameters(SimpleFortranParser.Formal_parametersContext ctx);
}