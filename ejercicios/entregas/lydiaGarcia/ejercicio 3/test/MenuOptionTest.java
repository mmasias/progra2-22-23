import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {
MenuOption menu;
    @BeforeEach
    void setUp() {
        menu= new MenuOption("Mobile Menu");
    }

    @Test
    void getDescription() {
        assertEquals("Mobile Menu", menu.getDescription()) ;
    }

    @Test
    void setDescription() {
        menu.setDescription("Laptop Menu");
        assertEquals("Laptop Menu", menu.getDescription()) ;
    }
}