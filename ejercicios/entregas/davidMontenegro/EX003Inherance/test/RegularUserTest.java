package test;
import src.RegularUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularUserTest {

    static RegularUser regUser;

    @BeforeAll
    static void setUp() {
        regUser = new RegularUser();
        regUser.setUserName("NormalUser");
        regUser.setPassword("123456");
        regUser.setName("Normal");
    }

    @Test
    void RegularUser() {
        String expectedUserName = "NormalUser";
        String expectedPassword = "123456";
        String expectedName = "Normal";

        assertEquals(expectedUserName, regUser.getUserName());
        assertEquals(expectedPassword, regUser.getPassword());
        assertEquals(expectedName, regUser.getName());

    }
}