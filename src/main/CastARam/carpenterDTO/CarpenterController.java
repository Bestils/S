package main.CastARam.carpenterDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
import main.CastARam.Hammer;
import main.CastARam.shoppingCartDTO.ShoppingCart;
import main.CastARam.shoppingCartDTO.shoppingCartController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CarpenterController implements Initializable {

    private  ShoppingCart cart;
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
    private TextField typeOfCrawl;
    @FXML
    private TextField typeOfHead;
    @FXML
    private TextField isLessVibrant;

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

    public ObservableList<CarpentryHamer> getCarpenterHammers(){
        ObservableList<CarpentryHamer> hamers = FXCollections.observableArrayList();

        hamers.add(new CarpentryHamer(1,3.14,245.6,"Stanley","Normal Stanley hammer","Stal","Double Picker","Solid square",true));
        hamers.add(new CarpentryHamer(2,1.60,760.87,"Stanley","Special  StanleyCarbon hammer","Carbon","Double Picker","Solid square",true));
        hamers.add(new CarpentryHamer(3,3.14,5.6,"Kenedy","Normal Kenedy hammer","Stal","Double Picker","Rounded",false));
        hamers.add(new CarpentryHamer(4,3.14,5.6,"Kenedy","Aluminium Kenedy hammer","Aluminium","Double Picker","Picker",false));

return hamers;
    }

    public void changeSceneToDetailedPersonView(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../shoppingCartDTO/shoppingCart.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        shoppingCartController controller = loader.getController();
        cart.addItem(tableView.getSelectionModel().getSelectedItem());
        controller.initData(cart);

        window.setScene(tableViewScene);
        window.show();
    }


    public void initData(ShoppingCart cart){
        this.cart=cart;
    }


}
