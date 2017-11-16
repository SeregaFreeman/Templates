package factory_method;

public class MainEngineerCreator extends HeadOfDepartment{
    private String mainEngineername;

    public MainEngineerCreator(String mainEngineername) {
        this.mainEngineername = mainEngineername;
    }

    public Engineer makeEngineer(){
        return new MainEngineer(this.mainEngineername);
    }
}
