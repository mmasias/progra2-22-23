package test;
import src.RegularUser;
import src.Admin;
import src.UserManager;
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
        admin.setUserName("HarryPotter");
        admin.setPassword("123456");
        admin.setName("Harry");

        // new user of class RegularUser
        regUser = new RegularUser();
        regUser.setUserName("AnneSU);
        regUser.setPassword("123654");
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