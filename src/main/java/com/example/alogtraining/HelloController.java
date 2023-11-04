package com.example.alogtraining;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class elloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}