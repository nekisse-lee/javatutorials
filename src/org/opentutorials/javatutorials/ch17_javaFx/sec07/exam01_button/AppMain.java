package org.opentutorials.javatutorials.ch17_javaFx.sec07.exam01_button;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Nekisse_lee on 2017. 7. 22..
 */
public class AppMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("root.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("AppMain");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
