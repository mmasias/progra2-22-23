package test;
import main.RegularUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegularUserTest {

    static RegularUser regUser;

    @BeforeAll
    static void setUp() {
        regUser = new RegularUser();
        regUser.setUserName("dinO89");
        regUser.setPassword("123456");
        regUser.setName("Daniel");
    }

    @Test
    void RegularUser() {
        String expectedUserName = "dinO89";
        String expectedPassword = "123456";
        String expectedName = "Daniel";

        assertEquals(expectedUserName, regUser.getUserName());
        assertEquals(expectedPassword, regUser.getPassword());
        assertEquals(expectedName, regUser.getName());

    }
}
