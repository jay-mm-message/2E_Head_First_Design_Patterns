package ch02_observer_weatherStation;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
