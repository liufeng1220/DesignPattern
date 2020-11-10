package facotory._2facotryMethod;

public class Test_Simple {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYouPizzaStore();
        pizzaStore.orderPizza();
       PizzaStore pizzaStore1 = new ChinaPizzaStore();
       pizzaStore1.orderPizza();
    }
}
