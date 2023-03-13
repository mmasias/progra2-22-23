package Classes.Users;

import Interfaces.MenuItem;

public class Admin extends User {
    private MenuItem[] options;
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.options = this.GeneralOptions.getAdminOptions();
        this.login = false;
    }

    public MenuItem[] getOptions() {
        return options;
    }
}
