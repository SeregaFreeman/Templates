package abstract_factory;

public class WarPlaneFactory implements PlaneFactory{
    private String planeName;
    private String pilotName;

    public WarPlaneFactory(String planeName, String pilotName){
        this.planeName = planeName;
        this.pilotName = pilotName;
    }

    public Aircraft makeAircraft(){
        return new WarPlane(this.planeName);
    }

    public Pilot makePilot(){
        return new WarPlanePilot(this.pilotName);
    }
}
