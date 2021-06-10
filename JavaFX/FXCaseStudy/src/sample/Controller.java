package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Taxi;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
;

public class Controller implements Initializable {
    ObservableList<model.Taxi> taxiObservableList = FXCollections.observableArrayList();


    @FXML
    private TextField tfAccount;

    @FXML
    private Button btnLogin;

    @FXML
    private Label result;

    @FXML
    private TextField tfResult;

    @FXML
    private ListView<Taxi> taxiListView;

    public void dost() {
//        services.TaxiApp app = new services.TaxiApp();
//        app.findTaxi();
//        app.payment();

        taxiObservableList.add(new model.Taxi("Code001","LI001","white",4,1));
        taxiObservableList.add(new model.Taxi("Code002","LI002","red",5,1));
        taxiObservableList.add(new model.Taxi("Code003","LI003","green",7,1));
        taxiObservableList.add(new model.Taxi("Code004","LI004","black",4,1));
        taxiObservableList.add(new model.Taxi("Code005","LI005","white",7,1));
        System.out.println(taxiObservableList.get(1));
       taxiListView.refresh();
    }

    public void login(ActionEvent actionEvent){
        if(tfAccount.getText().equals("Admin")) {
            tfResult.setText("Hello admin");
        } else {
            tfResult.setText("Stranger");
        };
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taxiListView.setItems(taxiObservableList);
    }
}
