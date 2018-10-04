package ui.main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class FXMLPrincipalController implements Initializable {

    @FXML
    private BorderPane principal;
    @FXML
    private Label lblTextoRodape;

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
    private void abrirTelaCadastro(ActionEvent event) {
    }
    
}
