package chain_of_responsibility.middleware;

/**
 * Created by s.pogorelov on 19.01.2018.
 */
public class RoleCheckMiddleware extends Middleware{
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
