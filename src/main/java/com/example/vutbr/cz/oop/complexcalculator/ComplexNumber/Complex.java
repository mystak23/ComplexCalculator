package com.example.vutbr.cz.oop.complexcalculator.ComplexNumber;

public class Complex {

    private double realPart;
    private double imaginaryPart;

    //dodelat
    public double getAbsoluteValue() {
        return 1;
    }

    //dodelat
    public double getArgument() {
        return 1;
    }

    @Override
    public String toString() {
        String complexNumber;
        if (imaginaryPart > 0) {
            complexNumber = realPart + " + " + imaginaryPart + "j ";
        } else {
            complexNumber = realPart + " - " + (-1 * imaginaryPart) + "j";
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
