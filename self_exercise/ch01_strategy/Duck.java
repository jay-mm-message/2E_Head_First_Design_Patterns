
package ch01_strategy;

public abstract class Duck {
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	abstract void display();

	public void performQuack() {
		System.out.print("Say: ");
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
