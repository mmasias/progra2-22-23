package test;
import src.MenuOption;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MenuOptionTest {
    static MenuOption menu;

    @BeforeAll
    static void setUp() {
        menu = new MenuOption();
    }
    @Test
    void getDescription() {
        String expected = " ";
        assertEquals(expected, menu.getDescription());
    }
    @Test
    void setDescription() {
        menu.setDescription("Orders the users in alphabetical order");
        String expected = "Orders the users in alphabetical order";
        assertEquals (expected, menu.getDescription());
    }
}