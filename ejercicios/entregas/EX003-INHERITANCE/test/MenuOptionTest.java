import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void setDescription() {
        MenuOption option = new MenuOption("Menu option");
        option.setDescription("New option menu");
        assertEquals("New menu option", option.getDescription());
    }
}