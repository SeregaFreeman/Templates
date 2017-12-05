package decorator;

public class SpicyChickenBurger implements IBurger{
    private IBurger burger;

    public SpicyChickenBurger(IBurger burger){
        this.burger = burger;
    }

    public String getDescription(){
        return this.burger.getDescription()+" with pepper";
    }

    public int getCost(){
        return this.burger.getCost()+5;
    }
}
