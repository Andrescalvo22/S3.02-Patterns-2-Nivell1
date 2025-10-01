package org.example;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);

    PizzaBuilder setDough(String dough);

    PizzaBuilder addTopping(String topping);

    Pizza build();
}
