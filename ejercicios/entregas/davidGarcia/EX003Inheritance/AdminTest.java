import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
    Admin admin;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        admin= new Admin(true);
    }

    @org.junit.jupiter.api.Test
    void isAdmin() {
        assertTrue(admin.isAdmin());
    }

    @org.junit.jupiter.api.Test
    void setAdmin() {
        admin.setAdmin(false);
        assertFalse(admin.isAdmin());
    }
}