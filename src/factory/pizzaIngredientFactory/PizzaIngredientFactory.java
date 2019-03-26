package factory.pizzaIngredientFactory;

import factory.pizzaIngredient.cheese.Cheese;
import factory.pizzaIngredient.clam.Clam;
import factory.pizzaIngredient.dough.Dough;
import factory.pizzaIngredient.pepperoni.Pepperoni;
import factory.pizzaIngredient.sauce.Sauce;
import factory.pizzaIngredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clam createClam();
}
