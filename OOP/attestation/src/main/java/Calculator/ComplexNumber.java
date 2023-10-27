package Calculator;

import java.util.logging.Level;

import java.util.logging.Logger;


public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    @Override
    public String toString() {
        return "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart + "i";
    }

    public ComplexNumber(double realPart, double imaginaryPart) {

        this.realPart = realPart;

        this.imaginaryPart = imaginaryPart;

    }

    public double getRealPart() {

        return realPart;

    }

    public void setRealPart(double realPart) {

        this.realPart = realPart;

    }

    public double getImaginaryPart() {

        return imaginaryPart;

    }

    public void setImaginaryPart(double imaginaryPart) {

        this.imaginaryPart = imaginaryPart;

    }

}


