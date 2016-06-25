package com.david.begin;

/**
 * Created by huoda on 16/6/25.
 */
public class MallardDuck extends Duck {
    private static final String TAG = "MallarDuck";

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    @Override
    public void display() {
        super.display();
    }
}
