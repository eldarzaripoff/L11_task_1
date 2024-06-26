package ru.netology.figures;

import ru.netology.GeometricShape;

public class Triangle implements GeometricShape {
    double sideA;
    double sideB;
    double sideC;
    double p;
    String fillColor;
    String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        p = (sideA + sideB + sideC) / 2;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeterForTriangle() {
        return sideA + sideB + sideC;
    }

    /*
    по формуле Герона
     */
    @Override
    public double calculateArea() {
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void info() {
        System.out.println("[ " + calculatePerimeterForTriangle() + ", " + calculateArea()
                + ", " + getFillColor() + ", " + getBorderColor() + " ]");
    }
}
