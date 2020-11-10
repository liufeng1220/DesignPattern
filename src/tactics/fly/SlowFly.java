package tactics.fly;

public class SlowFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("慢慢飞");
    }
}
