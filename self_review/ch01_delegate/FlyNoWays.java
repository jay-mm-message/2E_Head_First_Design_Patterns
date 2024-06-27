package self_review.ch01_delegate;

public class FlyNoWays implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
    
}
