import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ManagerTest {

	private Manager manager;
	private User user1;
	private User user2;

	@Before
	public void setUp() {
		manager = new Manager(2);
		user1 = new User("user1", "password1");
		user2 = new User("user2", "password2");
	}

	@Test
	public void testAddUser() {
		assertTrue(manager.addUser(user1));
		assertTrue(manager.addUser(user2));
		assertFalse(manager.addUser(new User("user3", "password3")));
	}

	@Test
	public void testAuthenticateUser() {
		assertFalse(manager.authenticateUser("user1", "password1"));
		manager.addUser(user1);
		assertTrue(manager.authenticateUser("user1", "password1"));
		assertFalse(manager.authenticateUser("user1", "wrongpassword"));
		assertFalse(manager.authenticateUser("wronguser", "password1"));
	}

	@Test
	public void testShowMenu() {
		manager.showMenu();
		assertFalse(manager.isAuthenticatedUser());
		manager.addUser(user1);
		manager.authenticateUser("user1", "password1");
		manager.showMenu();
		assertTrue(manager.isAuthenticatedUser());
		assertEquals(1, manager.getSelectedOption());
	}
}
