
public class RubberDuck extends Duck {
 
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
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'swim'");
		System.out.println("RubberDuck ducks float");
	}

}
