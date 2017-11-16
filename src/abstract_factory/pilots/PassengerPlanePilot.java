package abstract_factory.pilots;

public class PassengerPlanePilot implements Pilot{
    private String pilotName;

    public PassengerPlanePilot(String pilotName){
        this.pilotName = pilotName;
    }

    public String getPilotname() {
        return pilotName;
    }

    public void setPilotname(String pilotName) {
        this.pilotName = pilotName;
    }

    public void pilotPlane(){
        System.out.println("I'm piloting passenger plane");
    }
}
