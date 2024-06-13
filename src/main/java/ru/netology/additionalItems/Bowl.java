package ru.netology.additionalItems;

public class Bowl {
    private int foodQuantity;

    public Bowl(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void addFoodInBowl(int foodQuantity) {
        System.out.println("В миску добавлено " + foodQuantity + " еды");
        this.foodQuantity += foodQuantity;
    }

    public void removeFoodFromBowl(int removalQuantity) {
        if (removalQuantity <= this.foodQuantity) {
            this.foodQuantity -= removalQuantity;
        } else {
            System.out.println("Содержимого в миске слишком мало: уменьшите норму еды или пополните едой миску");
        }
    }

    public void info() {
        System.out.println("Миска содержит " + foodQuantity + " еды.");
    }
}
