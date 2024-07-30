package com.demo3;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Sign {
    @FXML
    public TextField Username;
    @FXML
    public PasswordField Password;
    @FXML
    public Button signButton;
    @FXML
    public Button backButton;
    @FXML
    private void initialize() {
        signButton.setOnAction(actionEvent -> handleSign() );
        backButton.setOnAction(actionEvent -> handleBack() );
    }
    private void handleSign() {
        System.out.println("Sign click");
    }
    private void handleBack() {
        try{
            Main.changeScene("Login.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
