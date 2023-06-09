import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UserTest {
    @Test
    void testUserGettersAndSetters() {
        User user = new RegularUser("TestUser", "TestPassword", "TestName");
        assertEquals("TestUser", user.getUsername());
        assertEquals("TestPassword", user.getPassword());
        assertEquals("TestName", user.getName());
        user.setUsername("NewTestUser");
        user.setPassword("NewTestPassword");
        user.setName("NewTestName");
        assertEquals("NewTestUser", user.getUsername());
        assertEquals("NewTestPassword", user.getPassword());
        assertEquals("NewTestName", user.getName());   }}