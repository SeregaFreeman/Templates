package abstract_factory;

public class WarPlanePilot implements Pilot{
    private String pilotName;

    public WarPlanePilot(String pilotName){
        this.pilotName = pilotName;
    }

    public String getPilotname() {
        return pilotName;
    }

    public void setPilotname(String pilotName) {
        this.pilotName = pilotName;
    }

    public void pilotPlane(){
        System.out.println("I'm piloting military plane");
    }
}
