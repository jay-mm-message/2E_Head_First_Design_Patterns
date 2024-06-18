package ch01_strategy;

public class SqueakQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    } 
}
