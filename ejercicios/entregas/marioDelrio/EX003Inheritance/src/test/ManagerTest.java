package test;
import main.Manager;
import main.User;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    @Test
    public void testManagerConstructor() {
        Manager manager = new Manager(33);
        assertEquals(33, manager.capacity);
        assertEquals(0, manager.size);
        assertNotNull(manager.users);
    }

    @Test
    public void testAddUser() {
        Manager manager = new Manager();
        User user = new User("delrio", "potatoe", "Mario");
        manager.add(user);
        assertEquals(1, manager.size);
        assertEquals(user, manager.users[0]);
    }

    @Test
    public void testLoginValidUser() {
        Manager manager = new Manager();
        User user = new User("delrio", "potatoe", "Mario");
        manager.add(user);
        User currentUser = manager.login("delrio", "potatoe");
        assertNotNull(currentUser);
        assertEquals(user, currentUser);
    }

    @Test
    public void testLoginInvalidUser() {
        Manager manager = new Manager();
        User user = new User("delrio", "potatoe", "Mario");
        manager.add(user);
        User currentUser = manager.login("merino", "apple");
        assertNull(currentUser);
    }

}