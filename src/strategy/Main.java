package strategy;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(new FlyWithWings(), new Squeak());
        duck.performFly();
        duck.performQuack();
    }
}
