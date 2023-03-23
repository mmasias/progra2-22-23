import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RegularUserTest {
    @Test
    void testRegularUserCreation() {
        RegularUser user = new RegularUser("TestUser", "TestPassword", "TestName");
        assertEquals("TestUser", user.getUsername());
        assertEquals("TestPassword", user.getPassword());
        assertEquals("TestName", user.getName());   }}