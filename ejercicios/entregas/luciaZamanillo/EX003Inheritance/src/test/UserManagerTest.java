package test;
import main.RegularUser;
import main.Admin;
import main.UserManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {
    static UserManager userManager;
    static Admin admin;
    static RegularUser regUser;

    @BeforeAll
    static void setUp() {
        userManager = new UserManager();

        // new user of class Admin
        admin = new Admin();
        admin.setUserName("blobZ");
        admin.setPassword("74125");
        admin.setName("Harry");

        // new user of class RegularUser
        regUser = new RegularUser();
        regUser.setUserName("wildWind51");
        regUser.setPassword("7413642");
        regUser.setName("Anne");

    }

    @Test
    void isUserAdmin() {
        admin.setAdmin(true);
        boolean expected = true;
        boolean actualResult = userManager.isUserAdmin(admin);

        assertEquals (expected, actualResult);
    }

    @Test
    void isUserAdminFailed() {
        boolean expected = false;
        boolean actualResult = userManager.isUserAdmin(admin);

        assertEquals (expected, actualResult);
    }

    @Test
    void registerAdminUser() {
        userManager.registerUser(admin);

        boolean expectedAdmin = true;
        boolean actualAdmin = userManager.isUserAdmin(admin);

        assertEquals(expectedAdmin, actualAdmin);
    }

    @Test
    void registerRegularUser() {
        userManager.registerUser(regUser);
        int expected = 1;
        int actualResult = userManager.getSize();

        assertEquals(expected, actualResult);
    }
}
