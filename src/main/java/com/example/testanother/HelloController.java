package com.example.testanother;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label secondText;

    @FXML
    protected void onHelloButtonClick() {
        secondText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onQuitClick(){
        Platform.exit();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onAboutClick() {
        welcomeText.setText("Hello There");
    }

    @FXML

    public void onOpenNewClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("about-view.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 315, 200);
            Stage stage = new Stage();
            stage.setTitle("About");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onWowClick() {
        secondText.setText("Wow Cool");
    }
}