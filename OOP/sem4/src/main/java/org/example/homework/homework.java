package org.example.homework;

import org.example.homework.*;

public class homework {
    public static void main(String[] args) {
        Apple apple = new Apple(2);
        Box<Apple> apples = new Box<>();
        Orange orange = new Orange(3);
        Box<Orange> oranges = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        apples.add(apple);
        apples.add(apple);
        oranges.add(orange);
        System.out.println(orangeBox.getWeight());
        System.out.println(oranges.getWeight());
        orangeBox.transferFruits(oranges);
        System.out.println(orangeBox.getWeight());
        System.out.println(oranges.getWeight());
    }
}
