package factory_method;

public class MainIEngineer implements IEngineer {
    private String mainEngineerName;

    public MainIEngineer(String mainEngineerName){
        this.mainEngineerName = mainEngineerName;
    }

    public String getHeadName() {
        return mainEngineerName;
    }

    public void setHeadName(String mainEngineerName) {
        this.mainEngineerName = mainEngineerName;
    }

    public void doEngineering(){
        System.out.println("Some important engineering decisions");
    }
}
