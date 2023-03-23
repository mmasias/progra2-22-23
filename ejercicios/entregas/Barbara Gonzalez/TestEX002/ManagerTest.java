import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    UserManager user;

    @BeforeEach
    void setUp() {
        user = new UserManager(8);
    }

    @Test
    void registerUser() {
        user.registerUser(new User("Barbara","BGD20","Barbara20"));
        assertEquals(1,user.size);
    }

    @Test
    void isUserAdmin() {
    }

}