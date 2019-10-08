package com.sherry.observer.test;

/**
 * 定义观察者接口
 */
public interface Observer {

    /**
     * 当被观察者状态改变时，会把以下参数发送给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);

}
