package factory.pizzaIngredientFactory;

import factory.pizzaIngredient.cheese.Cheese;
import factory.pizzaIngredient.cheese.MozzarellaCheese;
import factory.pizzaIngredient.clam.Clam;
import factory.pizzaIngredient.clam.FrozenClam;
import factory.pizzaIngredient.dough.Dough;
import factory.pizzaIngredient.dough.ThickCrustDough;
import factory.pizzaIngredient.pepperoni.Pepperoni;
import factory.pizzaIngredient.pepperoni.SlicedPepperoni;
import factory.pizzaIngredient.sauce.PlumTomatoSauce;
import factory.pizzaIngredient.sauce.Sauce;
import factory.pizzaIngredient.veggies.BlackOlives;
import factory.pizzaIngredient.veggies.EggPlant;
import factory.pizzaIngredient.veggies.Spinach;
import factory.pizzaIngredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
            new Spinach(),
            new EggPlant(),
            new BlackOlives()
        };

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
