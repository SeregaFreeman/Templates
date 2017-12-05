package singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        Browser browser1 = Browser.getInstance("First");
        System.out.println(browser1.getTestValue());
        
        Browser browser2 = Browser.getInstance("Second");
        System.out.println(browser2.getTestValue());
    }
}
