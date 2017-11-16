package abstract_factory;

public class PassengerPlaneFactory implements PlaneFactory{
    private String planeName;
    private String pilotName;

    public PassengerPlaneFactory(String planeName, String pilotName){
        this.planeName = planeName;
        this.pilotName = pilotName;
    }

    public Aircraft makeAircraft(){
        return new PassengerAirplane(this.planeName);
    }

    public Pilot makePilot(){
        return new PassengerPlanePilot(this.pilotName);
    }
}
