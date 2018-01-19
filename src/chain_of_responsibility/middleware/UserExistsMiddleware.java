package chain_of_responsibility.middleware;

import chain_of_responsibility.server.Server;

/**
 * Created by s.pogorelov on 19.01.2018.
 */
public class UserExistsMiddleware extends Middleware{
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email)) {
            return false;
        }
        return checkNext(email, password);
    }
}
