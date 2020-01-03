package main.CastARam;

import com.sun.org.apache.bcel.internal.generic.TABLESWITCH;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.text.html.ImageView;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
@FXML private AnchorPane stoneHamers;
@FXML private AnchorPane rubberHammers;
@FXML private AnchorPane sledgeHammers;
@FXML private AnchorPane otherHamers;
@FXML private AnchorPane parts;
@FXML private AnchorPane joinerHammers;
@FXML private ImageView mainPage;
@FXML private ImageView shoppingCart;
@FXML private ImageView Person;

public void partsButtonPushed(ActionEvent  event) throws IOException {
 Parent tableViewParent = FXMLLoader.load(getClass().getResource("parts.fxml"));
    Scene tableViewScene = new Scene(tableViewParent);

    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

    window.setScene(tableViewScene);
    window.show();

}
    public void rubberButtonPushed(ActionEvent  event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("parts.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }
    public void sledgeButtonPushed(ActionEvent  event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("parts.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }
    public void stoneButtonPushed(ActionEvent  event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("parts.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }
    public void jointersButtonPushed(ActionEvent  event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("parts.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }
    public void otherButtonPushed(ActionEvent  event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("parts.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
