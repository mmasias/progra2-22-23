package test;

import main.Options;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionsTest {

    @Test
    public void testOptionsConstructor() {
        Options options = new Options(33);
        assertEquals(33, options.capacity);
        assertEquals(0, options.size);
        assertEquals(0, options.defaultSelection);
        assertNotNull(options.items);
    }

    @Test
    public void testAddItem() {
        Options options = new Options();
        options.add("Tool");
        assertEquals(1, options.size);
        assertEquals("Tool", options.items[0]);
    }

    @Test
    public void testGetItem() {
        Options options = new Options();
        options.add("Tool");
        options.add("pencil");
        assertEquals("Tool", options.getItem(0));
        assertEquals("pencil", options.getItem(1));
        assertNull(options.getItem(2));
    }

    @Test
    public void testSetDefaultSelection() {
        Options options = new Options();
        options.setDefaultSelection(2);
        assertEquals(2, options.getDefaultSelection());
    }

    @Test
    public void testPrint() {
        Options options = new Options();
        options.add("Tool");
        options.add("pencil");
        options.add("calculator");
        options.print();
    }

}
