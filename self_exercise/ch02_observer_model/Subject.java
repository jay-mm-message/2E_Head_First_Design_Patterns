package ch02_observer_model;

public interface Subject {
    public void registerObserver();
    public void unregisterObserver();
    public void nodifyObserver();
}
