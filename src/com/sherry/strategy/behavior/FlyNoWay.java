package com.sherry.strategy.behavior;

/**
 * 行为类---不会飞
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
