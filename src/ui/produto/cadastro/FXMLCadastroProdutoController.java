/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.produto.cadastro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import model.entidades.Produto;

/**
 * FXML Controller class
 *
 * @author Idelfonso
 */
public class FXMLCadastroProdutoController implements Initializable {

    @FXML
    private Label lblTextoRodape1;
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
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnEditar;
    @FXML
    private JFXButton btnExcluir;
    @FXML
    private JFXTextField txtFiltro;
    @FXML
    private JFXComboBox<?> cbFiltro;
    @FXML
    private JFXButton btnFiltrar;
    @FXML
    private TableView<?> tblProdutos;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void salvar(ActionEvent event) {

        double precoDouble = Double.parseDouble(txtPreco.getText());
        double qtdDouble = Double.parseDouble(txtQuantidade.getText());

        //Pegando os dados da tela
        Produto p = new Produto(
                0,
                txtNome.getText(),
                precoDouble,
                txtCodigo.getText(), 
                qtdDouble,
                dpValidade.getValue()
                
        );
    }

}
