package ru.netology.figures;

import ru.netology.GeometricShape;

public class Circle implements GeometricShape {
    double radius;
    String fillColor;
    String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
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
    public double calculatePerimeterForCircle() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateAreaForCircle() {
        return Math.PI * radius * radius;
    }

    @Override
    public void info() {
        System.out.println("[ " + calculatePerimeterForCircle() + ", " + calculateAreaForCircle()
                + ", " + getFillColor() + ", " + getBorderColor() + " ]");
    }
}