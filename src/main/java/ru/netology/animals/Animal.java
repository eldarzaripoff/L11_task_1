package ru.netology.animals;

public class Animal {
    private String name;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String run(int length) {
        return getName() + " пробежал " + length + " м";
    }

    public String swim(int length) {
        return getName() + " проплыл " + length + " м";
    }

    public static int getCounter() {
        return counter;
    }
}
