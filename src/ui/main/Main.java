package ui.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application{
    
    @Override
    public void start (Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLPrincipal.fxml"));
        
        stage.setTitle("");
        stage.getIcons().add(new Image("/icones/virtual-machine-96.png"));
        //stage.setMaximized(true);
        stage.setResizable(false);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
