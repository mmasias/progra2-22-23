import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest  {
User u1;


    @BeforeEach
    void setUp() {
        u1= new User(true,"12345","di Stefano");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetLogin() {
        assertEquals(true,u1.getLogin());
    }



    @Test
    void testGetPassword() {
        assertEquals("12345",u1.getPassword());
    }
    @Test
    void testGetName() {
        assertEquals("di Stefano",u1.getName());
    }


}