package facotory._2facotryMethod;

public class NewYouPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza() {
        return new NewYouPizza();
    }
}
