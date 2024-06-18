package ch01_strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
