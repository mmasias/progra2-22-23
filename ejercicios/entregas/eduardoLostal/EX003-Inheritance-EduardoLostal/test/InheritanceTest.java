import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InheritanceTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager();
    }

    @Test
    public void testAdd() {
        User user = new User("testuser", "password","testname");
        MenuOption menu = new MenuOption();
        manager.add(user, menu);
        assertEquals(user, manager.users[0]);
        assertEquals(menu, manager.menus[0]);
    }

    @Test
    public void testLoginSuccess() {
        User user = new User("testuser", "password","testname");
        MenuOption menu = new MenuOption();
        manager.add(user, menu);
        assertEquals(user, manager.login("testuser", "password"));
    }

    @Test
    public void testLoginInvalid() {
        User user = new User("testuser", "password","testname");
        MenuOption menu = new MenuOption();
        manager.add(user, menu);
        assertNull(manager.login("testuser", "wrongpassword"));
    }

    @Test
    public void testShowMenu() {
        User user = new User("testuser", "password","testname");
        MenuOption menu = new MenuOption();
        menu.add("Option 1");
        menu.add("Option 2");
        manager.add(user, menu);

        // Simulate user input
        System.setIn(new ByteArrayInputStream("1".getBytes()));

        // Simulate console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        manager.showMenu();

        assertEquals("Option 1 selected", outContent.toString().trim());
        assertEquals(0, menu.getSelectedOption());
    }

}
