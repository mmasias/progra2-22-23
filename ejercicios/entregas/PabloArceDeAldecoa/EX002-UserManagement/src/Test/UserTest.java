package Test;

import Main.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user1;

    @BeforeEach
    void setup(){
        user1 = new User("Manolo", "4321");
    }
    @Test
    void setUsername() {
        user1.setUsername("Pablo");
        String expected = "Pablo";
        String actual = user1.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    void getUser() {
        String expected = "Manolo";
        String actual = user1.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    void setPassword() {
        user1.setPassword("1234");
        String expected = "1234";
        String actual = user1.getPassword();
        assertEquals(expected, actual);
    }
    @Test
    void getPassword() {
        String expected = "4321";
        String actual = user1.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    void login() {
        user1.setUsername("Pablo");
        user1.setPassword("1234");
        user1.Login("Pablo","1234");
        System.out.println(user1.getLogin());
        user1.Login("Pablo","123");
        System.out.println(user1.getLogin());
    }
}