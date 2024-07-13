package headfirst.designpatterns.state.gumballstate;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		//gM : gumballMachine
		GumballMachine gM = new GumballMachine(2);


		// System.out.println(gM);
		gM.executeTags("insertQuarter");
		gM.insertQuarter();

		gM.executeTags("turnCrank");
		gM.turnCrank();

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
