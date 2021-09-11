package lexico;

import java.io.File;

/**
 *
 * @author Simão Moreno
 * @author Cristopher Andrade
 * 
 */
public class geradorLexico {
 
    public static void geradorLexico(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
    }
    
    public static void main(String[] args){
        String path = "C:\\Users\\pc\\Documents\\NetBeansProjects\\ProjetoCompiladorSQL\\src\\lexico\\lexer.flex";
        geradorLexico(path);
    }
}
