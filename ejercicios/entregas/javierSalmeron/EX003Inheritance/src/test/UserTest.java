import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testUserGettersAndSetters() {
        User user = new RegularUser("testUser", "testPassword", "Test Name");

        assertEquals("testUser", user.getUsername());
        assertEquals("testPassword", user.getPassword());
        assertEquals("Test Name", user.getName());

        user.setUsername("newTestUser");
        user.setPassword("newTestPassword");
        user.setName("New Test Name");

        assertEquals("newTestUser", user.getUsername());
        assertEquals("newTestPassword", user.getPassword());
        assertEquals("New Test Name", user.getName());
    }
}
