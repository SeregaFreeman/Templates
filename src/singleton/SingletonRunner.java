package singleton;

public class SingletonRunner {
    protected static Browser browser;

    public static void main(String[] args) {
        browser = Browser.getInstance("First");
        System.out.println(browser);
        browser = Browser.getInstance("Second");
        System.out.println(browser);
    }
}
