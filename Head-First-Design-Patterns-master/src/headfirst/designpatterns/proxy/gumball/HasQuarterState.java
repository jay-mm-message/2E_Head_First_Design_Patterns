package headfirst.designpatterns.proxy.gumball;

import java.util.Random;

public class HasQuarterState implements State {
	private static final long serialVersionUID = 2L;
	Random randomWinner = new Random(System.currentTimeMillis());
	transient GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		execute("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		execute("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		execute("You turned...");
		int winner = randomWinner.nextInt(10);
		if (winner == 0) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        execute("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}

	public void execute(String msg) {
		System.out.println(msg);
	}
}
