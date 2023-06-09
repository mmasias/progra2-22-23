package Core.Users;

import Core.Cypher.Enigma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new Student("JavierC", Enigma.encrypt("12345"), new int[] {10, 8, 9, 10, 7});
    }

    @Test
    void setUsername() {
        user.setUsername("JavierS");
        assertEquals("JavierS", user.getUsername());
    }

    @Test
    void setPassword() {
        user.setPassword(Enigma.encrypt("123333"));
        assertEquals(Enigma.encrypt("123333"), user.getPassword());
    }

    @Test
    void setLogin() {
        user.setLogin(true);
        assertTrue(user.isLogin());
    }

    @Test
    void getUsername() {
        assertEquals("JavierC", user.getUsername());
    }

    @Test
    void getPassword() {
        assertEquals(Enigma.encrypt("12345"), user.getPassword());
    }

    @Test
    void isLogin() {
        assertFalse(user.isLogin());
    }

    @Test
    void getOptions() {
        user.getOptions();
    }
}