package ch02_observer_model;

public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        Tools.newline();
        Tools.tags("update");
    }
    
}
