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
		gM.executeTags("insertQuarter");
		gM.insertQuarter();

		gM.executeTags("turnCrank");
		gM.turnCrank();

		gM.executeTags("insertQuarter");
		gM.insertQuarter();

		gM.executeTags("turnCrank");
		gM.turnCrank();
		
		gM.executeTags("refill");
		gM.refill(5);

		gM.executeTags("insertQuarter");
		gM.insertQuarter();

		gM.executeTags("turnCrank");
		gM.turnCrank();

		// System.out.println(gumballMachine);
	}
}
