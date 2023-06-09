package Test;

import Main.MenuOption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {
    MenuOption menu = new MenuOption("Set of options");
    @Test
    void getDescription() {
        assertEquals("Set of options", menu.getDescription());
    }

    @Test
    void setDescription() {
        menu.setDescription("New set of options");
        assertEquals("New set of options", menu.getDescription());
    }
}