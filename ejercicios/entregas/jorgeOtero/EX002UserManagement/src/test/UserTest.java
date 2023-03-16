package test;

import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void setgetNameTest(){
        User user = new User("Ad","as");
        user.setUserName("Jorge");
        assertEquals("Jorge", user.getUserName());
    }
    @Test
    void setgetPasswordTest(){
        User user = new User("Ad","as");
        user.setUserPassword("JJ");
        assertEquals("JJ", user.getUserPassword());
    }
    @Test
    void setgetLoginTest(){
        User user = new User("Ad","as");
        user.setLogin(true);
        assertEquals(true, user.getLogin());
    }
}
