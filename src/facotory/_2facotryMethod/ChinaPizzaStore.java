package facotory._2facotryMethod;

public class ChinaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza() {
        return new ChinaPizza();
    }
}
