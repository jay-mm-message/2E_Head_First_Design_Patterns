public class MiniDuckSimulator {
 
	static void newline() {
		System.out.println("");
	}

	public static void main(String[] args) {
		newline();

		DuckMallard	mallard = new DuckMallard();
		mallard.setQuackBehavior(new Quack());
		mallard.display();
		mallard.performQuack();
		mallard.swim();
		newline();

		DuckModel modelDuck = new DuckModel();
		modelDuck.setQuackBehavior(new QuackMute());
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.swim();
		newline();

		DuckRubber rubberDuck = new DuckRubber();
		rubberDuck.setQuackBehavior(new QuackSqueak());
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.swim();
		newline();
	}
}
