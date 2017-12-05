package factory_method;

public class CommonEngineerCreator extends HeadOfDepartment{
    private String commonEngineername;

    public CommonEngineerCreator(String commonEngineername) {
        this.commonEngineername = commonEngineername;
    }

    public IEngineer makeEngineer(){
        return new CommonIEngineer(this.commonEngineername);
    }
}
