import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    Admin admin1,admin2;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        admin1= new Admin(true);
        admin2= new Admin("Paul_78", "1234","Paul",false);
    }

    @org.junit.jupiter.api.Test
    void setAdmin() {
        assertTrue(admin1.isAdmin());
        admin1.setAdmin(false);
        assertFalse(admin1.isAdmin());
    }

    @org.junit.jupiter.api.Test
    void isAdmin() {
        assertFalse(admin2.isAdmin());

    }
}