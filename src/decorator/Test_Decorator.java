package decorator;

public class Test_Decorator {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription());
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription()+"%n"+espresso.cost());
        espresso = new DarkRoast(espresso);
        System.out.println(espresso.getDescription()+"%n"+espresso.cost());
    }
}
