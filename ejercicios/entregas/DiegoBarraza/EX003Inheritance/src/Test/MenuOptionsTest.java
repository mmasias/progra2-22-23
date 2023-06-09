package Test;

import Main.MenuOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionsTest {


    @BeforeEach
    void setUp() {
    }
    @Test
    void setDescription() {
        MenuOptions options = new MenuOptions("Option Menu");
        options.setDescription("New option Menu");
        assertEquals("New option Menu",options.getDescription());
    }

    @Test
    void getDescription() {
    }
}