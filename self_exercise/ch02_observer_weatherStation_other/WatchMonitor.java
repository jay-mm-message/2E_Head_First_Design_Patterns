package ch02_observer_weatherStation_other;

public class WatchMonitor implements Observer {

    private WeatherSubject weatherSubject;

    public WatchMonitor(WeatherSubject ws) { 
        this.weatherSubject = ws;
        this.weatherSubject.registerObserver(this);

        temperature = 0.0f;
        humidity = 0.0f;
        pressure = 0.0f;
    }
    
    private float temperature;
    private float humidity;
    private float pressure;

    public void displayFormat() {
        System.out.println("\n==== Watch screen displays weather information ====");
        System.out.println("======================================\n" +
                            this.temperature + " F degrees, " + 
                            this.humidity + " % humidity and " +
                            this.pressure + " pressure");
    }

    @Override
    public void update() {
        this.temperature = this.weatherSubject.getTemperature();
        this.humidity = this.weatherSubject.getHumidity();
        this.pressure = this.weatherSubject.getPressure();

        displayFormat();
    }
    
}
