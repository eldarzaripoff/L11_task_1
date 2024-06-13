package ru.netology;

import ru.netology.additionalItems.Bowl;
import ru.netology.animals.Animal;
import ru.netology.animals.Cat;
import ru.netology.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        System.out.println(dog.run(150));
        System.out.println(dog.swim(8));
        System.out.println();

        Cat cat = new Cat("Barsik");
        System.out.println(cat.run(198));
        System.out.println();

        System.out.println("Количество созданных животных: " + Animal.getCounter());
        System.out.println("Количество созданных котов: " + Cat.getCounter());
        System.out.println("Количество созданных собак: " + Dog.getCounter());
        System.out.println();

        Bowl bowl = new Bowl(10);
        cat.info();
        bowl.info();
        cat.eat(10, bowl);
        cat.info();
        bowl.info();
        bowl.addFoodInBowl(50);
        System.out.println();

        Cat[] cats = {new Cat("Snezhok"), new Cat("Dymok")};
        for (Cat eachCat : cats) {
            eachCat.eat(10, bowl);
            eachCat.info();
        }
        System.out.println();
        System.out.println("Количество созданных животных: " + Animal.getCounter());
    }
}