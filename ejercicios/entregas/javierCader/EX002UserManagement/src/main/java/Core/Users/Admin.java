package Core.Users;

import Core.Options.Options;
import Utils.Enums.EditTypes;
import Utils.Functions.UserActions;
import Utils.Interfaces.MenuItem;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password, false);
        this.options = new MenuItem[]{
                new Options("Display All Users", UserActions::displayAllUsers),
                new Options("Change Username", () -> UserActions.editUser(EditTypes.EDIT_USER)),
                new Options("Change Password", () -> UserActions.editUser(EditTypes.EDIT_PASSWORD)),
                new Options("Get Enigma Key", UserActions::getEnigmaKey),
                UserActions.logout,
                UserActions.quit
        };
    }
}
