package Classes.Users;

import Interfaces.MenuItem;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password, false);
    }
}
