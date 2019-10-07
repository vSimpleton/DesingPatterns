package com.sherry.strategy.duck;

import com.sherry.strategy.behavior.FlyBehavior;
import com.sherry.strategy.behavior.QuackBehavior;

/**
 * 鸭子的父类
 */
public abstract class Duck {

    // 声明行为接口，使所有子类具有这两个行为接口的实例变量
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(); //调用该行为类
    }

    public void performQuack() {
        quackBehavior.quack(); //调用该行为类
    }

    public void swim() {
        System.out.println("swimming");
    }

    // 以下两个方法方便动态改变鸭子的行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
