package com.david;

import com.david.begin.Duck;
import com.david.begin.Duck.*;
import com.david.begin.MallardDuck;
import com.david.begin.ModelDuck;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(modelDuck.new FlyRocketPowered());
        modelDuck.performFly();
    }
}
