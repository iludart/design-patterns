package factory.pizzaStore;

import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;
import factory.pizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(this.ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(this.ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }

        return pizza;
    }
}
