public class MiniDuckSimulator {
 
	static void newline() {
		System.out.println("");
	}

	public static void main(String[] args) {

		MallardDuck	mallard = new MallardDuck();
		mallard.setQuackBehavior(new Quack());
		mallard.display();
		mallard.performQuack();
		mallard.swim();
		newline();

		ModelDuck modelDuck = new ModelDuck();
		modelDuck.setQuackBehavior(new MuteQuack());
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.swim();
		newline();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.setQuackBehavior(new SqueakQuack());
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.swim();
		newline();
	}
}
