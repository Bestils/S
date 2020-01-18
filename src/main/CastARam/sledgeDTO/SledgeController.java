package main.CastARam.sledgeDTO;

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
import main.CastARam.shoppingCartDTO.ShoppingCartController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SledgeController implements Initializable {

    private ShoppingCart cart;
    @FXML
    private TableView<SledgeHammer> tableView;
    @FXML
    private TableColumn<SledgeHammer, Integer> IDColumn;
    @FXML
    private TableColumn<SledgeHammer, Integer> wageColumn;
    @FXML
    private TableColumn<SledgeHammer, Integer> priceColumn;
    @FXML
    private TableColumn<SledgeHammer, String> brandColumn;
    @FXML
    private TableColumn<SledgeHammer, String> nameColumn;
    @FXML
    private TableColumn<SledgeHammer, String> materialColumn;
    @FXML
    private Label handleDiameter;
    @FXML
    private Label headWidth;
    @FXML
    private Label headLength;
    @FXML
    private Label price;
    @FXML
    private ImageView photo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IDColumn.setCellValueFactory(new PropertyValueFactory<SledgeHammer, Integer>("id"));
        wageColumn.setCellValueFactory(new PropertyValueFactory<SledgeHammer, Integer>("wage"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<SledgeHammer, Integer>("price"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<SledgeHammer, String>("brand"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<SledgeHammer, String>("name"));
        materialColumn.setCellValueFactory(new PropertyValueFactory<SledgeHammer, String>("material"));

        //       tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); to enable multiple adding items
        tableView.setItems(getCarpenterHammers());

    }

    public ObservableList<SledgeHammer> getCarpenterHammers() {
        ObservableList<SledgeHammer> hamers = FXCollections.observableArrayList();

        hamers.add(new SledgeHammer(10001, 16.15, 945.6, "GROL", "Extremly Strong and resist", "Steel", "resources/images/Sledge/1.png",13,24,175,"Sledge"));
        hamers.add(new SledgeHammer(10002, 10.60, 350.87, "MARKSMAN", "One hand destroyer ", "Carbon/Iron", "resources/images/Sledge/2.png",14,24,75,"Sledge"));
        hamers.add(new SledgeHammer(10003, 19.10, 405.6, "STANLEY", "Normal Kenedy hammer", "Steel/Polyester", "resources/images/Sledge/3.png",27,14,195,"Sledge"));
        hamers.add(new SledgeHammer(10004, 5.45, 105.6, "KENEDY", "Normal wooden handled", "Iron", "resources/images/Sledge/4.png",22,40,105,"Sledge"));
        hamers.add(new SledgeHammer(10005, 13.44, 195.6, "UPREA", "Long wooden handled", "Iron", "resources/images/Sledge/5.png",12,34,189,"Sledge"));
        hamers.add(new SledgeHammer(10006, 4.15, 505.6, "GROL", "Special Wall destroyer", "Steel/Copper", "resources/images/Sledge/6.png",10,18,40,"Sledge"));

        return hamers;
    }

    public void addToCart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../shoppingCartDTO/shoppingCart.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //access the controller and call a method
        ShoppingCartController controller = loader.getController();
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
        ShoppingCartController controller = loader.getController();
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
        SledgeHammer hammer = tableView.getSelectionModel().getSelectedItem();
        headLength.setText(Integer.toString(hammer.getHeadLenght()));
        handleDiameter.setText(Integer.toString(hammer.getHandleLength()));
        headWidth.setText(Integer.toString(hammer.getHeadWidth()));

      price.setText(Double.toString(hammer.getPrice()));
photo.setImage(hammer.getPhoto());
      //TODO: Maybe change the labels to empty when nothing is picked

    }
}