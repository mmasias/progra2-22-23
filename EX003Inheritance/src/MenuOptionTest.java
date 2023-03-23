import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {
MenuOption m;
    @BeforeEach
    void setUp() {
        m= new MenuOption();

    }

    @Test
    void getDescription() {
        m.setDescription("Car Menu");
        assertEquals("Car Menu",m.getDescription());
    }


}