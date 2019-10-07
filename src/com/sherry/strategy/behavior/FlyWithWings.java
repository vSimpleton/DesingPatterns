package com.sherry.strategy.behavior;

/**
 * 行为类---会飞
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
