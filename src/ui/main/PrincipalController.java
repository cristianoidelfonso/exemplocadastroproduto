package ui.main;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 * @author Idelfonso
 */
public class PrincipalController implements Initializable {

    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnEditar;
    @FXML
    private JFXButton btnExcluir;
    @FXML
    private JFXButton btnFiltrar;

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
    private void abrirJanelaCadastro(ActionEvent event) {
        // Abrir a janela de cadastro de produto
    }

    @FXML
    private void btnSalvarExited(MouseEvent event) {
        btnSalvar.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnSalvarEntered(MouseEvent event) {
        btnSalvar.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnEditarExited(MouseEvent event) {
        btnEditar.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnEditarEntered(MouseEvent event) {
        btnEditar.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnExcluirExited(MouseEvent event) {
        btnExcluir.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnExcluirEntered(MouseEvent event) {
        btnExcluir.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnFiltrarExited(MouseEvent event) {
        btnFiltrar.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnFiltrarEntered(MouseEvent event) {
        btnFiltrar.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }
    
}
