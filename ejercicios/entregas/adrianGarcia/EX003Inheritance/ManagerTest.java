import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ManagerTest {
    @Test
    void testManagerUserHandling() {
        UserManager manager = new UserManager();
        User user1 = new RegularUser("1User", "1Password", "1 User");
        User user2 = new RegularUser("2User", "2Password", "2 User");
        manager.addUser(1User);
        manager.addUser(2User);
        assertTrue(manager.authenticateUser("1User", "1Password"));
        assertTrue(manager.authenticateUser("2User", "2Password"));
        assertFalse(manager.authenticateUser("1User", "FailedPassword"));   }}