package decorator;

public class DarkRoast extends CondimentDecorator {
    Beverage beverage;
    public DarkRoast(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription()+",DarkRoast";
    }

    @Override
    public double cost() {
        return this.beverage.cost()+54;
    }
}
