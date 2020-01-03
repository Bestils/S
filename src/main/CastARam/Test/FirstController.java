package main.CastARam.Test;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;

public class FirstController {

        @FXML
        private TextField textField;

    @FXML
     void openNewStage(javafx.event.ActionEvent event){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("testing.xml"));
        try {
            Parent root = (Parent) loader.load();
            SecondController secondController = loader.getController();
            secondController.myFunction(textField.getText());
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
