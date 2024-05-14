package game.maratik.observer.observer;

import game.maratik.observer.subject.Subject;
import game.maratik.observer.subject.WeatherData;

public class PressureDisplay implements DisplayElement, Observer {
    private float pressure;
    private Subject weatherData;

    public PressureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current pressure: " + pressure);
    }

    @Override
    public void update() {
        WeatherData specificWeatherData = (WeatherData) weatherData;
        this.pressure = specificWeatherData.getPressure();
        display();
    }
}
