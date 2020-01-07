package main.CastARam;

import javafx.collections.FXCollections;
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
import main.CastARam.carpenterDTO.CarpenterController;
import main.CastARam.rubberDTO.RubberController;
import main.CastARam.shoppingCartDTO.ShoppingCart;
import main.CastARam.shoppingCartDTO.shoppingCartController;
import main.CastARam.sledgeDTO.SledgeController;
import main.CastARam.stoneDTO.StoneController;

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

ShoppingCart cart = new ShoppingCart(FXCollections.observableArrayList());

public void partsButtonPushed(ActionEvent  event) throws IOException {
    Parent tableViewParent = FXMLLoader.load(getClass().getResource("drillHammerDTO/drill.fxml"));
    Scene tableViewScene = new Scene(tableViewParent);

    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

    window.setScene(tableViewScene);
    window.show();

}

    public void changeSceneToDetailedPersonView(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("shoppingCartDTO/shoppingCart.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        shoppingCartController controller = loader.getController();
        controller.initData( cart);

        window.setScene(tableViewScene);
        window.show();
    }

    public void rubberButtonPushed(ActionEvent  event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("rubberDTO/rubber.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        RubberController controller = loader.getController();

        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();

    }

    public void sledgeButtonPushed(ActionEvent  event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sledgeDTO/sledge.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        SledgeController controller = loader.getController();

        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }

    public void stoneButtonPushed(ActionEvent  event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("stoneDTO/stone.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        StoneController controller = loader.getController();

        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();

    }

    public void carpenterButtonPushed(ActionEvent  event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("carpenterDTO/carpenter.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        CarpenterController controller = loader.getController();

        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) { }

    public void initData(ShoppingCart cart){
        this.cart=cart;
    }

}
