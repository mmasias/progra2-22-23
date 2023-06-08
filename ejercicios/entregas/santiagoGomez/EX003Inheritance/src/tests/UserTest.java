package src.tests;

import org.junit.jupiter.api.Test;
import src.portalWeb.RegularUser;
import src.portalWeb.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest{
    @Test
    void testGetSetUser(){
        User user = new RegularUser("Test","password","Testing Test");

        assertEquals("test", User.getUserName());
        assertEquals("password", User.getPass());
        assertEquals("Testing Test", User.getName());

        user.setUserName("testingNewUser");
        user.setPass("newPassword");
        user.setName("New Testing");

        assertEquals("testingNewUser", User.getUserName());
        assertEquals("newPassword", User.getPass());
        assertEquals("New Testing", User.getName());


    }

}
