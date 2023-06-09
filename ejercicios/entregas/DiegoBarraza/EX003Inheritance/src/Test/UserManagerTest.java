package Test;

import Main.User;
import Main.UserManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @BeforeEach
    void setUp() {
        UserManager userManager = new UserManager(10);
    }

    @Test
    void registerUser() {
        UserManager userManager = new UserManager(10);
        User user1 = new User("Diego","1234567");
        userManager.registerUser(user1);
    }

    @Test
    void isUserAdmin() {
        UserManager userManager = new UserManager(10);
        User user1 = new User("Diego", "1234567");
        userManager.registerUser(user1);
        assertFalse(userManager.isUserAdmin(user1));
    }
}