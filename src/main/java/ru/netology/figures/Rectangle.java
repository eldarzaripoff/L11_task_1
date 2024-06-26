package ru.netology.figures;

import ru.netology.GeometricShape;

public class Rectangle implements GeometricShape {

    double lengthSideA;
    double lengthSideB;
    String fillColor;
    String borderColor;

    public Rectangle(double lengthSideA, double lengthSideB, String fillColor, String borderColor) {
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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
    public double calculatePerimeter() {
        return 2 * lengthSideA + 2 * lengthSideB;
    }

    @Override
    public double calculateArea() {
        return lengthSideA * lengthSideB;
    }

    @Override
    public void info() {
        System.out.println("[ " + calculatePerimeter() + ", " + calculateArea()
                + ", " + getFillColor() + ", " + getBorderColor() + " ]");
    }
}

