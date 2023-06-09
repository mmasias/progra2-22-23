package Test;

import Main.User;
import Main.UserManager;
import Main.admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    UserManager manager = new UserManager(5);
    User user = new User("Manolo","Manolo","1234");
    admin admin = new admin(true, "Pepe","Pepe","1234");
    @Test
    void registerUser(){
        manager.registerUser(user);
    }

    @Test
    void isUserAdmin() {
        admin.isAdmin();
    }
}