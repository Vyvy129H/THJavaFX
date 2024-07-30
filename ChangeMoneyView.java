package com.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ChangeMoneyView {
    @FXML
    public TextField ChangeMoney;
    @FXML
    public TextField Money;
    @FXML
    public void onChange() {
        double rate = 24.5;
        double moneyUSD = Integer.parseInt(Money.getText()) * rate;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Số tiền USD là : " + moneyUSD + "\nRATE now: " + rate);
        alert.showAndWait();



    }
}
