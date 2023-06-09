package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Option;

public class OptionTest {

    @Test
    public void testAddAndGetItem() {
        Option option = new Option();
        option.add("Item 1");
        option.add("Item 2");
        option.add("Item 3");
        assertEquals("Item 1", option.getItem(0));
        assertEquals("Item 2", option.getItem(1));
        assertEquals("Item 3", option.getItem(2));
        assertNull(option.getItem(3));
    }

    @Test
    public void testDefaultSelection() {
        Option option = new Option();
        option.add("Item 1");
        option.add("Item 2");
        option.setDefaultSelection(1);
        assertEquals(1, option.getDefaultSelection());
    }

    @Test
    public void testPrint() {
        Option option = new Option();
        option.add("Item 1");
        option.add("Item 2");
        option.add("Item 3");
        option.print();
    }

}

