package headfirst.designpatterns.proxy.gumball;

public class WinnerState implements State {
	private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		execute("Please wait, we're already giving you a Gumball");
	}
 
	public void ejectQuarter() {
		execute("Please wait, we're already giving you a Gumball");
	}
 
	public void turnCrank() {
		execute("Turning again doesn't get you another gumball!");
	}
 
	public void dispense() {
		execute("YOU'RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if (!isExistGumball()) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (isExistGumball()) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
          		 	execute("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public boolean isExistGumball() {
		if (gumballMachine.getCount() > 0) {
			return true;
		}
		return false;
	};

	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}

	public void execute(String msg) {
		System.out.println(msg);
	}
}
