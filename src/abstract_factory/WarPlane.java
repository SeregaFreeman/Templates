package abstract_factory;

public class WarPlane implements Aircraft{
    private String planeName;

    public WarPlane(String planeName){
        this.planeName = planeName;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public void getInfo(){
        System.out.println("This is military plane");
    }
}
