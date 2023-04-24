import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    UserManager usr;

    @BeforeEach
    void setUp() {
        usr= new UserManager(5 );
    }

    @Test
    void registerUser() {
        usr.RegisterUser(new User("Lydiaa","LGR", "lydii" ));
        assertEquals(1, usr.size);
    }

    @Test
    void isUserAdmin() {
    }
}