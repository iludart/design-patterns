package decorator;

public abstract class Beverage {

    protected String description = "Unknown beverage";

    public Beverage() {}

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
