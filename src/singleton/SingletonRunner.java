package singleton;

public class SingletonRunner {
    protected static Browser browser = Browser.getInstance();

    public static void main(String[] args) {
        browser = Browser.getInstance();
        System.out.println(browser);
        browser = Browser.getInstance();
        System.out.println(browser);
    }
}
