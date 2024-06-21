package ch02_observer_weatherStation;

public class TestWeatherStation {
    public static void main(String [] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        WatchMonitor displayMonitor = new WatchMonitor(weatherSubject);
        MobileMonitor mobileMonitor = new MobileMonitor(weatherSubject);

        weatherSubject.setMeasurements(81.7f, 65.8f, 10.0f);
    
        weatherSubject.unregisterObserver(displayMonitor);
        
        weatherSubject.setMeasurements(31.7f, 25.8f, 20.0f);

        weatherSubject.unregisterObserver(mobileMonitor);
        
        weatherSubject.registerObserver(displayMonitor);

        weatherSubject.setMeasurements(21.7f, 15.8f, 10.0f);
    
    }
}
