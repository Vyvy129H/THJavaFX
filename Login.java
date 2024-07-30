package com.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    @FXML
    private Button loginButton;
    @FXML
    private Button signButton;
    @FXML
    private void initialize(){
        loginButton.setOnAction(actionEvent -> handleLogin());
        signButton.setOnAction(actionEvent -> handleSign());
    }
    private void handleLogin(){
        System.out.println("Login clicked");
    }
    private void handleSign(){
        try{
            Main.changeScene("Sign.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
