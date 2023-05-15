package Test;

import main.Manager;
import main.User;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    @Test
    public void testAddUsers() {
        User[] usersList = new User[10];
        User user1 = new User("Javier", "abcd");
        User user2 = new User("Paco", "pelayo");
        Manager.addUsers(user1, 10, usersList);
        Manager.addUsers(user2, 10, usersList);
        assertEquals(user1, usersList[0]);
        assertEquals(user2, usersList[1]);
    }

    @Test
    public void testCheck() {
        User[] usersList = new User[10];
        User user1 = new User("Diego", "montaña");
        usersList[0] = user1;
        assertTrue(Manager.check("Diego", "montaña", usersList));
        assertFalse(Manager.check("Chemi", "montaña", usersList));
        assertFalse(Manager.check("Diego", "volcan", usersList));
    }
}
