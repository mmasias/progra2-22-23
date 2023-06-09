package Poo;

import Poo.Admin;
import Poo.MenuOption;
import Poo.RegularUser;
import Poo.UserManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Admin admin;
    private RegularUser regularUser;
    private MenuOption menuOption;
    private UserManager userManager;
    @BeforeEach
    void setUp() {
        this.admin = new Admin("andriuw.yepez", "password123", "Andriuw");
        this.regularUser = new RegularUser("alumnos.uneat", "contraseña456", "alumno");
        this.menuOption = new MenuOption("Login");
        this.userManager = new UserManager();
    }

    @Test
    void testGetDescriptionOfMenuOption() {
        String description = "Login";

    }

    @Test
    void testRegisterUserOnUserManager() {
        userManager.registerUser(this.regularUser);
    }

    @Test
    void testUserIsAdminOnUserManager() {
        userManager.registerUser(this.admin);
        boolean isAdmin = userManager.isUserAdmin(this.admin);

        assertTrue(isAdmin);
    }
}
