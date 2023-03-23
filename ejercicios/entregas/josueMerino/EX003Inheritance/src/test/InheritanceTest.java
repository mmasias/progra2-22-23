package test;

import main.Admin;
import main.MenuOption;
import main.RegularUser;
import main.UserManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {

    private Admin admin;
    private RegularUser regularUser;
    private MenuOption menuOption;
    private UserManager userManager;
    @BeforeEach
    void setUp() {
        this.admin = new Admin("josue.merino", "123456", "Josué");
        this.regularUser = new RegularUser("elder.bol", "xqc123", "Elder");
        this.menuOption = new MenuOption("Buenas opciones de compra");
        this.userManager = new UserManager();
    }

    @Test
    void testGetDescriptionOfMenuOption() {
        String description = "Buenas opciones de compra";

        assertEquals(description, this.menuOption.getDescription());
    }

    @Test
    void testRegisterUserOnUserManager() {
        userManager.registerUser(this.regularUser);
        assertEquals(1, userManager.getSize());
    }

    @Test
    void testUserIsAdminOnUserManager() {
        userManager.registerUser(this.admin);
        boolean isAdmin = userManager.isUserAdmin(this.admin);

        assertTrue(isAdmin);
    }
}
