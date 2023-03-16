package test;

import Main.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static sun.security.jgss.GSSUtil.login;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = new User ("Peter", "38ewhoid", "Peter", true);
    }
    void login(){
    }

    @Test
    void getUserName() {
        assertEquals("Peter", user.getName());
    }

    @Test
    void setUserName() {
        user.setUserName("Anne");
        assertEquals("Anne", user.getUserName());
    }

    @Test
    void getUserPassword() {
        assertEquals("38ewhoid", user.getUserPassword());

    }

    @Test
    void setUserPassword() {
        user.setUserPassword("enzoferrari");
        assertEquals("enzoferrari", user.getUserPassword());

    }

    @Test
    void getName() {
        assertEquals("Peter", user.getName());
    }

    @Test
    void setName() {
        user.setName("Ane");
        assertEquals("Ane", user.getName());
    }

    @Test
    void isLogin() {
        assertTrue(user.isLogin());

    }
    @Test
    void setLogin() {
        user.setLogin(false);
        assertFalse(user.isLogin());
    }
}