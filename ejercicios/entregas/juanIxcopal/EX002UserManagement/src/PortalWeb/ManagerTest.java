package PortalWeb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    private Manager manager;

    @BeforeEach
    void setUp() {
        manager = new Manager(10, 5);
        manager.addUser(new User("user1", "pass1", "User 1"));
        manager.addUser(new User("user2", "pass2", "User 2"));
        manager.addMenuOption("Option 1");
        manager.addMenuOption("Option 2");
        manager.addMenuOption("Option 3");
    }

    @Test
    void testAuthenticateSuccess() {
        assertTrue(manager.authenticate("user1", "pass1"));
        assertNotNull(manager.getAuthenticatedUser());
        assertEquals("User 1", manager.getAuthenticatedUser().getName());
    }

    @Test
    void testAuthenticateFailure() {
        assertFalse(manager.authenticate("user1", "wrongpassword"));
        assertNull(manager.getAuthenticatedUser());
    }

    @Test
    void testShowMenuSuccess() {
        manager.authenticate("user1", "pass1");
        manager.showMenu();
    }

    @Test
    void testShowMenuFailure() {
        manager.showMenu();
    }

    @Test
    public void testAuthenticationFailed() {
        User user1 = new User("user1", "password1", "User One");
        User user2 = new User("user2", "password2", "User Two");
        User user3 = new User("user3", "password3", "User Three");

        Manager manager = new Manager(10,5);
        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(user3);

        boolean result = manager.authenticate("user4", "password4");

        assertFalse(result);
        assertNull(manager.getAuthenticatedUser());
    }
}
