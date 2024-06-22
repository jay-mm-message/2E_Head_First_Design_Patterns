package ch02_observer_weatherStation_other;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    
    private List<Observer> observers;
    
    WeatherSubject() {
        observers = new ArrayList<Observer>();
        temperature = 0.0f;
        humidity = 0.0f;
        pressure = 0.0f;
    }

    private float temperature;
    public float getTemperature() {
        return temperature;
    }

    private float humidity;
    public float getHumidity() {
        return humidity;
    }

    private float pressure;

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) { this.observers.add(o); }

    @Override
    public void unregisterObserver(Observer o) { this.observers.remove(o); }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
