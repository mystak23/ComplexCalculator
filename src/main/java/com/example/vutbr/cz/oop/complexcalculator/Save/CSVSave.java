package com.example.vutbr.cz.oop.complexcalculator.Save;

import com.example.vutbr.cz.oop.complexcalculator.ComplexNumber.Complex;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import javafx.scene.control.Alert;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVSave {

    private static final String FILE_NAME = "complex.csv"; //prints into this file
    private static Complex complex; //saved complex

    //import to file and to memory
    public static Complex importComplex() {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(FILE_NAME));
            reader.readNext();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                reader.close();
            } catch (IOException i) {
                i.getMessage();
            }
        }
        return complex;
    }

    //export from memory and from file
    public static void exportComplex(Complex complex) {
        CSVWriter writer = null;
        CSVSave.complex = complex;
        if (complex == null) {
            return;
        }
        try {
            writer = new CSVWriter(new FileWriter(FILE_NAME));
            String[] record = complex.toString().split(" ");
            writer.writeNext(record);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                writer.close();
            } catch (IOException i) {
                i.getMessage();
            }
        }
    }

    //prints into alert
    public static void showCsvResults() {
        if (complex != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(complex.toString());
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No saved data");
            alert.show();
        }
    }
}
