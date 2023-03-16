package tests;

import main.User;
import main.UsersDataBase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTests {
    @Test
    public void TestRegisterUsers(){
        UsersDataBase.AddUser("User1", "Password1");
        UsersDataBase.AddUser("User2", "Password2");
        UsersDataBase.AddUser("User3", "Password3");

        User expected1 = new User("User1", "Password1");
        assertNotNull(UsersDataBase.FindUser("User1"));
        assertTrue(UsersDataBase.FindUser("User1").CheckPassword("Password1"));

        User expected2 = new User("User2", "Password2");
        assertNotNull(UsersDataBase.FindUser("User2"));
        assertTrue(UsersDataBase.FindUser("User2").CheckPassword("Password2"));

        User expected3 = new User("User3", "Password3");
        assertNotNull(UsersDataBase.FindUser("User3"));
        assertTrue(UsersDataBase.FindUser("User3").CheckPassword("Password3"));
    }

    // Test Log In Correct
    @Test
    public void TestLogIn(){
        UsersDataBase.AddUser("User1", "Password1");
        String testUsername = "User1";
        String correctPassword = "Password1";

        assertTrue(UsersDataBase.FindUser(testUsername).CheckPassword("Password1"));
    }

    // Test Log In Fail
    @Test
    public void TestBadLogIn(){
        UsersDataBase.AddUser("User2", "Password2");
        String testUsername = "User2";
        String badPassword = "Password1";
        assertFalse(UsersDataBase.FindUser(testUsername).CheckPassword(badPassword));
    }





}
