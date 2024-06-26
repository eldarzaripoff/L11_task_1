package ru.netology;

import ru.netology.figures.Circle;
import ru.netology.figures.Rectangle;
import ru.netology.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 10, "#75CD5C", "#F08080");
        rectangle.info();
        System.out.println();

        Triangle triangle = new Triangle(5, 8, 10, "#F08080", "#F08081");
        triangle.info();
        System.out.println();

        Circle circle = new Circle(8, "#F08081", "#75CD5C");
        circle.info();

    }
}