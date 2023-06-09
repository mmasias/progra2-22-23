import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void testAddUser() {
        Manager manager = new Manager();
        User user = new User("BryanT", "1234", "Adrián González");
        Option menuOptions = new Option();
        manager.addUser(user, menuOptions);
        assertEquals(1, manager.users.size());
    }

    @Test
    public void testUserLoginValid() {
        Manager manager = new Manager();
        User user = new User("John", "john123", "password");
        Option menuOptions = new Option();
        manager.addUser(user, menuOptions);
        System.setIn(new ByteArrayInputStream("john123\npassword\n".getBytes()));
        manager.userLogin();
        assertEquals(-1, manager.loggedUser);
    }

    @Test
    public void testUserLoginInvalidPassword() {
        Manager manager = new Manager();
        User user = new User("John", "john123", "password");
        Option menuOptions = new Option();
        manager.addUser(user, menuOptions);
        System.setIn(new ByteArrayInputStream("john123\nwrongpassword\n".getBytes()));
        manager.userLogin();
        assertEquals(-1, manager.loggedUser);
    }

    @Test
    public void testUserLoginInvalidUsername() {
        Manager manager = new Manager();
        User user = new User("John", "john123", "password");
        Option menuOptions = new Option();
        manager.addUser(user, menuOptions);
        System.setIn(new ByteArrayInputStream("nonexistentuser\npassword\n".getBytes()));
        manager.userLogin();
        assertEquals(-1, manager.loggedUser);
    }
}

