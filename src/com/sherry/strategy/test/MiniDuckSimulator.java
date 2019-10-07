package com.sherry.strategy.test;

import com.sherry.strategy.behavior.FlyRocketPowered;
import com.sherry.strategy.duck.Duck;
import com.sherry.strategy.duck.MallardDuck;
import com.sherry.strategy.duck.ModelDuck;

/**
 * 测试行为类
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); //改变鸭子的飞行行为
        model.performFly();
    }

}
