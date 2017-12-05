package adapter;

public class BicycleAdapter implements IVehicle {
    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public void run(){
        this.bicycle.ride();
    }
}
