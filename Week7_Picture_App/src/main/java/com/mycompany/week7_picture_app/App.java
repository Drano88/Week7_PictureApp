package com.mycompany.week7_picture_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    
     public void start( Stage primaryStage) throws IOException{
      Image img1 = new Image("https://clipart.world/wp-content/uploads/2021/04/Cartoon-Computer-clipart-transparent-background.png");
      ImageView imgView1= new ImageView(img1);
      
      Image img2 = new Image("https://clipartix.com/wp-content/uploads/2017/07/Computer-clip-art-images-2-clipartset.jpg");
      ImageView imgView2= new ImageView(img2);
      
      StackPane pane = new StackPane(imgView1, imgView2);
      pane.setStyle("-fx-background-color: black");
      
      imgView1.setViewport(new Rectangle2D(200, 500, 300, 300));
      imgView2.setViewport(new Rectangle2D(200, 500, 300, 300));
       
      
      
      Scene scene =  new Scene(pane, 700, 550);
      primaryStage.setTitle("Display Picture");
      primaryStage.setScene(scene);
      primaryStage.show();
      };
     
     
  

    
    
    
    
   // public void start(Stage stage1) throws IOException {
       // scene = new Scene(loadFXML("primary"), 640, 480);
      //  stage1.setScene(scene);
      //  stage1.show();
   // }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}