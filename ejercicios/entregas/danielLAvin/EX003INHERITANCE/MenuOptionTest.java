import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {
    MenuOption menu;

    @BeforeEach
    void setUp() {
        menu=new MenuOption("Open Menu");
    }

    @Test
    void getDescription() {
        assertEquals("Open Menu",menu.getDescription());
    }

    @Test
    void setDescription() {
        menu.setDescription("Mobile Menu");
        assertEquals("Mobile Menu",menu.getDescription());
    }
}