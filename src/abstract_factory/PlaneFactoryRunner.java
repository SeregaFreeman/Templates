package abstract_factory;

public class PlaneFactoryRunner {
    public static void main(String[] args) {
        WarPlaneFactory warPlaneFactory = new WarPlaneFactory("SU-25", "Ivan");
        Aircraft aircraft = warPlaneFactory.makeAircraft();
        Pilot pilot = warPlaneFactory.makePilot();

        aircraft.getInfo();
        pilot.pilotPlane();
    }
}
