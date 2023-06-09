package Test;

import Main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("Manolo","Manolo", "1234");
    @Test
    void setName() {
        user.setName("Pepe");
        assertEquals("Pepe",user.getName());
    }
    @Test
    void getName() {
        assertEquals("Manolo",user.getName());
    }

    @Test
    void setLogin() {
        user.setLogin("Pepe");
        assertEquals("Pepe",user.getLogin());
    }

    @Test
    void getLogin() {
        assertEquals("Manolo",user.getLogin());
    }

    @Test
    void setPassword() {
        user.setPassword("12345");
        assertEquals("12345",user.getPassword());
    }

    @Test
    void getPassword() {
        assertEquals("1234",user.getPassword());
    }
}