package com.david.begin;

/**
 * Created by huoda on 16/6/25.
 */
public class Duck {
    private static final String TAG = "Duck";
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        flyBehavior = new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println(TAG + ": fly()");
            }
        };

        quackBehavior = new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println(TAG + ": quack()");
            }
        };
    }

    public void swim() {
        System.out.println(TAG + ": swim()");
    }

    public void display() {
        System.out.println(TAG + ": display()");
    }

    public void performQuack() {
        System.out.println(TAG + ": performQuack()");
        quackBehavior.quack();
    }

    public void performFly() {
        System.out.println(TAG + ": performFly()");
        flyBehavior.fly();
    }

    public interface FlyBehavior{
        void fly();
    }

    protected interface QuackBehavior{
        void quack();
    }

    public class FlyWithWings implements FlyBehavior {
        private static final String TAG = "FlyWithWings";

        @Override
        public void fly() {
            System.out.println(TAG + ": fly()");
        }
    }

    public class FlyNoWay implements FlyBehavior {
        private static final String TAG = "FlyNoWay";

        @Override
        public void fly() {
            System.out.println(TAG + ": fly()");
        }
    }

    public class FlyRocketPowered implements FlyBehavior {
        private static final String TAG = "FlyRocketPowered";

        @Override
        public void fly() {
            System.out.println(TAG + ": fly()");
        }
    }

    protected class Quack implements QuackBehavior {
        private static final String TAG = "Quack";

        @Override
        public void quack() {
            System.out.println(TAG + ": quack()");
        }
    }

    protected class Squeak implements QuackBehavior {
        private static final String TAG = "Squeak";

        @Override
        public void quack() {
            System.out.println(TAG + ": quack()");
        }
    }

    protected class MuteQuack implements QuackBehavior {
        private static final String TAG = "MuteQuack";

        @Override
        public void quack() {
            System.out.println(TAG + ": quack()");
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
