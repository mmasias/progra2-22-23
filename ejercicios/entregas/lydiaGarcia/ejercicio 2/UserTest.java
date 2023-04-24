import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User u;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        u = new User(true, "Lydia", "GR04");
    }

    @org.junit.jupiter.api.Test
    void isLogin() {
        assertTrue(u.isLogin());
    }

    @org.junit.jupiter.api.Test
    void setLogin() {
        u.setLogin(false);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Lydia",u.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        u.setName("Ana");
        assertEquals("Ana",u.getName());
    }

    @org.junit.jupiter.api.Test
    void getPassword() {
        assertEquals("GR04", u.getPassword());

    }

    @org.junit.jupiter.api.Test
    void setPassword() {
        u.setPassword("GR05");
        assertEquals("GR05", u.getPassword ());
    }
}