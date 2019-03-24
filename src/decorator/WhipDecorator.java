package decorator;

public class WhipDecorator extends CondimentDecorator {

    private Beverage beverage;

    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
}
