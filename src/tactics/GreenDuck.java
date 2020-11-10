package tactics;

import tactics.fly.FastFly;

public class GreenDuck extends Duck {
    public GreenDuck(){
        flyBehavior = new FastFly();
    }
}
