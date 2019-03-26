package factory.pizza;

import factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + super.name);
        super.dough = this.ingredientFactory.createDough();
        super.sauce = this.ingredientFactory.createSauce();
        super.cheese = this.ingredientFactory.createCheese();
    }
}
