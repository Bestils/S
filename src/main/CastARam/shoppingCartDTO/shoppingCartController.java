package main.CastARam.shoppingCartDTO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.CastARam.Controller;
import main.CastARam.Hammer;
import main.CastARam.carpenterDTO.CarpentryHamer;

import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class shoppingCartController implements Initializable {

    ShoppingCart cart = new ShoppingCart(FXCollections.observableArrayList());

    @FXML
    private TableView<Hammer> tableView;
    @FXML
    private TableColumn<Hammer, Integer> IDColumn;
    @FXML
    private TableColumn<Hammer, Integer> wageColumn;
    @FXML
    private TableColumn<Hammer, Integer> priceColumn;
    @FXML
    private TableColumn<Hammer, String> brandColumn;
    @FXML
    private TableColumn<Hammer, String> nameColumn;
    @FXML
    private TableColumn<Hammer, String> materialColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IDColumn.setCellValueFactory(new PropertyValueFactory<Hammer, Integer>("id"));
        wageColumn.setCellValueFactory(new PropertyValueFactory<Hammer, Integer>("wage"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Hammer, Integer>("price"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<Hammer, String>("brand"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Hammer, String>("name"));
        materialColumn.setCellValueFactory(new PropertyValueFactory<Hammer, String>("material"));

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        tableView.setEditable(true);
    }

    public void initData(ShoppingCart shoppingCart){
       this.cart=shoppingCart;
        tableView.setItems( cart.getCartItems());
    }
    public void main(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../main.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        Controller controller = loader.getController();
        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }
    public void deleteItem() {
 ObservableList<Hammer> selectedItems=tableView.getSelectionModel().getSelectedItems();
        for (Hammer hammer: selectedItems){
            cart.getCartItems().remove(hammer);
        }
    }
}
