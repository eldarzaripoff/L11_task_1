package ru.netology.animals;

public class Dog extends Animal {
    private String name;
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String run(int length) {
        if (length < 500 && length > 0) return getName() +
                " пробежал " + length + " метров";
        return "Собака не может пробежать столько";
    }

    @Override
    public String swim(int length) {
        if (length < 10 && length > 0) return getName() +
                " проплыл " + length + " метров";
        return "Собака не может плыть столько";
    }

    public static int getCounter() {
        return counter;
    }
}
