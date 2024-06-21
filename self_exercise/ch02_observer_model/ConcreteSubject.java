package ch02_observer_model;

public class ConcreteSubject implements Subject {
    
    @Override
    public void registerObserver() {
        Tools.newline();
        Tools.tags("registerObserver");
    }

    @Override
    public void unregisterObserver() {
        Tools.newline();
        Tools.tags("unregisterObserver");
    }

    @Override
    public void notifyObserver() {
        Tools.newline();
        Tools.tags("notifyObserver");
    }
    
}
