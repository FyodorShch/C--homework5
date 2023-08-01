package org.example;

import java.util.ArrayList;

class Human extends Client{
    public Human(ArrayList<String> order) {
        super(order);
    }

    @Override
    public void setOrderMade(boolean b) {
        this.orderMade = b;
    }

    @Override
    public void setOrderTaken(boolean b) {
        this.orderTaken = b;
    }

    @Override
    public void makeOrder() {

    }

    @Override
    public void takeOrder() {

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}