package javatutorials.ch17_javaFx.sec07.exam01_button;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Nekisse_lee on 2017. 7. 22..
 */
public class RootController implements Initializable {
    @FXML private CheckBox chk1;
    @FXML private CheckBox chk2;
    @FXML private ImageView checkImageView;
    @FXML private ToggleGroup group;
    @FXML private ImageView radioImageView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                Image image = new Image(getClass().getResource("images/" + newValue.getUserData().toString() + ".png").toString());
                radioImageView.setImage(image);

            }
        });
    }

    public void handleBtnExitAction(ActionEvent event) {
        Platform.exit();
    }

    public void handleChkAction(ActionEvent event) {
        if (chk1.isSelected() && chk2.isSelected()){
            checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
        }else if (chk1.isSelected()){
            checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
        }else if (chk2.isSelected()){
            checkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
        }else{
            checkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
        }

    }
}

