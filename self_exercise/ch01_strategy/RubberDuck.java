package ch01_strategy;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
	}
	
	public RubberDuck(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}

}
