import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserManagerTest {

    private UserManager manager;

    @Before
    public void setUp() throws Exception {
        manager = new UserManager();
    }
    
    @Test
    public void testAddUser() {
        for (int i = 0; i < 100; i++) {
            manager.addUser("user" + i, "password" + i);
        }
        assertTrue(manager.authenticate("user0", "password0"));
        assertTrue(manager.authenticate("user1", "password1"));
        assertFalse(manager.authenticate("user100", "password100"));
    }
    
    @Test
    public void testAuthenticate() {
        manager.createAccount("user", "password");
        assertTrue(manager.authenticate("user", "password"));
        assertFalse(manager.authenticate("user", "notPassword"));
        assertFalse(manager.authenticate("notUser", "password"));
    }

    @Test
    public void testCreateAccount() {
        manager.createAccount("user", "password");
        assertTrue(manager.authenticate("user", "password"));
    }

    @Test
    public void testModifyAccount() {
        manager.createAccount("user", "password");
        manager.modifyAccount("user", "password", "newPassword");
        assertTrue(manager.authenticate("user", "newPassword"));
    }

}
