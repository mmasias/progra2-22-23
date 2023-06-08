package test;

import main.User;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void testUser(){
        User userName = new User("Paula", "abcde",true);
    }
   void getUserName(){
        User userName = new User("Paula", "abcde",true);
        String expectedUserName = "Paula";
    }
    void getUserPassword(){
        User userName = new User("Paula", "abcde",true);
        String expectedUserPassword = "abcde";
    }
}
