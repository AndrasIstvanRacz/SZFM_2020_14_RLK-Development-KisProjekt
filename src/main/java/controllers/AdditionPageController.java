package controllers;

import database.EmfGetter;
import database.GuestsRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Guests;
import org.tinylog.Logger;
import javafx.util.converter.IntegerStringConverter;
import javax.persistence.EntityManager;

import static java.lang.Integer.parseInt;


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

    private GuestsRepository guestsRepository = new GuestsRepository();

    @FXML
    private void handleAdd() {
        try {
            Guests newGuest = new Guests();

            EntityManager em = EmfGetter.getEntityManager();
            newGuest.setName(tfGuestName.getText().trim());
            newGuest.setPhonenumber(parseInt(tfPhoneNumber.getText().trim()));
            newGuest.setEmail(tfEmail.getText().trim());
            newGuest.setStartdate(dpStartDate.getValue());
            newGuest.setEnddate(dpEndDate.getValue());
            newGuest.setRoomtype(tfRoomType.getText().trim());
            newGuest.setPayment(parseInt(tfPayment.getText().trim()));

            tfGuestName.clear();
            tfPhoneNumber.clear();
            tfEmail.clear();
            dpStartDate.setValue(null);
            dpEndDate.setValue(null);
            tfRoomType.clear();
            tfPayment.clear();

            guestsRepository.insertGuest(newGuest);
        } catch (Exception e){
            Logger.error("Inserting invalid type");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba üzenet");
            alert.setHeaderText(null);
            alert.setContentText("Érvénytelen típus adat vagy hibás adatbázis kapcsolat.");
            alert.showAndWait();
        }
    }


}
