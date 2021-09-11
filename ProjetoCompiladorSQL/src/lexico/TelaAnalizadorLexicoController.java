package lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        // TODO add your handling code here:
        File arquivo = new File("arquivo.txt");
        PrintWriter escrever;
        try {
            escrever = new PrintWriter(arquivo);
            escrever.print(txtCodigo.getText());
            escrever.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaAnalizadorLexicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Reader leitor;
        try {
            leitor = new BufferedReader(new FileReader("arquivo.txt"));
            Lexer lexer = new Lexer(leitor);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIM";
                    txtArea.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERRO:
                        resultado += "Simbolo não definido\n";
                        break;
                    case SELECT: case FROM: case WHERE: case ORDER: case BY: case VIRGULA: case PONTO_E_VIRGULA: case IGUAL: case TODOS:
                        resultado += lexer.lexeme + ": É um " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaAnalizadorLexicoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaAnalizadorLexicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void handleLimpar(MouseEvent event) {
        txtArea.setText("");
        txtCodigo.setText("");
    }
    
}
