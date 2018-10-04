package ui.main;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


/**
 * FXML Controller class
 * @author Idelfonso
 */
public class PrincipalController implements Initializable {

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
    private Label lblData;
    @FXML
    private DatePicker dpValidade;
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
    }

    @FXML
    private void btnSalvarEntered(MouseEvent event) {
    }

    @FXML
    private void btnEditarExited(MouseEvent event) {
    }

    @FXML
    private void btnEditarEntered(MouseEvent event) {
    }

    @FXML
    private void btnExcluirExited(MouseEvent event) {
    }

    @FXML
    private void btnExcluirEntered(MouseEvent event) {
    }

    @FXML
    private void btnFiltrarExited(MouseEvent event) {
    }

    @FXML
    private void btnFiltrarEntered(MouseEvent event) {
    }
   
}