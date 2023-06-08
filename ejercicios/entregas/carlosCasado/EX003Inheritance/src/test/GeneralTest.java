package test;

import main.Admin;
import main.MenuOption;
import main.RegularUser;
import main.UserManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneralTest {
    static UserManager manager;

    @BeforeAll
    static void setUp() {

        RegularUser user1 = new RegularUser("filiberto", "Paco", "Filiberto Paco");
        RegularUser user2 = new RegularUser("Wilbur", "Paco", "Wilbur Maxwell");
        RegularUser user3 = new RegularUser("Brayden", "Paco", "Brayden Mccullough");
        RegularUser user4 = new RegularUser("Lowri", "Paco", "Lowri Mcclain");
        RegularUser user5 = new RegularUser("Fatma", "Paco", "Fatma Stone");

        manager = new UserManager(8);
        manager.registerUser(user1);
        manager.registerUser(user2);
        manager.registerUser(user3);
        manager.registerUser(user4);
        manager.registerUser(user5);

    }

    @Test
    @DisplayName("Check users existences")
    void checkUsers() {

        //check first username existence in the array.
        assertTrue(manager.checkUser("filiberto"));

        //Check last username existence in the array.
        assertTrue(manager.checkUser("fatma"));
    }

    @Test
    @DisplayName("Check auth user")
    void authUser() {

        // Check with correct login data.
        assertTrue(manager.authUser("filiberto", "Paco"));

        // Check with bad login data.
        assertFalse(manager.authUser("fatma", "Bad_Password"));
    }

    @Test
    @DisplayName("Check anti duplicate username")
    void antiDuplicate() {

        RegularUser user6 = new RegularUser("filiberto", "Pedro", "Filiberto Pedro");
        assertFalse(manager.registerUser(user6));

    }

    @Test
    @DisplayName("Check user role")
    void isAdmin() {

        // Check user with no admin role

        RegularUser user6 = new RegularUser("Mahoma", "Pedro", "Mahoma Pedro");
        assertFalse(manager.isUserAdmin(user6));

        // Check user with admin role

        Admin admin1 = new Admin("Admin", "Admin", "Admin User");
        assertTrue(manager.isUserAdmin(admin1));
    }

    @Test
    @DisplayName("Check position via index/username")
    void getPos() {

        assertEquals(manager.getUsers(2), manager.getUsers(manager.getUserPosition("Brayden")));

    }

    @Test
    @DisplayName("Check menu capacity")
    void menu() {
        MenuOption menu = manager.configureMenu(5);
        assertEquals(5, menu.getMaxOptions());

    }

}
