package sintatico;

import java.io.File;

/**
 *
 * @author pc
 */
public class geralexer {
    
    public static void geradorLexico(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
    }
    
    public static void main(String[] args){
        String path = "C:\\Users\\pc\\Documents\\NetBeansProjects\\ProjetoCompiladorSQL\\src\\sintatico\\lexer.flex";
        geradorLexico(path);
    }
}
