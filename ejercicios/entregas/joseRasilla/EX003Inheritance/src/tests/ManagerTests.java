package tests;
import main.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTests {
    public static UserManager manager = new UserManager();
    public static Option listOptionsAdmin = new Option(5);
    public static Option listOptionsRegularUser = new Option(3);

    @Before
    public void setUp(){
        listOptionsAdmin.addOption("List all students");
        listOptionsAdmin.addOption("Show all tests");
        listOptionsAdmin.addOption("List all contacts");
        listOptionsAdmin.addOption("List all teachers");
        listOptionsAdmin.addOption("Show schedule");

        listOptionsRegularUser.addOption("List all subjects");
        listOptionsRegularUser.addOption("List all marks");
        listOptionsRegularUser.addOption("Show schedule");
    }

    @Test
    public void loginRegularUser(){
        RegularUser Jose = new RegularUser("Jose", "chema", "JoseManuel");
        Jose.setOptions(listOptionsRegularUser);
        manager.addUser(Jose);

        int expectedSize = 3;
        int actualSize = Jose.options.getSize();

        assertEquals(expectedSize, actualSize);
        assertTrue(UserManager.authenticateUser("Jose", "chema"));
    }

    @Test
    public void loginAdmin(){
        Admin Manuel = new Admin("Manuel", "adminpass", "ManuelMasias");
        Manuel.setOptions(listOptionsAdmin);
        manager.addUser(Manuel);

        int expectedSize = 5;
        int actualSize = Manuel.options.getSize();

        boolean expectedAdmin = true;
        boolean actualAdmin = UserManager.isUserAdmin(Manuel);

        assertEquals(expectedSize, actualSize);
        assertEquals(expectedAdmin, actualAdmin);
        assertTrue(UserManager.authenticateUser("Manuel", "adminpass"));
    }



    @Test

    public void loginFailed(){
        RegularUser Jose = new RegularUser("Jose", "chema", "JoseManuel");
        Jose.setOptions(listOptionsRegularUser);
        manager.addUser(Jose);

        assertFalse(UserManager.authenticateUser("Jose", "digu"));
    }

}
