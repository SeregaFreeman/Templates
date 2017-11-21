package decorator;

public class SpicyChickenBurger implements Burger{
    private Burger burger;

    public SpicyChickenBurger(Burger burger){
        this.burger = burger;
    }

    public String getDescription(){
        return this.burger.getDescription()+" with pepper";
    }

    public int getCost(){
        return this.burger.getCost()+5;
    }
}
