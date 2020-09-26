package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.tinylog.Logger;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class AdditionPageController {

    @FXML
    private TextField tfGuestName;

    @FXML
    private TextField tfPhoneNumber;

    @FXML
    private TextField tfEmail;

    @FXML
    private DatePicker dpStartDate;

    @FXML
    private DatePicker dpEndDate;

    @FXML
    private TextField tfRoomType;

    @FXML
    private TextField tfPayment;

    /*private CaretakersRepository caretakersRepository = new CaretakersRepository();

    @FXML
    private void handleAdd() {
        try {
            Guests newGuest = new Guests();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

            newGuest.setName(tfGuestName.getText().trim());
            newGuest.setPhoneNumber(Integer.parseInt(tfPhoneNumber.getText()));
            newGuest.setEmail(tfEmail.getText().trim());
            newGuest.setStartDate(dpStartDate.getValue());
            newGuest.setEndDate(dpEndDate.getValue());
            newGuest.setRoomType(tfRoomType.getText().trim());
            newGuest.setPayment(Integer.parseInt(tfPayment.getText()));

            tfGuestName.clear();
            tfPhoneNumber.clear();
            tfEmail.clear();
            dpStartDate.setValue(null);
            dpEndDate.setValue(null);
            tfRoomType.clear();
            tfPayment.clear();

            caretakersRepository.insertGuest(newCareTake);
        } catch (Exception e){
            Logger.error("Inserting invalid type");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba üzenet");
            alert.setHeaderText(null);
            alert.setContentText("Érvénytelen típus adat vagy hibás adatbázis kapcsolat.");
            alert.showAndWait();
        }
    }*/


}
