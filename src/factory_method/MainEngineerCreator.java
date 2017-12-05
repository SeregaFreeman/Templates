package factory_method;

public class MainEngineerCreator extends HeadOfDepartment{
    private String mainEngineername;

    public MainEngineerCreator(String mainEngineername) {
        this.mainEngineername = mainEngineername;
    }

    public IEngineer makeEngineer(){
        return new MainIEngineer(this.mainEngineername);
    }
}
