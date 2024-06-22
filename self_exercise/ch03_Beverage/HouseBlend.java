package ch03_Beverage;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
    
}
