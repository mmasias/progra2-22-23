import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularUserTest {
    @Test
    void testRegularUserCreation() {
        RegularUser user = new RegularUser("testUser", "testPassword", "Test Name");

        assertEquals("testUser", user.getUsername());
        assertEquals("testPassword", user.getPassword());
        assertEquals("Test Name", user.getName());
    }
}
