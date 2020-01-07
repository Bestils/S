package main.CastARam.rubberDTO;

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

public class RubberController implements Initializable {

    private ShoppingCart cart;
    @FXML
    private TableView<RubberHammer> tableView;
    @FXML
    private TableColumn<RubberHammer, Integer> IDColumn;
    @FXML
    private TableColumn<RubberHammer, Integer> wageColumn;
    @FXML
    private TableColumn<RubberHammer, Integer> priceColumn;
    @FXML
    private TableColumn<RubberHammer, String> brandColumn;
    @FXML
    private TableColumn<RubberHammer, String> nameColumn;
    @FXML
    private TableColumn<RubberHammer, String> materialColumn;
    @FXML
    private Label headDiameter;
    @FXML
    private Label price;
    @FXML
    private ImageView photo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IDColumn.setCellValueFactory(new PropertyValueFactory<RubberHammer, Integer>("id"));
        wageColumn.setCellValueFactory(new PropertyValueFactory<RubberHammer, Integer>("wage"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<RubberHammer, Integer>("price"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<RubberHammer, String>("brand"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<RubberHammer, String>("name"));
        materialColumn.setCellValueFactory(new PropertyValueFactory<RubberHammer, String>("material"));

        //       tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); to enable multiple adding items
        tableView.setItems(getCarpenterHammers());

    }

    public ObservableList<RubberHammer> getCarpenterHammers() {
        ObservableList<RubberHammer> hamers = FXCollections.observableArrayList();

        hamers.add(new RubberHammer(30001, 3.14, 245.46, "TEKTON", "Birch handle", "Birch", "resources/images/rubber/1.png",13,"rubber"));
        hamers.add(new RubberHammer(30002, 6.60, 260.87, "STANLEY", "Steel hande", "Steel", "resources/images/rubber/2.png",54,"rubber"));
        hamers.add(new RubberHammer(30003, 5.18, 112.36, "GEDORE", "Mix woods handle", "Mix", "resources/images/rubber/3.png",67,"rubber"));
        hamers.add(new RubberHammer(30004, 4.40, 145.26, "KENEDY", "Nut handle", "Nut", "resources/images/rubber/4.png",42,"rubber"));
        hamers.add(new RubberHammer(30004, 3.23, 235.16, "STANLEY", "New technology of head ", "Plastic/Silicon", "resources/images/rubber/5.png",42,"rubber"));
        hamers.add(new RubberHammer(30005, 4.41, 145.56, "PROVE", "Oak handle", "Oak", "resources/images/rubber/6.png",23,"rubber"));

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
        RubberHammer hammer = tableView.getSelectionModel().getSelectedItem();
        headDiameter.setText(Integer.toString(hammer.getHeadDiameter()));

      price.setText(Double.toString(hammer.getPrice()));
photo.setImage(hammer.getPhoto());
      //TODO: Maybe change the labels to empty when nothing is picked

    }
}