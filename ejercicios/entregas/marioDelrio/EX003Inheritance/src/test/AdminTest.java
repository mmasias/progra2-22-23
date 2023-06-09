package test;

import main.Admin;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AdminTest {

    @Test
    public void testAdminConstructor() {
        Admin admin = new Admin("delrio", "potatoe", "Mario", true);
        assertEquals("delrio", admin.getUserName());
        assertEquals("potatoe", admin.getPassword());
        assertEquals("Mario", admin.getName());
        assertTrue(admin.isAdmin());
    }

    @Test
    public void testAdminIsAdmin() {
        Admin admin = new Admin(true);
        assertTrue(admin.isAdmin());
        admin.setAdmin(false);
        assertFalse(admin.isAdmin());
    }

}
