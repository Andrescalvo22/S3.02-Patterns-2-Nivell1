package org.example;

public class PizzaMaster {
    private PizzaBuilder builder;

    public PizzaMaster(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeHawaiianPizza() {
        return builder
                .setSize("Medium")
                .setDough("Thin")
                .addTopping("Ham")
                .addTopping("Tomato")
                .addTopping("Cheese")
                .addTopping("Pineapple")
                .build();
    }

    public Pizza makeVegetarianPizza() {
        return builder
                .setSize("Large")
                .setDough("Thick")
                .addTopping("Tomato")
                .addTopping("Cheese")
                .addTopping("Mushrooms")
                .addTopping("Pepper")
                .build();
    }
}
