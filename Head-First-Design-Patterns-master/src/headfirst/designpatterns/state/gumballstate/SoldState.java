package headfirst.designpatterns.state.gumballstate;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		execute("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		execute("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		execute("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (isExistGumball()) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			execute("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispensing a gumball";
	}
	
	public boolean isExistGumball() {
		if (gumballMachine.getCount() > 0) {
			return true;
		}
		return false;
	}
	public void execute(String msg) {
		System.out.println(msg);
	}
}


