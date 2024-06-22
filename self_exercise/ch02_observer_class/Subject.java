package ch02_observer_class;

public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyClassTime();
}
