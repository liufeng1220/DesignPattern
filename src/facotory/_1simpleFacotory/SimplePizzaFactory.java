package facotory._1simpleFacotory;

/**
 * 简单工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("newyue")) {
            pizza = new NewYouPizza();
        } else if (type.equals("china")) {
            pizza = new ChinaPizza();
        }
        return pizza;
    }
}
