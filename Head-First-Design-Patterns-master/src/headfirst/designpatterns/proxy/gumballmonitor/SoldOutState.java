package headfirst.designpatterns.proxy.gumballmonitor;

public class SoldOutState implements State {
	private static final long serialVersionUID = 2L;
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		execute("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectQuarter() {
		execute("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turnCrank() {
		execute("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		execute("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}

	public void execute(String msg) {
		System.out.println(msg);
	}
}
