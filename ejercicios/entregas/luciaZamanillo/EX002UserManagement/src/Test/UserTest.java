package Test;
import Poo.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User newUser;
    @BeforeEach
    void setUp() {
        newUser = new User("123456", "JamesZX");
    }

    @Test
    void getLogin() {
        boolean expected = false;
        boolean actual = newUser.getLogin();
        assertEquals(expected, actual);
    }

    @Test
    void setLogin() {
        boolean expected = true;
        newUser.setLogin(true);
        assertEquals(expected,newUser.getLogin());
    }

    @Test
    void getPassword() {
        String expected = "123456";
        String actual = newUser.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    void setPassword() {
        newUser.setPassword("abcde");
        String expected = "abcde";
        assertEquals(expected, newUser.getPassword());
    }

    @Test
    void getUserName() {
        String expected = "JamesZX";
        String actual = newUser.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    void setUserName() {
        newUser.setUserName("Misty78");
        String expected = "Misty78";
        assertEquals(expected, newUser.getUserName());
    }
}
