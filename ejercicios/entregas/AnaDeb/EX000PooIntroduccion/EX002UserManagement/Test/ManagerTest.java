import org.junit.Test;
import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void testAddUsers() {
        Manager manager = new Manager(3);
        Users user1 = new Users("user1","password1");
        Users user2 = new Users("user2","password2");

        manager.addUsers(user1);
        manager.addUsers(user2);

        assertEquals(2, manager.users.size());
        assertTrue(manager.users.contains(user1));
        assertTrue(manager.users.contains(user2));
    }

    @Test
    public void testAuthenticatesUser() {
        Manager manager = new Manager(2);
        Users user1 = new Users("user1","password1");
        Users user2 = new Users("user2","password2");
        manager.addUsers(user1);
        manager.addUsers(user2);

        Users authenticatedUser = manager.AuthenticatesUser("user1", "password1");
        assertNotNull(authenticatedUser);
        assertEquals(user1, authenticatedUser);

        authenticatedUser = manager.AuthenticatesUser("user2", "wrongpassword");
        assertNull(authenticatedUser);

        authenticatedUser = manager.AuthenticatesUser("nonexistentuser", "password");
        assertNull(authenticatedUser);
    }
}