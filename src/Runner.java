/*
    Gkountelos Dimitrios, AEM: 3663
    email: gkounted@csd.auth.gr
 */

// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Runner extends Visitor{
    public static void main(String[] args) throws Exception {
        // get input from file input1.f
        CharStream cs = fromFileName("test4_ok.f");

        // create a lexer that feeds off of input CharStream
        SimpleFortranLexer lexer = new SimpleFortranLexer(cs);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        SimpleFortranParser parser = new SimpleFortranParser(tokens);
        // begin parsing at init rule
        ParseTree tree = parser.program();
        // print LISP-style tree
        System.out.println(tree.toStringTree(parser));

        Visitor v = new Visitor();
        ParseTreeWalker walker = new ParseTreeWalker();

        // traverse the tree
        walker.walk(v, tree);

        System.out.println("    ### VARIABLES ### ");
        System.out.println("Variables in common regions:");
        for (String i : v.common_variables.keySet()) {
            System.out.println("Variable:    " + i + "   Region:   " +
                    v.common_variables.get(i) + "   Scope:  Global");
        }

        int spaces = 0;
        System.out.println("\nLocal variables - not in common regions");
        for (String i : v.int_variables) {
            System.out.print("Integer     " + i);
            spaces = 20 - i.length();
            String s = String.format("%1$"+spaces+"s", "");
            System.out.print(s + "Scope:   Local\n");
        }
        System.out.println("");

        for (String i : v.logical_variables) {
            System.out.print("Logical     " + i);
            spaces = 20 - i.length();
            String s = String.format("%1$"+spaces+"s", "");
            System.out.print(s + "Scope:   Local\n");
        }
        System.out.println("");

        for (String i : v.string_variables) {
            System.out.print("String     " + i);
            spaces = 20 - i.length();
            String s = String.format("%1$"+spaces+"s", "");
            System.out.print(s + "Scope:   Local\n");
        }
        System.out.println("");

        for (String i : v.real_variables) {
            System.out.print("Real       " + i);
            spaces = 20 - i.length();
            String s = String.format("%1$"+spaces+"s", "");
            System.out.print(s + "Scope:   Local\n");
        }
        System.out.println("");

        for (String i : v.char_variables) {
            System.out.print("Character     " + i);
            spaces = 20 - i.length();
            String s = String.format("%1$"+spaces+"s", "");
            System.out.print(s + "Scope:   Local\n");
        }

        for (String i : v.complex_variables) {
            System.out.print("Complex     " + i);
            spaces = 20 - i.length();
            String s = String.format("%1$"+spaces+"s", "");
            System.out.print(s + "Scope:   Local\n");
        }

        System.out.println("\n    ### FUNCTIONS ###");
        for (int i = 0; i < v.function_names.size(); i++) {
            System.out.println("\nFunction: " + v.function_names.get(i));
            System.out.println("Return type: " + v.function_params.get(i).get(0));
            System.out.println("Parameters: ");
            for (int j = 1; j < v.function_params.get(i).size(); j++) {
                System.out.println("        " + v.function_params.get(i).get(j));
            }
        }

        System.out.println("\n    ### SUBROUTINES ###");
        for (int i = 0; i < v.subroutine_names.size(); i++) {
            System.out.println("\nSubroutine: " + v.subroutine_names.get(i));
            System.out.println("Parameters:");

            for (int j = 0; j < v.subroutine_params.get(i).size(); j++) {
                System.out.println("        " + v.subroutine_params.get(i).get(j));
            }
        }

        System.out.println("\n### ERRORS ###\n");
        for (String i : v.redeclared_vars.keySet()) {
            System.out.println("Redeclaration of " + i + "  variable: " + v.redeclared_vars.get(i));
        }
    }
}