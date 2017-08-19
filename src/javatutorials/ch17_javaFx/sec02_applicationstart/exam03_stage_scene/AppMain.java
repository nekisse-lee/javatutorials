package javatutorials.ch17_javaFx.sec02_applicationstart.exam03_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * Created by Nekisse_lee on 2017. 7. 20..
 */
public class AppMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        root.setPrefWidth(350);
        root.setPrefHeight(150);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        Label label = new Label();
        label.setText("저도해주세요");
        label.setFont(new Font(50));

        Button button = new Button();
        button.setText("확인");
        button.setOnAction(event -> Platform.exit());

        root.getChildren().add(label);
        root.getChildren().add(button);

        Scene scene = new Scene(root);

        primaryStage.setTitle("AppMain");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);   // Application이 가지고있는 정적 메소드
    }
}
