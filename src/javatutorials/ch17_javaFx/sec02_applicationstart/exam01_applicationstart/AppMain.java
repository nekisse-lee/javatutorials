package javatutorials.ch17_javaFx.sec02_applicationstart.exam01_applicationstart;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Nekisse_lee on 2017. 7. 20..
 */
public class AppMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);   // Application이 가지고있는 정적 메소드
    }
}
