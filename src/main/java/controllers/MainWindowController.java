package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.example.App;

public class MainWindowController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("MainPage");
    }

}