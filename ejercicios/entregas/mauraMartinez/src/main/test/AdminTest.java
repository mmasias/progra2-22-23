package test;
import main.Admin;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
public class AdminTest {
    @Test
    public void testIsAdmin() {
        Admin admin = new Admin("admin", "password", "John Doe", true);
        assertTrue(admin.isAdmin());
    }

    @Test
    public void testSetAdmin() {
        Admin admin = new Admin("admin", "password", "John Doe", false);
        admin.setAdmin(true);
        assertTrue(admin.isAdmin());
    }
}
