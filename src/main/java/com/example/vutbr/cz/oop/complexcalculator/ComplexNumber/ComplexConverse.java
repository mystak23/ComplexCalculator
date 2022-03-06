package com.example.vutbr.cz.oop.complexcalculator.ComplexNumber;

import java.text.DecimalFormat;

public class ComplexConverse {

    public static String toAlgebraic(Complex c) {
        String complexNumber = c.toString();
        return complexNumber;
    }

    public static String toExponential(Complex c) {
        DecimalFormat df = new DecimalFormat("###.##"); //round
        String complexNumber = "|" + df.format(c.getAbsoluteValue()) + "|" + " * (e ^ (j * (" + df.format(c.getArgument()) + ") ) )";
        return complexNumber;
    }

    public static String toGoniometric(Complex c) {
        DecimalFormat df = new DecimalFormat("###.##"); //round
        String complexNumber = "|" + df.format(c.getAbsoluteValue()) + "|" + " * ( (cos (" + df.format(c.getArgument()) + ") ) + j * (sin (" + df.format(c.getArgument()) + ") ) )";
        return complexNumber;
    }
}
