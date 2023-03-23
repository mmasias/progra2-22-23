package src.portalWeb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ManagerTest {
    private Manager manager;

    @BeforeEach
    void start(){
        manager = new Manager(10, 5);
        manager.addUser(new User("user#1", "123abc", "User user 1"));
        manager.addUser(new User("user#2", "abc123", "User user 2"));
        manager.addOption("Option#1");
        manager.addOption("Option#2");
        manager.addOption("Option#3");
    }

    @Test
    void testAuthenticateSuccess() {
        assertTrue(manager.userAuthenticated("user1", "pass1"));
        assertNotNull(manager.getUserAuth());
        assertEquals("User 1", manager.getUserAuth());
    }
}
