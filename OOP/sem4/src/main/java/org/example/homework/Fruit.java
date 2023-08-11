package org.example.homework;

public abstract class Fruit {
    protected int quantity;

    public Fruit(int weight) {
        this.quantity = weight;
    }

    public int getQuantity() {
        return quantity;
    }
}
