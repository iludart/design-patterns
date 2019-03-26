package factory.pizzaIngredientFactory;

import factory.pizzaIngredient.cheese.Cheese;
import factory.pizzaIngredient.cheese.ReggianoCheese;
import factory.pizzaIngredient.clam.Clam;
import factory.pizzaIngredient.clam.FreshClam;
import factory.pizzaIngredient.dough.Dough;
import factory.pizzaIngredient.dough.ThinCrustDough;
import factory.pizzaIngredient.pepperoni.Pepperoni;
import factory.pizzaIngredient.pepperoni.SlicedPepperoni;
import factory.pizzaIngredient.sauce.MarinaraSauce;
import factory.pizzaIngredient.sauce.Sauce;
import factory.pizzaIngredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
            new Garlic(),
            new Onion(),
            new Mushroom(),
            new RedPepper()
        };

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
