import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
        User user = new User("John", "Doe");
        String newName = "Jane Doe";
        user.setName(newName);
        assertEquals(newName, user.getName());
    }

    @Test
    void setUserName() {
        User user = new User("John", "Doe");
        String newUserName = "jane.doe";
        user.setUserName(newUserName);
        assertEquals(newUserName, user.getUserName());
    }

    @Test
    void getPassword() {
    }

    @Test
    void setPassword() {
    }

    @Test
    void getUserName() {
    }

    @Test
    void login() {
        User user = new User("john.doe", "password123", "John Doe");
        assertTrue(user.login("john.doe", "password123"));
        assertFalse(user.login("john.doe", "wrongpassword"));
        assertFalse(user.login("wrongusername", "password123"));
    }

    @Test
    void setOptions() {
        User user = new User("John", "Doe");
        Options options = new Options();
        user.setOptions(options);
        assertEquals(options, user.getOptions());
    }

    @Test
    void getOptions() {
    }
}