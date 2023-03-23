package Test;

import Main.UserManager;
import org.junit.jupiter.api.BeforeEach;

class UserManagerTest {
    @BeforeEach
    void setUp() {
        UserManager user;
        user = new UserManager(30);
    }
}