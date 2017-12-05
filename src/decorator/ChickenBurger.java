package decorator;

public class ChickenBurger implements IBurger{
    public String getDescription(){
        return "Chicken burger";
    }

    public int getCost(){
        return 100;
    }
}
