/*
    Gkountelos Dimitrios, AEM: 3663
    email: gkounted@csd.auth.gr
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Visitor extends SimpleFortranBaseListener{
    public String last_data_type;
    public String last_subprogram_type;
    public String last_function_return_type;
    public String last_scope;
    int function_count = 0;
    int subroutine_count = 0;
    public ArrayList<String> int_variables = new ArrayList<>();
    public ArrayList<String> string_variables = new ArrayList<>();
    public ArrayList<String> real_variables = new ArrayList<>();
    public ArrayList<String> logical_variables = new ArrayList<>();
    public ArrayList<String> char_variables = new ArrayList<>();
    public ArrayList<String> complex_variables = new ArrayList<>();
    public HashMap<String, String> common_variables = new HashMap<>(); // name, region
    public HashMap<String, String> redeclared_vars = new HashMap<>();
    public ArrayList<String> function_names = new ArrayList<>();
    public List<List<String>> function_params = new ArrayList<>();
    public ArrayList<String> subroutine_names = new ArrayList<>();
    public List<List<String>> subroutine_params = new ArrayList<>();
    public ArrayList<String> params = new ArrayList<>();

    /*
        ### VARIABLES ###
     */
    public void exitDeclarations(SimpleFortranParser.DeclarationsContext ctx) {
        this.last_scope = "local" ;
    }

    public void enterUndef_variable(SimpleFortranParser.Undef_variableContext ctx) {
        switch (this.last_data_type) {
            case "string":
                if (string_variables.contains(ctx.getText())) {
                    redeclared_vars.put("string", ctx.getText());
                }
                this.string_variables.add(ctx.getText());
                break;
            case "integer":
                if (int_variables.contains(ctx.getText())) {
                    redeclared_vars.put("integer", ctx.getText());
                }
                this.int_variables.add(ctx.getText());
                break;
            case "real":
                if (real_variables.contains(ctx.getText())) {
                    redeclared_vars.put("real", ctx.getText());
                }
                this.real_variables.add(ctx.getText());
                break;
            case "logical":
                if (logical_variables.contains(ctx.getText())) {
                    redeclared_vars.put("logical", ctx.getText());
                }
                this.logical_variables.add(ctx.getText());
                break;
            case "character":
                if (char_variables.contains(ctx.getText())) {
                    redeclared_vars.put("character", ctx.getText());
                }
                this.char_variables.add(ctx.getText());
                break;
            case "complex":
                if (complex_variables.contains(ctx.getText())) {
                    redeclared_vars.put("complex", ctx.getText());
                }
                this.complex_variables.add(ctx.getText());
                break;
        }
    }

    public void enterType(SimpleFortranParser.TypeContext ctx) {
        this.last_data_type = ctx.getText();
    }

    public void enterCblock(SimpleFortranParser.CblockContext ctx) {
        this.last_scope = ctx.ID().getText();
    }

    public void enterId_list(SimpleFortranParser.Id_listContext ctx) {
        this.common_variables.put(ctx.ID().getText(), this.last_scope);
    }


    /*
        ### FUNCTIONS  AND SUBROUTINES ###
     */
    public void enterHeader(SimpleFortranParser.HeaderContext ctx) {
        String header = ctx.getText(); // all the header
        // subprogram type is by default: function
        // if subroutine is found, it changes
        this.last_subprogram_type = "function";
        this.function_count += 1;

        switch (header.substring(0, 4)) {
            case "real":
                this.last_function_return_type = "real";
                break;
            case "inte":
                this.last_function_return_type = "integer";
                break;
            case "subr":
                this.last_subprogram_type = "subroutine";
                this.function_count -= 1;
                this.subroutine_count += 1;
                break;
            case "logi":
                this.last_function_return_type = "logical";
                break;
            case "char":
                this.last_function_return_type = "character";
                break;
            case "comp":
                this.last_function_return_type = "complex";
                break;
            case "stri":
                this.last_function_return_type = "string";
                break;
        }

        if (this.last_subprogram_type.equals("function")) {
            this.function_names.add(ctx.ID().getText());
        }
        else {
            this.subroutine_names.add(ctx.ID().getText());
        }
    }

    public void enterFormal_parameters(SimpleFortranParser.Formal_parametersContext ctx) {
        if (this.last_subprogram_type.equals("function") && this.params.isEmpty()) {
            this.params.add(this.last_function_return_type);
        }

        if (!ctx.vars().undef_variable().getText().isEmpty()) {
            this.params.add(ctx.type().getText() + "    " +
                    ctx.vars().undef_variable().getText()); // data type + parameter name
        }
    }

    public void exitFormal_parameters(SimpleFortranParser.Formal_parametersContext ctx) {
        if (this.params.isEmpty()) {
            return;
        }

        if (this.last_subprogram_type.equals("function")) {
            this.function_params.add(List.copyOf(this.params));
        }
        else {
            this.subroutine_params.add(List.copyOf(this.params));
        }

        this.params.clear();
    }

    public void exitHeader(SimpleFortranParser.HeaderContext ctx) {
        if ((!ctx.ID().getText().contains("(")) && (!last_subprogram_type.equals("function"))) {
            this.subroutine_params.add(Collections.singletonList("None"));
        }
    }
}