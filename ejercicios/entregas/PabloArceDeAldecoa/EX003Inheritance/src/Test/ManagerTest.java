package Test;

import Main.Manager;
import Main.Option;
import Main.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class ManagerTest {
    Manager manager = new Manager(5);
    User user = new User("Manolo","Manolo","1234");
    @Test
    void addUser() {
        manager.addUser(user);
        assertEquals(manager.getUser(0), user);
    }

    @Test
    void authenticateUser() {
        manager.setAuthenticatedUser(user);
        boolean login = manager.authenticateUser("Manolo","123");
        assertFalse(login);
        login = manager.authenticateUser("Manolo","1234");
        assertTrue(login);
    }

    @Test
    void showMenu() {
        Option option = new Option(0,4);
        option.addOption("Option 1");
        option.addOption("Option 2");
        option.addOption("Option 3");
        manager.showMenu(option);
    }
}