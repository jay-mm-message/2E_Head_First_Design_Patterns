
public class DuckRubber extends Duck {
 
	// public RubberDuck() {
	// }
	
	// public RubberDuck(QuackBehavior quackBehavior) {
	// 	this.quackBehavior = quackBehavior; 
	// }
 
	public void display() {
		System.out.println("I'm a rubber duck");
	}

	@Override
	void swim() {
		System.out.println("RubberDuck ducks float");
	}

}
