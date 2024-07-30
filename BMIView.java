package com.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BMIView {

    @FXML
    private TextField Height;
    @FXML
    private TextField Weight;

    @FXML
    protected void checkBMI() {
        double height = Double.parseDouble(Height.getText());
        double weight = Double.parseDouble(Weight.getText());
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}

