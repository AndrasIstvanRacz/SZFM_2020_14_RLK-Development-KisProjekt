package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.tinylog.Logger;

public class MainPageController {

    @FXML
    private ComboBox<String> cbColumnName;

    @FXML
    private TextField tfSearch;

    @FXML
    private Button btnSearch;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> columnID;

    @FXML
    private TableColumn<?, ?> columnName;

    @FXML
    private TableColumn<?, ?> columnPhoneNumber;

    @FXML
    private TableColumn<?, ?> columnEmail;

    @FXML
    private TableColumn<?, ?> columnStartDate;

    @FXML
    private TableColumn<?, ?> columnEndDate;

    @FXML
    private TableColumn<?, ?> columnRoomType;

    @FXML
    private TableColumn<?, ?> columnPay;


    //private EldersRepository eldersRepository = new EldersRepository();

    /*@FXML
    protected void initialize() {
        new Thread(new Runnable() {
            @Override public void run() {
                handleSearch();
            }
        }).start();
    }

    private void initColumn() {
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("gender"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("city"));
        columnStartDate.setCellValueFactory(new PropertyValueFactory<>("street"));
        columnEndDate.setCellValueFactory(new PropertyValueFactory<>("number"));
        columnRoomType.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        columnPay.setCellValueFactory(new PropertyValueFactory<>("placeOfBirth"));
    }

    @FXML
    private void handleSearch() {
        try {
            ObservableList<CareTaking> data = FXCollections.observableArrayList(
                    caretakersRepository.findByColumn(getColumnName(cbColumnName.getValue().trim()),
                            tfSearch.getText().trim()));
            tfSearchByColumn.clear();
            caretake.setItems(data);
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