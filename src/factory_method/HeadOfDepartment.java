package factory_method;

abstract class HeadOfDepartment{

    private String headName;

    public HeadOfDepartment(){
        this.headName = "Default head";
    }

    public HeadOfDepartment(String headName){
        this.headName = headName;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    // factory method
    public abstract IEngineer makeEngineer();

    public void doWork(){
        IEngineer IEngineer = this.makeEngineer();
        IEngineer.doEngineering();
    }
}
