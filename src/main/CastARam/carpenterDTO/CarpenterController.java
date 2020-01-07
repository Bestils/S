package main.CastARam.carpenterDTO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import main.CastARam.Controller;
import main.CastARam.shoppingCartDTO.ShoppingCart;
import main.CastARam.shoppingCartDTO.shoppingCartController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CarpenterController implements Initializable {

    private ShoppingCart cart;
    @FXML
    private TableView<CarpentryHamer> tableView;
    @FXML
    private TableColumn<CarpentryHamer, Integer> IDColumn;
    @FXML
    private TableColumn<CarpentryHamer, Integer> wageColumn;
    @FXML
    private TableColumn<CarpentryHamer, Integer> priceColumn;
    @FXML
    private TableColumn<CarpentryHamer, String> brandColumn;
    @FXML
    private TableColumn<CarpentryHamer, String> nameColumn;
    @FXML
    private TableColumn<CarpentryHamer, String> materialColumn;
    @FXML
    private Label typeOfCrawl;
    @FXML
    private Label typeOfHead;
    @FXML
    private Label isLessVibrant;
    @FXML
    private Label price;
    @FXML
    private ImageView photo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IDColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, Integer>("id"));
        wageColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, Integer>("wage"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, Integer>("price"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, String>("brand"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, String>("name"));
        materialColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, String>("material"));

        //       tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); to enable multiple adding items
        tableView.setItems(getCarpenterHammers());

    }

    public ObservableList<CarpentryHamer> getCarpenterHammers() {
        ObservableList<CarpentryHamer> hamers = FXCollections.observableArrayList();

        hamers.add(new CarpentryHamer(70001, 5.14, 245.6, "PICKARD", "Normal PICKARD hammer", "Stal", "resources/images/carpenter/1.png","Long and short strait", "Solid square", false,"Carpenter"));
        hamers.add(new CarpentryHamer(70002, 5.60, 460.87, "OSCR", "Special  Carbon hammer", "Carbon/Steel", "resources/images/carpenter/2.png","Double Long Picker curved", "Rounded", true,"Carpenter"));
        hamers.add(new CarpentryHamer(70003,  2.76, 405.6, "GEDORE", "Smaller Aluminium GEDORE hammer", "Aluminium", "resources/images/carpenter/3.png","Long and short strait", "Solid square", false,"Carpenter"));
        hamers.add(new CarpentryHamer(70004, 3.14, 505.6, "GEDORE", "Bigger Aluminium GEDORE hammer", "Aluminium", "resources/images/carpenter/4.png","Long and short strait", "Solid square", false,"Carpenter"));
        hamers.add(new CarpentryHamer(70005, 2.15, 1205.6, "BANCO", "Perfect carpenter hammer", "Titanium", "resources/images/carpenter/5.png"," Long and short strait", "Solid square", true,"Carpenter"));

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
CarpentryHamer hammer = tableView.getSelectionModel().getSelectedItem();
     typeOfCrawl.setText(hammer.getTypeOfCrawl());
       typeOfHead.setText(hammer.getTypeOfHead());
     isLessVibrant.setText(Boolean.toString(hammer.isLessVibrantProperty().get()));
      price.setText(Double.toString(hammer.getPrice()));
photo.setImage(hammer.getPhoto());
      //TODO: Maybe change the labels to empty when nothing is picked

    }
}