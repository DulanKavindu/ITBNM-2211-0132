package Controller;

import Model.DBSearch;

public class LoginController {

    public static boolean authenticate(String username, String password) {
        return DBSearch.validateUser(username, password);
    }
}
