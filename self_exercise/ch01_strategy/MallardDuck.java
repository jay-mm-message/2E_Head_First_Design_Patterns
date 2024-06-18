
public class MallardDuck extends Duck {

	// public MallardDuck() {
	// 	quackBehavior = new Quack();
	// }

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

	@Override
	void swim() {
		System.out.println("Mallard ducks float");
	}
	
}
