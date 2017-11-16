package abstract_factory.planes;

public class PassengerAirplane implements Aircraft{
    private String planeName;

    public PassengerAirplane(String planeName){
        this.planeName = planeName;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public void getInfo(){
        System.out.println("This is passenger airplane");
    }

}
