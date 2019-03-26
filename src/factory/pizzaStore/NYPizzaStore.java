package factory.pizzaStore;

import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;
import factory.pizzaIngredientFactory.NYPizzaIngredientFactory;
import factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(this.ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(this.ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
