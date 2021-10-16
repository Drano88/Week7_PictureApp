package com.mycompany.week7_picture_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

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
      
      
      
      imgView1.setViewport(new Rectangle2D(100, 500, 300, 300));
      imgView2.setViewport(new Rectangle2D(100, 500, 300, 300));
       
     
     Button button1 = new Button("Button 1");
     Button button2 = new Button("Button 2");
     
     HBox hbox1 = new HBox(10, button1);
     hbox1.setAlignment(Pos.CENTER);
     HBox hbox2 = new HBox(10, button2);
     hbox2.setAlignment(Pos.CENTER_RIGHT);
     
      StackPane pane = new StackPane(imgView1, imgView2 );
     pane.setStyle("-fx-background-color: black");
     
     //Creating a VBox
        VBox vbox = new VBox(200, pane, hbox1, hbox2);
        vbox.setPadding(new Insets(10));

        primaryStage.setTitle("Images");
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
        
    };
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

