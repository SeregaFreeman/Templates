package singleton;

public class Browser {
    private static volatile Browser instance;

    public static Browser getInstance(String testValue){
        if (instance==null){
            synchronized (Browser.class){
                if (instance==null){
                    System.out.println("New instance " + testValue);
                    instance = new Browser();
                }
            }
        }
        return instance;
    }

}
