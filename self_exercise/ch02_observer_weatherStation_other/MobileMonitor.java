package ch02_observer_weatherStation_other;

public class MobileMonitor implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherSubject weatherSubject;

    public MobileMonitor(WeatherSubject ws) {
        this.weatherSubject = ws;
        this.weatherSubject.registerObserver(this);
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    @Override
    public void update() {
        this.temperature = this.weatherSubject.getTemperature();
        this.humidity = this.weatherSubject.getHumidity();
        this.pressure = this.weatherSubject.getPressure();
        showWeatherInformation();
    }

    public void showWeatherInformation() {

        System.out.println("\n==== Mobile screen displays weather information. ====");
        System.out.println("======================================\n" +
                            this.temperature + " F degrees, " + 
                            this.humidity + " % humidity and " +
                            this.pressure + " pressure");
    }
    
}
