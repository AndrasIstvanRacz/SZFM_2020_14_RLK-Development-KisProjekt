package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


import javafx.scene.input.MouseEvent;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import org.example.App;
import org.example.Main;
import org.tinylog.Logger;

public class MainWindowController {

    @FXML
    private BorderPane mainWindow;

    @FXML
    private Button btnMain;

    @FXML
    private Button btnAddition;

    @FXML
    private Button btnEditing;

    @FXML
    private void handleClicks(MouseEvent event) {
        if(event.getSource() == btnMain){
            loadFXML("MainPage");
        }
        else if(event.getSource() == btnAddition){
            loadFXML("AdditionPage");
        }
        else if(event.getSource() == btnEditing) {
            loadFXML("EditingPage");
        }
    }

    private void loadFXML(String Tab){
        GridPane root = null;
        try{
            root = FXMLLoader.load(Main.class.getResource(Tab+".fxml"));
            Logger.info("FXML loaded.");
        } catch (IOException ex ) {
            Logger.error("FXML loading failed.");
        }
        mainWindow.setCenter(root);
    }
}
