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

        user=new RegularUser("Dani","DLA04","daniel18");
        assertEquals("Dani",user.getUserName());
        assertEquals("DLA04",user.getPassword());
        assertEquals("daniel18",user.getName());
    }


}