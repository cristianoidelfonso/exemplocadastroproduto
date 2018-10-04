package uiprodutocadastro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLCadastroProdutoController implements Initializable {

    @FXML
    private Label lblTextoRodape1;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnEditar;
    @FXML
    private JFXButton btnExcluir;
    @FXML
    private JFXTextField txtId;
    @FXML
    private JFXTextField txtCodigo;
    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXTextField txtPreco;
    @FXML
    private JFXTextField txtQuantidade;
    @FXML
    private JFXDatePicker dpValidade;
    @FXML
    private JFXButton btnFiltrar;
    @FXML
    private JFXTextField txtFiltro;
    @FXML
    private JFXComboBox<?> cbFiltro;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
