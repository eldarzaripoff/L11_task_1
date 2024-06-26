package ru.netology;

public interface GeometricShape {
    default double calculatePerimeter() {
        return 0.0;
    }

    default double calculatePerimeterForCircle() {
        return 0.0;
    }

    default double calculatePerimeterForTriangle() {
        return 0.0;
    }

    default double calculateArea() {
        return 0.0;
    }

    default double calculateAreaForCircle() {
        return 0.0;
    }

    default void info() {
        System.out.println();
    }
}

