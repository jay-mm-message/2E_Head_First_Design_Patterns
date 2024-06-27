package self_review.ch01_delegate;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    
    public void performFly() {
        flyBehavior.fly();
    }
    public abstract void display();
}
