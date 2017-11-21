package decorator;

public class ChickenBurger implements Burger{
    public String getDescription(){
        return "Chicken burger";
    }

    public int getCost(){
        return 100;
    }
}
