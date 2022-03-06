package com.example.vutbr.cz.oop.complexcalculator.Save;

import com.example.vutbr.cz.oop.complexcalculator.ComplexNumber.Complex;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import javafx.scene.control.Alert;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVSave {

    private static final String FILE_NAME = "complex.csv";
    private static Complex complex;

    public static Complex getComplex() {
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

    public static void setComplex(Complex complex) {
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
