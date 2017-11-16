package abstract_factory.factories;

import abstract_factory.pilots.Pilot;
import abstract_factory.pilots.WarPlanePilot;
import abstract_factory.planes.Aircraft;
import abstract_factory.planes.WarPlane;

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
