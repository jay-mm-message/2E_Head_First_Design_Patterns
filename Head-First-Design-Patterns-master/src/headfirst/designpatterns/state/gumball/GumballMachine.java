package headfirst.designpatterns.state.gumball;

public class GumballMachine {
 
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
 
	int state = SOLD_OUT;
	int count = 0;
  
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
  
	public void execute(String msg) {
		System.out.println(msg);
	}

	public void insertQuarter() {
		switch (state) {
			case HAS_QUARTER:
				execute("You can't insert another quarter");
				break; 
			case NO_QUARTER:
				state = HAS_QUARTER;
				execute("You inserted a quarter");
				break; 
			case SOLD_OUT:
				execute("You can't insert a quarter, the machine is sold out");
				break; 
			case SOLD:
				execute("Please wait, we're already giving you a gumball");
				break;
			default:
				break;
		}
	}

	public void ejectQuarter() {
		switch (state) {
			case HAS_QUARTER:
				execute("Quarter returned");
				state = NO_QUARTER;
				break; 
			case NO_QUARTER:
				execute("You haven't inserted a quarter");
				break; 
			case SOLD:
				execute("Sorry, you already turned the crank");
				break; 
			case SOLD_OUT:
				execute("You can't eject, you haven't inserted a quarter yet");
				break;
			default:
				break;
		}
	}
 
	public void turnCrank() {
		switch (state) {
			case SOLD:
				execute("Turning twice doesn't get you another gumball!");
				break; 
			case NO_QUARTER:
				execute("You turned but there's no quarter");
				break;
			case SOLD_OUT:
				execute("You turned, but there are no gumballs");
				break;
			case HAS_QUARTER:
				execute("You turned...");
				state = SOLD;
				dispense();
				break;
			default:
				break;
		}
	}
 
	private void dispense() {
		switch (state) {
			case SOLD:
				execute("A gumball comes rolling out the slot");
				count = count - 1;
				if (count == 0) {
					execute("Oops, out of gumballs!");
					state = SOLD_OUT;
				} else {
					state = NO_QUARTER;
				}
				break;
			case NO_QUARTER:
				execute("You need to pay first");
				break;
			case SOLD_OUT:
				execute("No gumball dispensed");
				break;
			case HAS_QUARTER:
				execute("No gumball dispensed");
				break;
			default:
				break;
		}
	}
 
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}


