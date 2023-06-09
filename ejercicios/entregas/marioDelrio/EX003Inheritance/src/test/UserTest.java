package test;

import main.Options;
import main.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("testuser", "testpassword", "Test User");
    }

    @Test
    public void testGetUserName() {
        assertEquals("testuser", user.getUserName());
    }

    @Test
    public void testSetUserName() {
        user.setUserName("newuser");
        assertEquals("newuser", user.getUserName());
    }

    @Test
    public void testGetPassword() {
        assertEquals("testpassword", user.getPassword());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("newpassword");
        assertEquals("newpassword", user.getPassword());
    }

    @Test
    public void testGetName() {
        assertEquals("Test User", user.getName());
    }

    @Test
    public void testSetName() {
        user.setName("New User");
        assertEquals("New User", user.getName());
    }

    @Test
    public void testLogin() {
        assertTrue(user.login("testuser", "testpassword"));
    }

    @Test
    public void testSetOptions() {
        Options options = new Options();
        options.add("Option 1");
        user.setOptions(options);
        assertEquals(options, user.getOptions());
    }
}