package com.sherry.observer.test;


import com.sherry.observer.test.Observer;

/**
 * 定义被观察者的接口
 */
public interface Subject {

    void registerObserver(Observer o); //注册观察者

    void removeObserver(Observer o); //删除观察者

    void notifyObserver(); //当被观察者的状态改变时，通知所有的观察者

}
