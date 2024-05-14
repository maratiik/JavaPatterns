package game.maratik.observer.observer;

import game.maratik.observer.subject.Subject;
import game.maratik.observer.subject.WeatherData;

public class HumidityDisplay implements DisplayElement, Observer {
    private float humidity;
    private Subject weatherData;

    public HumidityDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current humidity: " + humidity);
    }

    @Override
    public void update() {
        WeatherData specificWeatherData = (WeatherData) weatherData;
        this.humidity = specificWeatherData.getHumidity();
        display();
    }
}
