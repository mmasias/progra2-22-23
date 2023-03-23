package Test;

import Main.Admin;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
    Admin admin;
    @BeforeEach
    void setUp() {
        admin = new Admin("TheMoys", "123", "Diego", false);
    }

    @Test
    void isAdmin() {
        assertFalse(admin.isAdmin());
    }

    @Test
    void setAdmin() {
        admin.setAdmin(true);
        assertTrue(admin.isAdmin());
    }

}