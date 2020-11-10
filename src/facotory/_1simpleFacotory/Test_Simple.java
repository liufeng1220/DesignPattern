package facotory._1simpleFacotory;

public class Test_Simple {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("china");
        pizzaStore.orderPizza("newyue");
    }
}
