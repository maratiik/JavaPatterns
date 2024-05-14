package game.maratik.observer;

import game.maratik.observer.observer.HumidityDisplay;
import game.maratik.observer.observer.PressureDisplay;
import game.maratik.observer.observer.TemperatureDisplay;
import game.maratik.observer.subject.WeatherData;

public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        weatherData.setMeasurements(36.6f, 70f, 100f);
        System.out.println();
        weatherData.setMeasurements(10, 20, 30);

    }
}
