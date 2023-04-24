import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularUserTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void compareCostructor(){
        RegularUser user= new RegularUser();


        assertEquals("user", user.getUserName());
        assertEquals("password", user.getPassword());
        assertEquals("User", user.getName());

        user= new RegularUser("Lydia", "LGR04", "lydiaa04");
        assertEquals("Lydia", user.getUserName());
        assertEquals("LGR04", user.getPassword());
        assertEquals("lydiaa04", user.getName());
    }
}