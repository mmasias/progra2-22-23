import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
UserManager mt;
User u1;
User u2;
    @BeforeEach
    void setUp() {
        mt= new UserManager(3);
        u1= new User("Jack__Sparrow","1234","Jack");
        u2= new User("San^Patrick","43211","Patrick");
        mt.registerUser(u1);
        mt.registerUser(u2);
        mt.registerUser(new Admin(true));
    }


    @Test
    void registerUser() {

assertEquals(3,mt.size);
    }

    @Test
    void isUserAdmin() {
        assertTrue(mt.isUserAdmin(new Admin(true)));
    }
}