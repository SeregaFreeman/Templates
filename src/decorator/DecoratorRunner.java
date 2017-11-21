package decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        ChickenBurger chickenBurger = new ChickenBurger();
        System.out.println(chickenBurger.getCost());
        System.out.println(chickenBurger.getDescription());

        SpicyChickenBurger spicyChickenBurger = new SpicyChickenBurger(chickenBurger);
        System.out.println(spicyChickenBurger.getCost());
        System.out.println(spicyChickenBurger.getDescription());
    }
}
