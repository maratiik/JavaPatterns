package game.maratik.observer.observer;

import game.maratik.observer.subject.Subject;
import game.maratik.observer.subject.WeatherData;

public class TemperatureDisplay implements DisplayElement, Observer {
    private float temperature;
    private Subject weatherData;

    public TemperatureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature: " + temperature);
    }

    @Override
    public void update() {
        WeatherData specificWeatherData = (WeatherData) weatherData;
        this.temperature = specificWeatherData.getTemperature();
        display();
    }
}
