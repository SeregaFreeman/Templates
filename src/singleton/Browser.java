package singleton;

public class Browser {
    private static Browser instance;

    public static Browser getInstance(){
        if (instance==null){
            System.out.println("New instance");
            instance = new Browser();
        }
        return instance;
    }

    public void printBrowser(){
        System.out.println("print instance");
    }
}
