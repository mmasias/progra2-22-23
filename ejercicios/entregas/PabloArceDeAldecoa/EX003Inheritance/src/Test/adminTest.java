package Test;

import Main.admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class adminTest {
    admin admin = new admin(true,"Manolo","Manolo","1234");
    @Test
    void isAdmin() {
        assertTrue(admin.isAdmin());
    }

    @Test
    void setAdmin() {
        admin.setAdmin(false);
        assertFalse(admin.isAdmin());
    }
}