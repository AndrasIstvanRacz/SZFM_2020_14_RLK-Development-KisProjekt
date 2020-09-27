package controllers;

import database.GuestsRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Guests;
import org.tinylog.Logger;

import java.time.LocalDate;

public class MainPageController {

    @FXML
    private ComboBox<String> cbColumnName;

    @FXML
    private TextField tfSearch;

    @FXML
    private Button btnSearch;

    @FXML
    private TableView<Guests> table;

    @FXML
    private TableColumn<Guests, Integer> columnID;

    @FXML
    private TableColumn<Guests, String> columnName;

    @FXML
    private TableColumn<Guests, Integer> columnPhoneNumber;

    @FXML
    private TableColumn<Guests, String> columnEmail;

    @FXML
    private TableColumn<Guests, LocalDate> columnStartDate;

    @FXML
    private TableColumn<Guests, LocalDate> columnEndDate;

    @FXML
    private TableColumn<Guests, String> columnRoomType;

    @FXML
    private TableColumn<Guests, Integer> columnPay;


    private GuestsRepository guestsRepository = new GuestsRepository();

    /*@FXML
    protected void initialize() {
        new Thread(() -> handleSearch()).start();
    }

    private void initColumn() {
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnStartDate.setCellValueFactory(new PropertyValueFactory<>("startdate"));
        columnEndDate.setCellValueFactory(new PropertyValueFactory<>("enddate"));
        columnRoomType.setCellValueFactory(new PropertyValueFactory<>("roomtype"));
        columnPay.setCellValueFactory(new PropertyValueFactory<>("payment"));
    }

    @FXML
    private void handleSearch() {
        try {
            ObservableList<Guests> data = FXCollections.observableArrayList(
                    guestsRepository.findByColumn(getColumnName(cbColumnName.getValue().trim()),
                            tfSearch.getText().trim()));
            tfSearch.clear();
            table.setItems(data);
            initColumn();
        }catch (Exception e){
            Logger.error("Search by invalid type");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba üzenet");
            alert.setHeaderText(null);
            alert.setContentText("Érvénytelen típus adat vagy hibás adatbázis kapcsolat.");
            alert.showAndWait();
        }
    }

    private String getColumnName(String name){
        String columnName;
        if(name.equals("ID")){
            columnName = "id";
            return columnName;
        }
        else if(name.equals("Név")){
            columnName = "name";
            return columnName;
        }
        else if(name.equals("Telefonszám")){
            columnName = "phonenumber";
            return columnName;
        }
        else if(name.equals("E-mail")){
            columnName = "emaill";
            return columnName;
        }
        else if(name.equals("Szoba kivétele")){
            columnName = "startdate";
            return columnName;
        }
        else if(name.equals("Szoba elhagyása")){
            columnName = "enddate";
            return columnName;
        }
        else if(name.equals("Szoba típusa")){
            columnName = "roomtype";
            return columnName;
        }
        else {
            columnName = "payment";
            return columnName;
        }
    }*/
}