package com.sherry.observer.test;

import java.util.ArrayList;

/**
 * 定义一个气象观测站，把变化推给观察者
 */
public class WeatherData implements Subject {

    private ArrayList observers; //记录观察者
    private float temp; //温度
    private float humidity; //湿度
    private float pressure; //气压

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        // 遍历所有观察者，并把变化推给所有观察者
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChange() {
        notifyObserver();
    }

    /**
     * 从气象站得到新数据时，通知观察者
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
}
