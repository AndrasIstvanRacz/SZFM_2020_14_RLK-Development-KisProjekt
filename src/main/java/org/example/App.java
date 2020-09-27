package org.example;

import database.EmfGetter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
        root.setCenter(listLoader.load());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(new Image("Images/Icon.png"));
        stage.setTitle("Nyílvántartó");
        stage.show();
        stage.setOnCloseRequest(windowEvent -> {
            EmfGetter.closeEmf();
        });
    }

}