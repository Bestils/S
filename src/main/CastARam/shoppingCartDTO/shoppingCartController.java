package main.CastARam.shoppingCartDTO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import main.CastARam.Hammer;
import main.CastARam.carpenterDTO.CarpentryHamer;

import java.net.URL;
import java.util.ResourceBundle;

public class shoppingCartController implements Initializable {


    ObservableList<Hammer> items = new ObservableList<Hammer>
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

        tableView.setItems(getCarpenterHammers2());


    }

    public ObservableList<Hammer> getCarpenterHammers2(){
        ObservableList<Hammer> hamers = FXCollections.observableArrayList();

        hamers.add(new CarpentryHamer(1,3.14,245.6,"Stanley","Normal Stanley hammer","Stal","Double Picker","Solid square",true));



        return hamers;
    }
}
