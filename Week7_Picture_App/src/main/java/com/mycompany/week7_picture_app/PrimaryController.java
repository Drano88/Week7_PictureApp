package com.mycompany.week7_picture_app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrimaryController {
    
  // public void start( Stage primaryStage){
     // Image img = new Image("https://media.gcflearnfree.org/content/55e0730c7dd48174331f5164_01_17_2014/whatisacomputer_pc.jpg");
     // ImageView imgView= new ImageView(img);
      
     // StackPane pane = new StackPane(imgView);
    ///  pane.setStyle("-fx-background-color: black");
      
    //  Scene scene =  new Scene(pane, 500, 350);
    //  primaryStage.setTitle("Picture");
    //  primaryStage.setScene(scene);
     // primaryStage.show(); 
  // };

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
