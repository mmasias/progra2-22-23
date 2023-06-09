import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {
    private MenuOption menuOption;

    @BeforeEach
    void setUp() {
        menuOption = new MenuOption("Option description");
    }

    @Test
    void getDescription() {
        assertEquals("Option description", menuOption.getDescription());
    }

    @Test
    void setDescription() {
        menuOption.setDescription("New option description");
        assertEquals("New option description", menuOption.getDescription());
    }
}
