package tactics.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哑鸭叫");
    }
}
