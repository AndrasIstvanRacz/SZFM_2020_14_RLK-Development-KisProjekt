package controllers;

import database.GuestsRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LocalDateStringConverter;
import model.Guests;
import org.tinylog.Logger;

import java.time.LocalDate;

public class EditingPageController {

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
    private TableColumn<Guests, Integer> columnPayment;

    @FXML
    private TableColumn<Guests, Guests> columnDelete;


    private GuestsRepository guestsRepository = new GuestsRepository();

   /* @FXML
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
        columnPayment.setCellValueFactory(new PropertyValueFactory<>("payment"));
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
    }*/

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
            columnName = "emial";
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
    }

    private void editTableColumns (){

        columnName.setCellFactory(TextFieldTableCell.forTableColumn());
        columnName.setOnEditCommit(expStringCellEditEvent -> {
            Guests tmp = expStringCellEditEvent.getTableView().getItems().
                    get(expStringCellEditEvent.getTablePosition().getRow());
            tmp.setName(expStringCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });

        columnPhoneNumber.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        columnPhoneNumber.setOnEditCommit(expStringCellEditEvent -> {
            Guests tmp = expStringCellEditEvent.getTableView().getItems().
                    get(expStringCellEditEvent.getTablePosition().getRow());
            tmp.setPhonenumber(expStringCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });

        columnEmail.setCellFactory(TextFieldTableCell.forTableColumn());
        columnEmail.setOnEditCommit(expStringCellEditEvent -> {
            Guests tmp = expStringCellEditEvent.getTableView().getItems().
                    get(expStringCellEditEvent.getTablePosition().getRow());
            tmp.setEmail(expStringCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });

        columnStartDate.setCellFactory(TextFieldTableCell.forTableColumn(new LocalDateStringConverter()));
        columnStartDate.setOnEditCommit(expLocalDateCellEditEvent -> {
            Guests tmp = expLocalDateCellEditEvent.getTableView().getItems().
                    get(expLocalDateCellEditEvent.getTablePosition().getRow());
            tmp.setStartdate(expLocalDateCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });

        columnEndDate.setCellFactory(TextFieldTableCell.forTableColumn(new LocalDateStringConverter()));
        columnEndDate.setOnEditCommit(expLocalDateCellEditEvent -> {
            Guests tmp = expLocalDateCellEditEvent.getTableView().getItems().
                    get(expLocalDateCellEditEvent.getTablePosition().getRow());
            tmp.setStartdate(expLocalDateCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });

        columnRoomType.setCellFactory(TextFieldTableCell.forTableColumn());
        columnRoomType.setOnEditCommit(expStringCellEditEvent -> {
            Guests tmp = expStringCellEditEvent.getTableView().getItems().
                    get(expStringCellEditEvent.getTablePosition().getRow());
            tmp.setEmail(expStringCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });

        columnPayment.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        columnPayment.setOnEditCommit(expStringCellEditEvent -> {
            Guests tmp = expStringCellEditEvent.getTableView().getItems().
                    get(expStringCellEditEvent.getTablePosition().getRow());
            tmp.setPhonenumber(expStringCellEditEvent.getNewValue());
            guestsRepository.commitChange(tmp);
        });


        columnDelete.setCellFactory(param -> new TableCell<>() {
            private final Button deleteButton = new Button("Törölés");

            @Override
            protected void updateItem(Guests guest, boolean empty) {
                super.updateItem(guest, empty);
                if (guest == null) {
                    setGraphic(null);
                    return;
                }
                setGraphic(deleteButton);
                deleteButton.setOnAction(actionEvent -> deleteRow(getTableView(), guest)
                );
            }
        });
        table.setEditable(true);
    }

    private void deleteRow(TableView tableView, Guests guest){
        try {
            tableView.getItems().remove(guest);
            guestsRepository.removeGuests(guest);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba üzenet");
            alert.setHeaderText(null);
            alert.setContentText("A kijelöltt sor törlése sikertelen.");
            alert.showAndWait();
        }
    }
}

