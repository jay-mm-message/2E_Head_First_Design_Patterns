public class MiniDuckSimulator {
 
	public static void newline() {
		System.out.println("");
	}

	public static void main(String[] args) {
		newline();

		DuckMallard	mallard = new DuckMallard();
		mallard.display();
		mallard.swim();
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.performFly();
		newline();

		DuckModel modelDuck = new DuckModel();
		modelDuck.display();
		modelDuck.swim();
		modelDuck.setFlyBehavior(new FlyNoWays());
		modelDuck.performFly();
		newline();

		DuckRubber rubberDuck = new DuckRubber();
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.setFlyBehavior(new FlyNoWays());
		rubberDuck.performFly();
		newline();
	}
}
