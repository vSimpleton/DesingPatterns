package com.sherry.strategy.duck;

import com.sherry.strategy.behavior.FlyWithWings;
import com.sherry.strategy.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
