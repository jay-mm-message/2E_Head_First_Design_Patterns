package headfirst.designpatterns.state.gumballstate;

//import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
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
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        execute("No gumball dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}

	public void execute(String msg) {
		System.out.println(msg);
	}
}
