package com.example.vutbr.cz.oop.complexcalculator.ProgramRun;

import com.example.vutbr.cz.oop.complexcalculator.ComplexNumber.Complex;
import com.example.vutbr.cz.oop.complexcalculator.Save.CSVSave;
import com.example.vutbr.cz.oop.complexcalculator.Save.MemorySave;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Methods {

    //saves complex number to memory in @MemorySave
    public static void memorySave(Complex complex, TextField textField1, TextField textField2, TextField textField3, TextField textField4, TextField textField5) {
        try {
            if (MemorySave.getC1() == null) {
                MemorySave.setC1(complex);
                textField1.setText(MemorySave.getC1().toString());
            } else if (MemorySave.getC2() == null) {
                MemorySave.setC2(complex);
                textField2.setText(MemorySave.getC2().toString());
            } else if (MemorySave.getC3() == null) {
                MemorySave.setC3(complex);
                textField3.setText(MemorySave.getC3().toString());
            } else if (MemorySave.getC4() == null) {
                MemorySave.setC4(complex);
                textField4.setText(MemorySave.getC4().toString());
            } else if (MemorySave.getC5() == null) {
                MemorySave.setC5(complex);
                textField5.setText(MemorySave.getC5().toString());
            } else if (MemorySave.getC5() != null) {
                if (MemorySave.getC1() == null) {
                    MemorySave.setC1(complex);
                    textField1.setText(MemorySave.getC1().toString());
                } else if (MemorySave.getC2() == null) {
                    MemorySave.setC2(complex);
                    textField2.setText(MemorySave.getC2().toString());
                } else if (MemorySave.getC3() == null) {
                    MemorySave.setC3(complex);
                    textField3.setText(MemorySave.getC3().toString());
                } else if (MemorySave.getC4() == null) {
                    MemorySave.setC4(complex);
                    textField4.setText(MemorySave.getC4().toString());
                } else {
                    ExceptionHandling.showException("Full memory.");
                }
            }
        } catch (Exception e) {
            ExceptionHandling.showException("Error occured.");
            System.out.println(e.getMessage());
        }
    }

    //imports from saved memory to calculator
    public static void useMemory(TextField textField1, TextField textField2, Complex complex, TextField textFieldSaved) {
        try {
            double realPart = complex.getRealPart();
            double imaginaryPart = complex.getImaginaryPart();
            textField1.setText(String.valueOf(realPart));
            textField2.setText(String.valueOf(imaginaryPart));
        } catch (NumberFormatException | NullPointerException e) {
            ExceptionHandling.showException("Error occured.");
            System.out.println(e.getMessage());
        } finally {
            textFieldSaved.clear();
        }
    }

    //imports to @CSVSave
    public static void importToCsv(TextField textField1, TextField textField2) {
        try {
            Complex c = CSVSave.importComplex();
            textField1.setText(String.valueOf(c.getRealPart()));
            textField2.setText(String.valueOf(c.getImaginaryPart()));
            CSVSave.exportComplex(null);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Complex number imported!");
            alert.show();
        } catch (NumberFormatException | NullPointerException e) {
            ExceptionHandling.showException("No saved data!");
            System.out.println(e.getMessage());
        }
    }
}