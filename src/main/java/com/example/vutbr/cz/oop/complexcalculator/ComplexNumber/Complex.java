package com.example.vutbr.cz.oop.complexcalculator.ComplexNumber;

import com.example.vutbr.cz.oop.complexcalculator.ProgramRun.ExceptionHandling;

import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;

public class Complex {

    private double realPart;
    private double imaginaryPart;

    //returns |C|
    public double getAbsoluteValue() {
        double absoluteValue = Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
        return absoluteValue;
    }

    //returns argument/angle
    public double getArgument() {
        double argument = 0;
        try {
            if (realPart > 0) {
                argument = Math.atan(imaginaryPart / realPart);
            } else if (realPart < 0 && imaginaryPart >= 0) {
                argument = Math.atan(imaginaryPart / realPart) + Math.PI;
            } else if (realPart < 0 && imaginaryPart < 0) {
                argument = Math.atan(imaginaryPart / realPart) - Math.PI;
            } else if (realPart == 0 && imaginaryPart > 0) {
                argument = Math.PI / 2;
            } else if (realPart == 0 && imaginaryPart < 0) {
                argument = -Math.PI / 2;
                //no angle!
            } else if (realPart == 0 && imaginaryPart == 0) {
                throw new NoSuchAlgorithmException();
            }
        } catch (NoSuchAlgorithmException e) {
            ExceptionHandling.showException("Argument is not defined.");
            System.out.println(e.getMessage());
        }
        return argument;
    }

    @Override
    public String toString() {
        String complexNumber;
        DecimalFormat df = new DecimalFormat("###.##"); //round to two decimal places
        if (imaginaryPart >= 0) {
            complexNumber = df.format(realPart) + " + " + df.format(imaginaryPart) + "j ";
        } else {
            //print "a - bj" instead of a + -bj
            double negativeImaginaryPart = (-1) * imaginaryPart;
            complexNumber = df.format(realPart) + " - " + df.format(negativeImaginaryPart) + "j";
        }
        return complexNumber;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
}
