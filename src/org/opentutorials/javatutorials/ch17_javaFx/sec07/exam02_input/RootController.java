package org.opentutorials.javatutorials.ch17_javaFx.sec07.exam02_input;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 * Created by Nekisse_lee on 2017. 7. 22..
 */
public class RootController implements Initializable {
    @FXML private TextField txtTitle;
    @FXML private PasswordField txtPassword;
    @FXML private ComboBox<String> comboPublic;
    @FXML private DatePicker dateExit;
    @FXML private TextArea txtContent;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void handelBtnRegAction(ActionEvent event) {
        String title = txtTitle.getText();
        System.out.println("title: " + title);

        String password = txtPassword.getText();
        System.out.println("password: " + password);

        String strPublic = comboPublic.getValue();
        System.out.println("public: " + strPublic);

        LocalDate localDate = dateExit.getValue();
        if (localDate!=null) {
            System.out.println("dateExit: " + localDate.toString());
        }

        String content = txtContent.getText();
        System.out.println("content: " + content);
    }

    public void handelBtnCancelAction(ActionEvent event) {
        Platform.exit();
    }
}