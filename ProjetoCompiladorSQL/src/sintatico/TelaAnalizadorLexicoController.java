package sintatico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class TelaAnalizadorLexicoController implements Initializable {

    @FXML private TextField txtCodigo;
    @FXML private TextArea txtArea;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleProcEntrada(MouseEvent event) {
        File arquivo = new File("arquivo.txt");
        PrintWriter escrever;
        try {
            escrever = new PrintWriter(arquivo);
            escrever.print(txtCodigo.getText());
            escrever.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lexico.TelaAnalizadorLexicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Reader leitor;
        try {
            leitor = new BufferedReader(new FileReader("arquivo.txt"));
            System.out.println("");
            parser p = new parser(new Yylex(leitor));
            p.parse();
            
            parser parse = new parser();
            
            if(p.EOF_sym()==1){
                txtArea.setText("Erro sintatico na sentença");
            }else{
                txtArea.setText("Sentença analisadas corretamente, sem erros");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lexico.TelaAnalizadorLexicoController.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (Exception ex) {
            Logger.getLogger(TelaAnalizadorLexicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleLimpar(MouseEvent event) {
        txtArea.setText("");
        txtCodigo.setText("");
    }
    
}
