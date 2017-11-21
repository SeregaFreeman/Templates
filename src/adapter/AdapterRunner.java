package adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        BicycleAdapter bicycleAdapter = new BicycleAdapter(bicycle);
        Driver driver = new Driver();
        driver.drive(bicycleAdapter);
    }
}
