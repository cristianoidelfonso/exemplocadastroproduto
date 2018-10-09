package ui.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMLPrincipalController implements Initializable {

    @FXML
    private BorderPane principal;
    @FXML
    private Label lblTextoRodape;

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
    private void abrirTelaCadastro(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/uiprodutocadastro/FXMLCadastroProduto.fxml"));

//        Scene scene = new Scene(root);
//
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        //stage.setMaximized(true);
//        stage.setResizable(false);
//        stage.setTitle("Cadastro de Produtos");
//        stage.show();
        

        principal.getChildren().setAll(root);
    }

}
