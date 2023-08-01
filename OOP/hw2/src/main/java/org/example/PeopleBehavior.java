package org.example;

public interface PeopleBehavior {
    void makeOrder();
    void takeOrder();

    boolean orderComplete = false;
    boolean orderTaken = false;
}
