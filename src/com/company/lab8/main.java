package com.company.lab8;

import com.company.lab8.observer.CurrentConditionDisplay;
import com.company.lab8.observer.Observer;
import com.company.lab8.observer.WeatherData;

public class main {
    public static void main(String[] args) {
        // Observer
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentConditionDisplay();

        weatherData.registerObserver(observer);
        weatherData.setMeasure(12, 32, 32);
        weatherData.setMeasure(22, 12, 54);
        weatherData.notifyObserver();


    }
}