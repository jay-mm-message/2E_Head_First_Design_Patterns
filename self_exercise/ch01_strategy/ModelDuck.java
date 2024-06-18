
public class ModelDuck extends Duck {

	// public ModelDuck() {
	// 	quackBehavior = new Quack();
	// }

	public void display() {
		System.out.println("I'm a model duck");
	}

	@Override
	void swim() {
		System.out.println("ModelDuck ducks float");
	}
}
