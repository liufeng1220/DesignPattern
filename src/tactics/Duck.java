package tactics;

import tactics.fly.FlyBehavior;
import tactics.quack.QuackBehavior;

/**
 * 多用组合少用继承
 * 把需要变化的部分单独提取出来，针对接口编程而不是实现编程。。。
 * 针对接口编程而不是实现编程
 *
 */
public class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("会游泳");
    }

    public void performFly() {
        if (flyBehavior == null) {
            System.out.println("还没有设置该鸭子的飞行行为呢");
            return;
        }
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
