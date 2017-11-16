package factory_method;

public class CommonEngineer implements Engineer{
    private String commonEngineerName;

    public CommonEngineer(String commonEngineerName){
        this.commonEngineerName = commonEngineerName;
    }

    public String getHeadName() {
        return commonEngineerName;
    }

    public void setHeadName(String mainEngineerName) {
        this.commonEngineerName = mainEngineerName;
    }

    public void doEngineering(){
        System.out.println("Some usual engineering decisions");
    }
}
