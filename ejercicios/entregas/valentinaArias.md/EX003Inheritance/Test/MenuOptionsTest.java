package test;


import main.MenuOption;
import org.junit.Test;
import static org.junit.Assert.*;

	public class MenuOptionTest {

		@Test
		public void testGetDescription() {
			MenuOption options = new MenuOption();
			options.setDescription("Test option");
			assertEquals("Test option", options.getDescription());
		}

		@Test
		public void testSetDescription() {
			MenuOption option = new MenuOption();
			option.setDescription("Test option");
			assertEquals("Test option", option.getDescription());

			option.setDescription("New test option");
			assertEquals("New test option", option.getDescription());
		}
	}
