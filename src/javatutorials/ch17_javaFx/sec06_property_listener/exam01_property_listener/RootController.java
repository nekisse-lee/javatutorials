package javatutorials.ch17_javaFx.sec06_property_listener.exam01_property_listener;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Nekisse_lee on 2017. 7. 22..
 */
public class RootController implements Initializable {
    @FXML private Slider slider;
    @FXML private Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                label.setFont(new Font(newValue.doubleValue()));
            }
        });
    }
}
