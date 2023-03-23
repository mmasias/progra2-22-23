import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AdminTest {
    @Test
    void testAdminGettersAndSetters() {
        Admin admin = new Admin("testAdmin", "testPassword", "TestAdmin", true);
        assertTrue(admin.isAdmin());
        admin.setAdmin(false);
        assertFalse(admin.isAdmin());   }}