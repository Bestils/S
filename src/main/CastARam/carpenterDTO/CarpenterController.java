package main.CastARam.carpenterDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class CarpenterController implements Initializable {

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
        IDColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, Integer>("ID"));
        wageColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, Integer>("wage"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, Integer>("price"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, String>("brand"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, String>("name"));
        materialColumn.setCellValueFactory(new PropertyValueFactory<CarpentryHamer, String>("material"));

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
}
