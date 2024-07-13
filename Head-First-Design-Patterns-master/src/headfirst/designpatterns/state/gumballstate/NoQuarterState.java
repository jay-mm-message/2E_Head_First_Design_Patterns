package headfirst.designpatterns.state.gumballstate;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		execute("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		execute("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		execute("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		execute("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for quarter";
	}

	public void execute(String msg) {
		System.out.println(msg);
	}
}
