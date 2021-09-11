/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author Charly Ponce
 */
public class geradorLexico {
 
    public static void geradorLexico(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
    }
    
    public static void main(String[] args){
        String path = "C:\\Users\\pc\\Documents\\NetBeansProjects\\ProjectoCompiladorAnalizadorSintatico\\src\\codigo\\lexer.flex";
        geradorLexico(path);
    }
}
