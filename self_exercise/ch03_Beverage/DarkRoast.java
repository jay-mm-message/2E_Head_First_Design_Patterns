package ch03_Beverage;

public class DarkRoast extends Beverage {

    DarkRoast() {
        description = "DarkRoast";
    }
    
    @Override
    public double cost() {
        return 0.99;
    }
    
}
