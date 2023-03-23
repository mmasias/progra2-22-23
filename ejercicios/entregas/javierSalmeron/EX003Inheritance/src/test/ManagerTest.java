import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void testManagerUserHandling() {
        UserManager manager = new UserManager();

        User user1 = new RegularUser("user1", "pass1", "User 1");
        User user2 = new RegularUser("user2", "pass2", "User 2");

        manager.addUser(user1);
        manager.addUser(user2);

        assertTrue(manager.authenticateUser("user1", "pass1"));
        assertTrue(manager.authenticateUser("user2", "pass2"));
        assertFalse(manager.authenticateUser("user1", "wrongPass"));
    }
}
