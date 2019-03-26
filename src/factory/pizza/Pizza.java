package factory.pizza;

import factory.pizzaIngredient.cheese.Cheese;
import factory.pizzaIngredient.clam.Clam;
import factory.pizzaIngredient.dough.Dough;
import factory.pizzaIngredient.pepperoni.Pepperoni;
import factory.pizzaIngredient.sauce.Sauce;
import factory.pizzaIngredient.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;

    protected Dough dough;

    protected Sauce sauce;

    protected Veggies[] veggies;

    protected Cheese cheese;

    protected Pepperoni pepperoni;

    protected Clam clam;

    protected List<String> toppings = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official FactoryMethodPizzaStore box\n");
    }

    public abstract void prepare();
}
