package factory;

import factory.pizza.Pizza;
import factory.pizzaStore.ChicagoPizzaStore;
import factory.pizzaStore.NYPizzaStore;
import factory.pizzaStore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza1 = chicagoStore.orderPizza("clam");
    }
}
