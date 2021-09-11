

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Simão Moreno
 * @author Cristopher Andrade
 */
public class TelaPrincipalController implements Initializable {

    @FXML
    private BorderPane borderpane;
    @FXML
    private Button botaoLexico;
    @FXML
    private Button botaoSintatico;
    @FXML
    private Button botaoSobre;

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
    private void handleAnalizadorLexico(MouseEvent event) {
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/lexico/TelaAnalizadorLexico.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderpane.setCenter(root);
        botaoLexico.setStyle("-fx-background-color: #214c92; -fx-text-fill: #ffffff;");
        botaoSintatico.setStyle("-fx-background-color: transparent; -fx-text-fill: #f0f0f0;");
        botaoSobre.setStyle("-fx-background-color: transparent; -fx-text-fill: #f0f0f0;");
    }

    @FXML
    private void handleAnalizadorSintatico(MouseEvent event) {
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/sintatico/TelaAnalizadorSintatico.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderpane.setCenter(root);
        botaoSintatico.setStyle("-fx-background-color: #214c92; -fx-text-fill: #ffffff;");
        botaoLexico.setStyle("-fx-background-color: transparent; -fx-text-fill: #f0f0f0;");
        botaoSobre.setStyle("-fx-background-color: transparent; -fx-text-fill: #f0f0f0;");
    }

    @FXML
    private void handleSobre(MouseEvent event) {
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/TelaSobre.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderpane.setCenter(root);
        botaoSobre.setStyle("-fx-background-color: #214c92; -fx-text-fill: #ffffff;");
        botaoSintatico.setStyle("-fx-background-color: transparent; -fx-text-fill: #f0f0f0;");
        botaoLexico.setStyle("-fx-background-color: transparent; -fx-text-fill: #f0f0f0;");
    }
}
