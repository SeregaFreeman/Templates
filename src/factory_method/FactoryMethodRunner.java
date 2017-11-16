package factory_method;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        CommonEngineerCreator commonEngineerCreator = new CommonEngineerCreator("Vasya");
        commonEngineerCreator.doWork();

        MainEngineerCreator mainEngineerCreator = new MainEngineerCreator("Petya");
        mainEngineerCreator.doWork();
    }
}
