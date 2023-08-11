package org.example.homework;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fructs;

    public Box(ArrayList<T> fructs) {
        this.fructs = fructs;
    }
    public Box(){
        this.fructs = new ArrayList<>();
    }

    public void add(T fruct){
        fructs.add((T)fruct);
    }

    public double getWeight(){
        double weightOfBox = 0.0;
        for (T fruct: fructs) {
            if (fruct instanceof Apple) {
                weightOfBox += 1.0*fruct.getQuantity();
            }
            else if(fruct instanceof Orange) {
                weightOfBox += 1.5*fruct.getQuantity();
            }
        }
        return weightOfBox;
    }
    public boolean compare(Box<Apple> otherBox){
        return (this.getWeight() - otherBox.getWeight()) == 0;
    }

    public void transferFruits(Box<T> otherBox) {
        for (T fruct : fructs) {
            otherBox.add(fruct);
        }
        fructs.clear();
    }
}
