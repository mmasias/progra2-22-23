import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
Admin admin;
    @BeforeEach
    void setUp() {
        admin = new Admin("Sergioo", "1234", "Sergio", false);
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