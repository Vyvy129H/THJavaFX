package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AgeController {
    @FXML
    private TextField hehehe;

    @FXML

    public void calculateAge() {
        int now = 2024;
        int age = now - Integer.parseInt(hehehe.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("You are " + age + " years old.");
        alert.showAndWait();
    }
}