package ui.produto.cadastro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


/**
 * FXML Controller class
 * @author Idelfonso
 */
public class CadastroController implements Initializable {

    @FXML
    private Label lblRodape;
    @FXML
    private JFXTextField txtId;
    @FXML
    private JFXTextField txtCodigo;
    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXTextField txtPreço;
    @FXML
    private JFXTextField txtQuantidade;
    @FXML
    private Label lblValidade;
    @FXML
    private DatePicker dpDataValidade;
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