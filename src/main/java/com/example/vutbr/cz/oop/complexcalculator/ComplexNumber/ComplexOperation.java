package com.example.vutbr.cz.oop.complexcalculator.ComplexNumber;

import com.example.vutbr.cz.oop.complexcalculator.ProgramRun.ExceptionHandling;

public class ComplexOperation {

    //returns sum of two complex numbers
    public static Complex add(Complex c1, Complex c2) {
        double realPart = c1.getRealPart() + c2.getRealPart();
        double imaginaryPart = c1.getImaginaryPart() + c2.getImaginaryPart();
        Complex c = new Complex(realPart, imaginaryPart);
        return c;
    }

    //returns difference of two complex numbers
    public static Complex deduct(Complex c1, Complex c2) {
        double realPart = c1.getRealPart() - c2.getRealPart();
        double imaginaryPart = c1.getImaginaryPart() - c2.getImaginaryPart();
        Complex c = new Complex(realPart, imaginaryPart);
        return c;
    }

    //returns product of two complex numbers
    public static Complex multiply(Complex c1, Complex c2) {
        double realPart = c1.getRealPart() * c2.getRealPart() - c1.getImaginaryPart() * c2.getImaginaryPart();
        double imaginaryPart = c1.getRealPart() * c2.getImaginaryPart() + c1.getImaginaryPart() * c2.getRealPart();
        Complex c = new Complex(realPart, imaginaryPart);
        return c;
    }

    //returns share of two complex numbers
    public static Complex divide(Complex c1, Complex c2) {
        Complex c = null;
        try {
            if (c2.getRealPart() != 0 && c2.getImaginaryPart() != 0) {
                double realPart = (c1.getRealPart() * c2.getRealPart() + c1.getImaginaryPart() * c2.getImaginaryPart())
                        / (Math.pow(c2.getRealPart(), 2) + Math.pow(c2.getImaginaryPart(), 2));
                double imaginaryPart = (c1.getImaginaryPart() * c2.getRealPart() - c1.getRealPart() * c2.getImaginaryPart())
                        / (Math.pow(c2.getRealPart(), 2) + Math.pow(c2.getImaginaryPart(), 2));
                c = new Complex(realPart, imaginaryPart);
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            ExceptionHandling.showException("Cannot divide by zero!");
            System.out.println(e.getMessage());
        } catch (NullPointerException i) {
            ExceptionHandling.showException("Error occured.");
            System.out.println(i.getMessage());
        }
        return c;
    }
}
