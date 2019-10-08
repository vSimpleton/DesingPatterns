package com.sherry.observer.test;

/**
 * 模拟布告板，接收到被观察者推送过来的变化并显示在布告板上
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); //在构造函数中订阅主题
    }

    @Override
    public void display() {
        System.out.println("temp:" + temp + ", humidity:" + humidity); //显示
    }

    /**
     * 更新主题发送过来的数据
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
