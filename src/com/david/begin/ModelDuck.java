package com.david.begin;

/**
 * Created by huoda on 16/6/25.
 */
public class ModelDuck extends Duck{
    private static final String TAG = "ModelDuck";

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
