package test;
import main.Admin;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AdminTest {

    static Admin admin;

    @BeforeAll
    static void setUp() {
        admin = new Admin();
        admin.setUserName("runFun22");
        admin.setPassword("852637");
        admin.setName("Elsa");
    }

    @Test
    void isAdmin() {
        boolean expected = false;
        assertEquals(expected, admin.isAdmin());
    }

    @Test
    void setAdmin() {
        admin.setAdmin(true);
        boolean expected = true;
        assertEquals (expected, admin.isAdmin());
    }

    @Test
    void Admin() {
        String expectedUserName = "runFun22";
        String expectedPassword = "852637";
        String expectedName = "Elsa";
        boolean expectedAdmin = false;

        assertEquals (expectedUserName, admin.getUserName());
        assertEquals (expectedPassword, admin.getPassword());
        assertEquals (expectedName, admin.getName());
        assertEquals (expectedAdmin, admin.isAdmin());
    }
}
