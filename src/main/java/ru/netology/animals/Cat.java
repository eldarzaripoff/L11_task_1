package ru.netology.animals;

import ru.netology.additionalItems.Bowl;

public class Cat extends Animal {
    private String name;
    private static int counter = 0;
    private boolean satiety = false;
    private int minimalNorm = 5;

    public Cat(String name) {
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
        if (length < 200 && length > 0) return getName() +
                " пробежал " + length + " метров";
        return "Кот не может пробежать столько";
    }

    @Override
    public String swim(int length) {
        return "Кот " + getName() + " не умеет плавать";
    }

    public static int getCounter() {
        return counter;
    }

    public void eat(int eatenFood, Bowl bowl) {
        if (eatenFood <= bowl.getFoodQuantity() && eatenFood >= minimalNorm) {
            System.out.println("Котом по имени " + getName() + " cъедено " + eatenFood + " еды");
            satiety = true;
            bowl.removeFoodFromBowl(eatenFood);
        } else {
            System.out.println("Увеличьте норму, кот " + getName() + " не наестся");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void info() {
        System.out.println("Сытость кота " + getName() + " : " + satiety);
    }
}
