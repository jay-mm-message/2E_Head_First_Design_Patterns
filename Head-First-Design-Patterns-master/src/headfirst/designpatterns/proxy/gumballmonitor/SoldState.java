package headfirst.designpatterns.proxy.gumballmonitor;

public class SoldState implements State {
	private static final long serialVersionUID = 2L;
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
		try {
			if (isExistGumball()) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				execute("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isExistGumball() {
		if (this.gumballMachine.getCount() > 0) {
			return true;
		}
		return false;
	}
 
	public String toString() {
		return "dispensing a gumball";
	}

	public void execute(String msg) {
		System.out.println(msg);
	}
}
