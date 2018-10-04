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
    

// <editor-fold defaultstate="collapsed" desc=" Variáveis ">
    
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnEditar;
    @FXML
    private JFXButton btnExcluir;
    @FXML
    private JFXButton btnFiltrar;
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
 
// </editor-fold >    

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

// <editor-fold defaultstate="collapsed" desc=" Eventos dos Botões ">
    @FXML
    private void btnSalvarExited(MouseEvent event) {
        // Quando o ponteiro do mouse sair da area do botão.
        btnSalvar.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnSalvarEntered(MouseEvent event) {
        // Quando o ponteiro do mouse entrar na area do botão.
        btnSalvar.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnEditarExited(MouseEvent event) {
        // Quando o ponteiro do mouse sair da area do botão.
        btnEditar.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnEditarEntered(MouseEvent event) {
        // Quando o ponteiro do mouse entrar na area do botão.
        btnEditar.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnExcluirExited(MouseEvent event) {
        // Quando o ponteiro do mouse sair da area do botão.
        btnExcluir.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnExcluirEntered(MouseEvent event) {
        // Quando o ponteiro do mouse entrar na area do botão.
        btnExcluir.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnFiltrarExited(MouseEvent event) {
        // Quando o ponteiro do mouse sair da area do botão.
        btnFiltrar.setStyle("-fx-background-color: #66CDAA; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void btnFiltrarEntered(MouseEvent event) {
        // Quando o ponteiro do mouse entrar na area do botão.
        btnFiltrar.setStyle("-fx-background-color: #008B8B; -fx-text-fill: #FFFFFF;");
    }
// </editor-fold>  
    
}
