package ch03_Beverage;

public class StarbucksStore {
    public static void newline() {
        System.out.println("\n");
    }
    public static void showCost(Beverage b) {
        newline();
        System.out.println(b.getDescription());
        System.out.println("$" + b.cost());
    }

    public static void main(String [] args) {
    
        Beverage beverage = new Espresso();
        showCost(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        showCost(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        showCost(beverage3);
    }
}
