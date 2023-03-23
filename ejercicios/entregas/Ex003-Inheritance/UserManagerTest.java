import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @BeforeEach
    void setUp() {
        UserManager user;
        user = new UserManager(30);
    }
}