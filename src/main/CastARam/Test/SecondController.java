package main.CastARam.Test;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SecondController implements Initializable {

    @FXML
    private Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

        public void myFunction(String text){
            label.setText(text);
        }

}
