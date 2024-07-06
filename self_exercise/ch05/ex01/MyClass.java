package ch05.ex01;

public class MyClass {
 
    private static MyClass uniqueInstance;

    private MyClass() {
        System.out.println("\n\nprivate MyClass");
    }
 
    public static MyClass getInstance() {
        System.out.println("\n\nget instance");

        if (uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;
    }
}
