package com.example.vutbr.cz.oop.complexcalculator;

import com.example.vutbr.cz.oop.complexcalculator.ComplexNumber.Complex;
import com.example.vutbr.cz.oop.complexcalculator.ComplexNumber.ComplexConverse;
import com.example.vutbr.cz.oop.complexcalculator.ComplexNumber.ComplexOperation;
import com.example.vutbr.cz.oop.complexcalculator.ProgramRun.ExceptionHandling;
import com.example.vutbr.cz.oop.complexcalculator.ProgramRun.Methods;
import com.example.vutbr.cz.oop.complexcalculator.Save.CSVSave;
import com.example.vutbr.cz.oop.complexcalculator.Save.MemorySave;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Calculator implements Initializable {
    @FXML
    private TextField aRealPart;
    @FXML
    private TextField aImaginaryPart;
    @FXML
    private TextField bRealPart;
    @FXML
    private TextField bImaginaryPart;
    @FXML
    private Button swapButton;
    @FXML
    private Button addButton;
    @FXML
    private Button deductButton;
    @FXML
    private Button multiplyButton;
    @FXML
    private Button divideButton;
    @FXML
    private Button aToAlgebraicButton;
    @FXML
    private Button aToExponentialButton;
    @FXML
    private Button aToGoniometricButton;
    @FXML
    private Button bToAlgebraicButton;
    @FXML
    private Button bToExponentialButton;
    @FXML
    private Button bToGoniometricButton;
    @FXML
    private Button aAbsoluteValueButton;
    @FXML
    private Button aAngleButton;
    @FXML
    private Button bAbsoluteValueButton;
    @FXML
    private Button bAngleButton;
    @FXML
    private TextField aComplexNumber;
    @FXML
    private TextField bComplexNumber;
    @FXML
    private TextField result;
    @FXML
    private Button saveResultButton;
    @FXML
    private Button exportResultButton;
    @FXML
    private TextField saved1;
    @FXML
    private Button use1asAButton;
    @FXML
    private Button use1asBButton;
    @FXML
    private TextField saved2;
    @FXML
    private Button use2asAButton;
    @FXML
    private Button use2asBButton;
    @FXML
    private TextField saved3;
    @FXML
    private Button use3asAButton;
    @FXML
    private Button use3asBButton;
    @FXML
    private TextField saved4;
    @FXML
    private Button use4asAButton;
    @FXML
    private Button use4asBButton;
    @FXML
    private TextField saved5;
    @FXML
    private Button use5asAButton;
    @FXML
    private Button use5asBButton;
    @FXML
    private Button importToAButton;
    @FXML
    private TextField importAline;
    @FXML
    private Button importToBButton;
    @FXML
    private TextField importBline;
    @FXML
    private Button showResultsButton;
    @FXML
    private Button resetAButton;
    @FXML
    private Button resetBButton;

    private static Complex resultComplex;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        resetAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                aRealPart.clear();
                aImaginaryPart.clear();
            }
        });

        resetBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                bRealPart.clear();
                bImaginaryPart.clear();
            }
        });


        addButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c1 = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    Complex c2 = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    Complex c = ComplexOperation.add(c1, c2);
                    aComplexNumber.setText(c1.toString());
                    bComplexNumber.setText(c2.toString());
                    result.setText(c.toString());
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        deductButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c1 = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    Complex c2 = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    Complex c = ComplexOperation.deduct(c1, c2);
                    aComplexNumber.setText(c1.toString());
                    bComplexNumber.setText(c2.toString());
                    result.setText(c.toString());
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        multiplyButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c1 = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    Complex c2 = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    Complex c = ComplexOperation.multiply(c1, c2);
                    aComplexNumber.setText(c1.toString());
                    bComplexNumber.setText(c2.toString());
                    result.setText(c.toString());
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        divideButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c1 = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    Complex c2 = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    Complex c = ComplexOperation.divide(c1, c2);
                    aComplexNumber.setText(c1.toString());
                    bComplexNumber.setText(c2.toString());
                    result.setText(c.toString());
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        aToAlgebraicButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    aComplexNumber.setText(c.toString());
                    result.setText(ComplexConverse.toAlgebraic(c));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        aToGoniometricButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    aComplexNumber.setText(c.toString());
                    result.setText(ComplexConverse.toGoniometric(c));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        aToExponentialButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    aComplexNumber.setText(c.toString());
                    result.setText(ComplexConverse.toExponential(c));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        bToAlgebraicButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    bComplexNumber.setText(c.toString());
                    result.setText(ComplexConverse.toAlgebraic(c));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        bToGoniometricButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    bComplexNumber.setText(c.toString());
                    result.setText(ComplexConverse.toGoniometric(c));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        bToExponentialButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    bComplexNumber.setText(c.toString());
                    result.setText(ComplexConverse.toExponential(c));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        aAbsoluteValueButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    double absoluteValue = c.getAbsoluteValue();
                    aComplexNumber.setText(c.toString());
                    result.setText(String.valueOf(absoluteValue));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        aAngleButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(aRealPart.getText()), Double.parseDouble(aImaginaryPart.getText()));
                    double angle = c.getArgument();
                    aComplexNumber.setText(c.toString());
                    result.setText(String.valueOf(angle));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        bAbsoluteValueButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    double absoluteValue = c.getAbsoluteValue();
                    resultComplex = c;
                    bComplexNumber.setText(c.toString());
                    result.setText(String.valueOf(absoluteValue));
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        bAngleButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    Complex c = new Complex(Double.parseDouble(bRealPart.getText()), Double.parseDouble(bImaginaryPart.getText()));
                    double angle = c.getArgument();
                    bComplexNumber.setText(c.toString());
                    result.setText(String.valueOf(angle));
                    resultComplex = c;
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });

        saveResultButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.memorySave(resultComplex, saved1, saved2, saved3, saved4, saved5);
                resultComplex = null;
            }
        });

        use1asAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(aRealPart, aImaginaryPart, MemorySave.getC1(), saved1);
                MemorySave.setC1(null);
            }
        });

        use1asBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(bRealPart, bImaginaryPart, MemorySave.getC1(), saved1);
                MemorySave.setC1(null);
            }
        });

        use2asAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(aRealPart, aImaginaryPart, MemorySave.getC2(), saved2);
                MemorySave.setC2(null);
            }
        });

        use2asBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(bRealPart, bImaginaryPart, MemorySave.getC2(), saved2);
                MemorySave.setC2(null);

            }
        });

        use3asAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(aRealPart, aImaginaryPart, MemorySave.getC3(), saved3);
                MemorySave.setC3(null);
            }
        });

        use3asBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(bRealPart, bImaginaryPart, MemorySave.getC3(), saved3);
                MemorySave.setC3(null);
            }
        });

        use4asAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(aRealPart, aImaginaryPart, MemorySave.getC4(), saved4);
                MemorySave.setC4(null);
            }
        });

        use4asBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(bRealPart, bImaginaryPart, MemorySave.getC4(), saved4);
                MemorySave.setC4(null);
            }
        });

        use5asAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(aRealPart, aImaginaryPart, MemorySave.getC5(), saved5);
                MemorySave.setC5(null);
            }
        });

        use5asBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.useMemory(bRealPart, bImaginaryPart, MemorySave.getC5(), saved5);
                MemorySave.setC5(null);
            }
        });

        swapButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    String aReal = bRealPart.getText();
                    String aImaginary = bImaginaryPart.getText();
                    String bReal = aRealPart.getText();
                    String bImaginary = aImaginaryPart.getText();
                    aRealPart.clear();
                    aImaginaryPart.clear();
                    bRealPart.clear();
                    bImaginaryPart.clear();
                    aRealPart.setText(aReal);
                    aImaginaryPart.setText(aImaginary);
                    bRealPart.setText(bReal);
                    bImaginaryPart.setText(bImaginary);
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }

            }
        });

        importToAButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.importToCsv(aRealPart, aImaginaryPart);
            }
        });

        importToBButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                Methods.importToCsv(bRealPart, bImaginaryPart);
            }
        });

        exportResultButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    if (resultComplex != null) {
                        CSVSave.setComplex(resultComplex);
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText("Complex number exported!");
                        alert.show();
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Wrong input.");
                        alert.show();
                    }
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Error occured.");
                    System.out.println(e.getMessage());
                }
            }
        });

        showResultsButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    CSVSave.showCsvResults();
                } catch (NumberFormatException e) {
                    ExceptionHandling.showException("Wrong input");
                    System.out.println(e.getMessage());
                }
            }
        });
    }
}
