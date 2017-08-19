package javatutorials.ch17_javaFx.sec06_property_listener.exam03_bindings;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Nekisse_lee on 2017. 7. 22..
 */
public class RootController implements Initializable {
    @FXML private AnchorPane root;
    @FXML private Circle circle;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        circle.centerXProperty().bind(Bindings.divide(root.widthProperty(),2));
        circle.centerYProperty().bind(Bindings.divide(root.heightProperty(),2));
    }
}

