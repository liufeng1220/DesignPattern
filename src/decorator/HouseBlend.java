package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return 34;
    }
}
