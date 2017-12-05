package singleton;

public class Browser {
    private static volatile Browser instance;
    private static String testValue;

    private Browser(String testValue) {
        this.testValue = testValue;
    }

    public static Browser getInstance(String testValue){
        if (instance==null){
            synchronized (Browser.class){
                if (instance==null){
                    System.out.println("New instance " + testValue);
                    instance = new Browser(testValue);
                }
            }
        }
        return instance;
    }

    public String getTestValue(){
        return testValue;
    }

}
