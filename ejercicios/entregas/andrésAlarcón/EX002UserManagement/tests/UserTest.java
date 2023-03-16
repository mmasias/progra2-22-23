import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User newUser;
    @BeforeEach
    void setUp(){
        newUser = new User("Roy","1234");
    }

    @Test
    void setLogin() {
        boolean expected = true;
        newUser.setLogin(expected);
        assertEquals(expected,newUser.getLogin());
    }

    @Test
    void getUserName() {
        String expected = "Roy";
        String actual = newUser.getUserName();
        assertEquals(expected,actual);
    }

    @Test
    void setUserName() {
        newUser.setUserName("Paolo");
        String expected = "Paolo";
        assertEquals(expected,newUser.getUserName());
    }

    @Test
    void getUserPassword() {
        String expected = "1234";
        String actual = newUser.getUserPassword();
        assertEquals(expected,actual);
    }

    @Test
    void setUserPassword(){
        newUser.setUserPassword("qwerty");
        String expected = "qwerty";
        assertEquals(expected,newUser.getUserPassword());

    }

    @Test
    void getLogin() {
        boolean expected = false;
        boolean actual = newUser.getLogin();
        assertEquals(expected,actual);
    }
}