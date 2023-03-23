import org.junit.Test;
import static org.junit.Assert.*;

public class MenuOptionTest {

    @Test
    public void testConstructor() {
        MenuOption option = new MenuOption(3);
        assertEquals(3, option.getOptionsNumber());
    }

    @Test
    public void testGetDescription() {
        MenuOption option = new MenuOption(3);
        option.setDescription("Option 1");
        assertEquals("Option 1", option.getDescription());
    }

    @Test
    public void testSetDescription() {
        MenuOption option = new MenuOption(3);
        option.setDescription("Option 1");
        option.setDescription("New option");
        assertEquals("New option", option.getDescription());
    }
}
