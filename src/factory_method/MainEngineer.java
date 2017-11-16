package factory_method;

public class MainEngineer implements Engineer{
    private String mainEngineerName;

    public MainEngineer(String mainEngineerName){
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
