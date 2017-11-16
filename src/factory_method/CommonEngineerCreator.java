package factory_method;

public class CommonEngineerCreator extends HeadOfDepartment{
    private String commonEngineername;

    public CommonEngineerCreator(String commonEngineername) {
        this.commonEngineername = commonEngineername;
    }

    public Engineer makeEngineer(){
        return new CommonEngineer(this.commonEngineername);
    }
}
