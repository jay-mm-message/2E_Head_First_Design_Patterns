package self_review.ch01_delegate;

public class DuckSimulator {
    public static void main(String [] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
        duck.performFly();

        duck = new ModelDuck();
        duck.setFlyBehavior(new FlyNoWays());
        duck.display();
        duck.performFly();
    }
}
