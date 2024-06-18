package ch01_strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {

		MallardDuck	mallard = new MallardDuck();
		mallard.setQuackBehavior(new Quack());
		mallard.display();
		mallard.performQuack();

		ModelDuck modelDuck = new ModelDuck();
		modelDuck.setQuackBehavior(new MuteQuack());
		modelDuck.display();
		modelDuck.performQuack();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.setQuackBehavior(new SqueakQuack());
		rubberDuck.display();
		rubberDuck.performQuack();
	}
}
