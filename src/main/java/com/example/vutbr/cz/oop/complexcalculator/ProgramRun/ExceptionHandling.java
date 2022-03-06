package com.example.vutbr.cz.oop.complexcalculator.ProgramRun;

import javafx.scene.control.Alert;

public class ExceptionHandling {

    public static void showException(String reason) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(reason);
        alert.show();
    }
}
