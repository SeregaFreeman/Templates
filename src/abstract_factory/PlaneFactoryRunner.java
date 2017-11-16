package abstract_factory;

import abstract_factory.factories.WarPlaneFactory;
import abstract_factory.pilots.Pilot;
import abstract_factory.planes.Aircraft;

public class PlaneFactoryRunner {
    public static void main(String[] args) {
        WarPlaneFactory warPlaneFactory = new WarPlaneFactory("SU-25", "Ivan");
        Aircraft aircraft = warPlaneFactory.makeAircraft();
        Pilot pilot = warPlaneFactory.makePilot();

        aircraft.getInfo();
        pilot.pilotPlane();
    }
}
