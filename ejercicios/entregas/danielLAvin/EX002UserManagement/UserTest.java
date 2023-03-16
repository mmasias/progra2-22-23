package Test;

import Codigo.User;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User u1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {  u1 =new User("uneatlantico","Edgar",true);
    }

    @org.junit.jupiter.api.Test
    void getPassword() {
        Assertions.assertEquals("uneatlantico",u1.getPassword());
    }

    @org.junit.jupiter.api.Test
    void setPassword() {
        u1.setPassword("aaaa");
        Assertions.assertEquals("aaaa", u1.getPassword());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Assertions.assertEquals("Edgar",u1.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        u1.setName("ana");
        Assertions.assertEquals("ana",u1.getName());
    }

    @org.junit.jupiter.api.Test
    void isLogin() {
        Assertions.assertTrue(u1.isLogin());
    }

    @org.junit.jupiter.api.Test
    void setLogin() {
        u1.setLogin(false);
        Assertions.assertEquals(false,u1.isLogin());
    }
}