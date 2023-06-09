package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {
    @Test
    void loginSuccesfulTest(){
        Options regularOptions = new Options(1);
        regularOptions.add("Login");
        RegularUser user = new RegularUser("Jorge", "as", "Jorge23");
        UserManager manager = new UserManager();
        manager.registerUser(user);
        boolean expected = true;
        boolean actual = user.login("Jorge", "as");
        assertEquals(expected, actual);
    }
    @Test
    void loginFailedTest(){
        Options regularOptions = new Options(1);
        regularOptions.add("Login");
        RegularUser user = new RegularUser("Jorge", "as", "Jorge23");
        UserManager manager = new UserManager();
        manager.registerUser(user);

        boolean expected = false;
        boolean actual = user.login("J", "as");
        assertEquals(expected, actual);

        actual = user.login("Jorge", "t");
        assertEquals(expected, actual);
    }
    @Test
    void adminLogin(){
        Options regularOptions = new Options(1);
        regularOptions.add("Login");
        Admin boss = new Admin("Jorge", "as", "Jorge25");
        UserManager manager = new UserManager();
        manager.registerUser(boss);
        boolean expected = true;
        boolean actual = UserManager.isUserAdmin(boss);
        assertEquals(expected, actual);
    }
}
