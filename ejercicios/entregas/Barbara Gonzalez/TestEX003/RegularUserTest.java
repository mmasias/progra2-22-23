import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularUserTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void verifyUser(){
        RegularUser user= new RegularUser("user","password","User");
        assertEquals("user", user.getUserName());
        assertEquals("password", user.getPassword());
        assertEquals("User", user.getName());

        user=new RegularUser("Barbara","BGD20","Barbara20");
        assertEquals("Barbara",user.getUserName());
        assertEquals("BGD20",user.getPassword());
        assertEquals("Barbara20",user.getName());
    }


}

