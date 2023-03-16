import static org.junit.jupiter.api.Assertions.*;

class UserTest {
User u;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        u=new User("John","12345",true);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("John",u.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        u.setName("Juan");
        assertEquals("Juan", u.getName());
    }

    @org.junit.jupiter.api.Test
    void getPass() {
        assertEquals("12345",u.getPass());
    }

    @org.junit.jupiter.api.Test
    void setPass() {
        u.setPass("67890");
        assertEquals("67890", u.getPass());
    }

    @org.junit.jupiter.api.Test
    void isLogin() {
        assertEquals(true, u.isLogin());
    }

    @org.junit.jupiter.api.Test
    void setLogin() {
        u.setLogin(true);
        assertEquals(true, u.isLogin());
    }
}