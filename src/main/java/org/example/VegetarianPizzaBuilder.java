
package org.example;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        pizza.addToppings(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}
