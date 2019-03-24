package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new MilkDecorator(espresso);
        espresso = new WhipDecorator(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage decaf = new Decaf();
        decaf = new MilkDecorator(decaf);
        decaf = new MilkDecorator(decaf);
        System.out.println(decaf.getDescription() + " $" + decaf.cost());
    }
}
