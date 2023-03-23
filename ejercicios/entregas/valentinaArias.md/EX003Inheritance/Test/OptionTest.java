package test;

import main.Admin;
import main.Options;
import main.User;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OptionsTest {

	public void testOptions() {
		Options options = new Options(10);
		options.add("Option 1");
		options.add("Option 2");
		options.add("Option 3");
		options.add("Option 4");
		options.add("Option 5");
		options.add("Option 6");

		assertEquals(5, options.getSize());
		assertEquals("Option 1", options.getItem(0));
		assertEquals("Option 5", options.getItem(4));
		assertEquals(null, options.getItem(5));

		options.setDefaultSelection(2);
		assertEquals(2, options.getDefaultSelection());

		String[] expectedItems = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};
		assertArrayEquals(expectedItems, options.getItems());
	}
