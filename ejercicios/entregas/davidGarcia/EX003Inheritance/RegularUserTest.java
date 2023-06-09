import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularUserTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void checkConstructor(){
        RegularUser user =new RegularUser();
        assertEquals("user",user.getUserName());
        return;
    }
}