package Test;

import Main.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {
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
    void setPassword() {
    }

    @Test
    void getName() {
    }

    @Test
    void getUserName() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void login() {
        User user = new User("Manuel.Diaz", "123456");
        assertTrue(user.login("Manuel Diaz", "123456"));
        assertFalse(user.login("Manuel Diaz", "12345678"));
        assertFalse(user.login("MAanuel Diaz", "123456"));
    }
}