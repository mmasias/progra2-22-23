import org.junit.Test;
import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void testCreateUser() {
        Manager manager = new Manager(1);
        manager.createUser();

        assertEquals("User name does not match", "John", manager.users[0].name);
        assertEquals("User login does not match", "john123", manager.users[0].login);
        assertEquals("User password does not match", "password123", manager.users[0].password);
        assertEquals("User max options does not match", 3, manager.options[0].maxOptions);

    }

    @Test
    public void testIdentify() {
        Manager manager = new Manager(1);

        // Add a user
        User user = new User("john123", "John", "password123");
        Option option = new Option(3);
        option.addOptions("Option 1");
        option.addOptions("Option 2");
        option.addOptions("Option 3");
        manager.users[0] = user;
        manager.options[0] = option;

        // Test login with correct credentials
        Manager.identify("john123", "password123");
        assertEquals("Identified user does not match", 0, manager.identifiedUser);

        // Test login with incorrect password
        manager.identify("john123", "wrongpassword");
        assertEquals("Identified user does not match", -1, manager.identifiedUser);

        // Test login with incorrect username
        manager.identify("wrongusername", "password123");
        assertEquals("Identified user does not match", -1, manager.identifiedUser);
    }
}
