package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    User userAdmin, userRegular;
    UserManager testManager;

    @Test
    void isUserAdmin() {
        testManager = new UserManager();

        userRegular = new RegularUser("Test", "123");
        userAdmin = new Admin("TestB", "123123");

        boolean expectedStateAdmin = true;
        boolean actualStateAdmin = testManager.isUserAdmin(userAdmin);

        assertEquals(expectedStateAdmin, actualStateAdmin);

    }
}