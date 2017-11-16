package abstract_factory.factories;

import abstract_factory.pilots.PassengerPlanePilot;
import abstract_factory.pilots.Pilot;
import abstract_factory.planes.Aircraft;
import abstract_factory.planes.PassengerAirplane;

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
