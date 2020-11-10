package tactics;

import tactics.fly.SlowFly;

public class MyTest {
    public static void main(String[] args) {
        Duck duck = new GreenDuck();
        duck.performFly();
        duck.setFlyBehavior(new SlowFly());
        duck.performFly();
    }
}
