import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    UserManager user;

    @BeforeEach
    void setUp() {
        user = new UserManager(8);
    }

    @Test
    void registerUser() {
        user.registerUser(new User("Daniel","DLA18","Daniel18"));
        assertEquals(1,user.size);
    }

    @Test
    void isUserAdmin() {
    }
}