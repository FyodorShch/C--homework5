package org.example;

import java.util.ArrayList;

public abstract class Client implements PeopleBehavior {
    protected String name;
    protected ArrayList<String> order;
    protected boolean orderMade;
    protected boolean orderTaken;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<String> order) {
        this.order = order;
    }

    public Client(ArrayList<String> order) {
        this.order = order;
    }

    public abstract void setOrderMade(boolean b);

    public abstract void setOrderTaken(boolean b);
}
