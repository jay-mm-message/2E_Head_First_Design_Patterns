package headfirst.designpatterns.state.gumballstate;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		//gM : gumballMachine
		GumballMachine gM = new GumballMachine(2);

		gM.execute("\n\n\n");
		// System.out.println(gM);
		gM.execute("init");
		gM.currentState();

		gM.execute("insertQuarter");
		gM.insertQuarter();
		gM.currentState();

		gM.execute("turnCrank");
		gM.turnCrank();
		gM.currentState();

		// System.out.println(gumballMachine);

		// gumballMachine.insertQuarter();
		// gumballMachine.turnCrank();
		// gumballMachine.insertQuarter();
		// gumballMachine.turnCrank();
		
		// gumballMachine.refill(5);
		// gumballMachine.insertQuarter();
		// gumballMachine.turnCrank();

		// System.out.println(gumballMachine);
	}
}
