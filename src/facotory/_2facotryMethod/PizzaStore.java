package facotory._2facotryMethod;

public abstract class PizzaStore {

    public Pizza orderPizza() {
        Pizza pizza;
        pizza = this.createPizza();
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza();
}
