package com.sherry.observer.test;

import com.sherry.observer.test.CurrentConditionDisplay;
import com.sherry.observer.test.WeatherData;

/**
 * 测试类，模拟数据推送给观察者
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f); //模拟气象数据
    }

}
