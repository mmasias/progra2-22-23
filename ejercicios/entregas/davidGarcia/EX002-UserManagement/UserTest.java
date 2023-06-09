import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User l;
    @BeforeEach
    void setUp() {
        l=new User(true,"41111per","David");
    }

    @Test
    void isLogin() {
        assertTrue(l.isLogin());
    }

    @Test
    void setLogin() {
        l.setLogin(false);
        assertFalse(l.isLogin());

    }

    @Test
    void getPassword() {
        assertEquals("41111per","41111per");
    }

    @Test
    void setPassword() {
        l.setPassword("ewnugfie");
        assertEquals("ewnugfie",l.getPassword());

    }

    @Test
    void getName() {
        assertEquals("David",l.getName());

    }

    @Test
    void setName() {
        l.setName("Pablo");
        assertEquals("Pablo",l.getName());
    }
}