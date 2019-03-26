package factory.pizza;

import factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + super.name);
        super.dough = this.ingredientFactory.createDough();
        super.sauce = this.ingredientFactory.createSauce();
        super.cheese = this.ingredientFactory.createCheese();
        super.clam = this.ingredientFactory.createClam();
    }
}
