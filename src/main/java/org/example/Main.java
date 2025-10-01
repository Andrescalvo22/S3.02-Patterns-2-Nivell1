package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaMaster master1 = new PizzaMaster(hawaiianBuilder);
        Pizza hawaiianPizza = master1.makeHawaiianPizza();
        System.out.println(hawaiianPizza);

        PizzaBuilder vegBuilder = new VegetarianPizzaBuilder();
        PizzaMaster master2 = new PizzaMaster((vegBuilder));
        Pizza vegPizza = master2.makeVegetarianPizza();
        System.out.println(vegPizza);
    }
}