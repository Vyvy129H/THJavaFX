package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginView {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    protected void login() {
        String username = this.username.getText();
        String password = this.password.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (username.equals("admin") && password.equals("password")) {
            alert.setContentText("Đăng nhập thành công");
        } else {
            alert.setContentText("Đăng nhập thất bại");
        }
        alert.show();

    }
}
