import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    UserManager usMan;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        usMan= new UserManager(4);
        usMan.registerUser(new Admin("David","12345","David",true));
        usMan.registerUser(new Admin("Terry","123456","Terry",false));


    }


    @Test
    void registerUser() {
        usMan.registerUser(new Admin(true));
        assertEquals(2,4,usMan.size);
        usMan.registerUser(new Admin(true));
        assertEquals(2,4,usMan.size);
    }

    @Test
    void isUserAdmin() {
        UserManager userManager = new UserManager(10);
        User user1 = new User("David", "12345", "David");
        userManager.registerUser(user1);

        Admin admin1 = new Admin("Terry", "123", "Terry", true);
        userManager.registerUser(admin1);
        assertTrue(userManager.isUserAdmin(admin1));
    }
}