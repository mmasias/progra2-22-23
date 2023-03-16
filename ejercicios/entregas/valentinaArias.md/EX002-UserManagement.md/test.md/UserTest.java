import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class UserTest {

	@Test
	public void testGetLogin() {
		User user = new User("password1", "Juan");
		user.setLogin(true);
		assertTrue(user.getLogin());
	}

	@Test
	public void testGetPassword() {
		User user = new User("password1", "Juan");
		assertEquals("password1", user.getPassword());
	}

	@Test
	public void testGetName() {
		User user = new User("password1", "Juan");
		assertEquals("Juan", user.getName());
	}

	@Test
	public void testSetLogin() {
		User user = new User("password1", "Juan");
		user.setLogin(true);
		assertTrue(user.getLogin());
		user.setLogin(false);
		assertFalse(user.getLogin());
	}

	@Test
	public void testSetPassword() {
		User user = new User("password1", "Juan");
		user.setPassword("newPassword");
		assertEquals("newPassword", user.getPassword());
	}

	@Test
	public void testSetName() {
		User user = new User("password1", "Juan");
		user.setName("Pedro");
		assertEquals("Pedro", user.getName());
	}
}
