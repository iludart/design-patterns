package decorator;

public class MilkDecorator extends CondimentDecorator {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
}
