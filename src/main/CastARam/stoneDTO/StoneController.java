package main.CastARam.stoneDTO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import main.CastARam.Controller;
import main.CastARam.shoppingCartDTO.ShoppingCart;
import main.CastARam.shoppingCartDTO.shoppingCartController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StoneController implements Initializable {

    private ShoppingCart cart;
    @FXML
    private TableView<StoneHammer> tableView;
    @FXML
    private TableColumn<StoneHammer, Integer> IDColumn;
    @FXML
    private TableColumn<StoneHammer, Integer> wageColumn;
    @FXML
    private TableColumn<StoneHammer, Integer> priceColumn;
    @FXML
    private TableColumn<StoneHammer, String> brandColumn;
    @FXML
    private TableColumn<StoneHammer, String> nameColumn;
    @FXML
    private TableColumn<StoneHammer, String> materialColumn;
    @FXML
    private Label isAmplified;
    @FXML
    private Label isHardened;
    @FXML
    private Label price;
    @FXML
    private ImageView photo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IDColumn.setCellValueFactory(new PropertyValueFactory<StoneHammer, Integer>("id"));
        wageColumn.setCellValueFactory(new PropertyValueFactory<StoneHammer, Integer>("wage"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<StoneHammer, Integer>("price"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<StoneHammer, String>("brand"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<StoneHammer, String>("name"));
        materialColumn.setCellValueFactory(new PropertyValueFactory<StoneHammer, String>("material"));

        //       tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); to enable multiple adding items
        tableView.setItems(getCarpenterHammers());

    }

    public ObservableList<StoneHammer> getCarpenterHammers() {
        ObservableList<StoneHammer> hamers = FXCollections.observableArrayList();

        hamers.add(new StoneHammer(9001, 8.10, 150.50, "PICARD", "Short splitting hammer", "Iron", "resources/images/stone/1.png",false,true,"Stone"));
        hamers.add(new StoneHammer(9002, 4.60, 760.87, "STANLEY", "Stanley Titanium hammer", "Steel/Titanium", "resources/images/stone/2.png",true,true,"Stone"));
        hamers.add(new StoneHammer(9003, 10.25, 205.6, "PICARD", "Long splitting hammer", "Iron", "resources/images/stone/3.png",true,true,"Stone"));
        hamers.add(new StoneHammer(9004, 4.14, 105.6, "PICARD", "Normal small hammer", "Iron", "resources/images/stone/4.png",false,false,"Stone"));
        hamers.add(new StoneHammer(9005, 7.14, 175.6, "MARKSMAN", "Nonrmal hammer", "Iron", "resources/images/stone/5.png",true,true,"Stone"));


        return hamers;
    }

    public void addToCart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../shoppingCartDTO/shoppingCart.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //access the controller and call a method
        shoppingCartController controller = loader.getController();
        cart.addItem(tableView.getSelectionModel().getSelectedItem());
        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }
    public void goToCart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../shoppingCartDTO/shoppingCart.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //access the controller and call a method
        shoppingCartController controller = loader.getController();
        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }

    public void initData(ShoppingCart cart) {
        this.cart = cart;
    }

    public void main(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../main.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //access the controller and call a method
        Controller controller = loader.getController();
        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }

    public void showItem(ActionEvent event) throws IOException {
        StoneHammer hammer = tableView.getSelectionModel().getSelectedItem();
        isHardened.setText(Boolean.toString(hammer.isHardenedProperty().get()));
        isAmplified.setText(Boolean.toString(hammer.isAmplifiedProperty().get()));


      price.setText(Double.toString(hammer.getPrice()));
photo.setImage(hammer.getPhoto());
      //TODO: Maybe change the labels to empty when nothing is picked

    }
}