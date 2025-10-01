package org.example;

import java.util.List;
import java.util.ArrayList;

public class Pizza {
    private String size;
    private String dough;
    List<String> toppings = new ArrayList<>();

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getDough() {
        return dough;
    }

    public void addToppings(String topping) {

        this.toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String toString() {
        return "Pizza [Size: " + size + ", Dough: " + dough + ", Toppings: " + toppings + "]";
    }
}
