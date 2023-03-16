package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.User;

public class UserTest {

	private User user;

	@Before
	public void setUp() {
		user = new User("testuser", "testpassword", false);
	}

	@Test
	public void testGetUsername() {
		assertEquals("testuser", user.getUsername());
	}

	@Test
	public void testGetUserPassword() {
		assertEquals("testpassword", user.getUserPassword());
	}

	@Test
	public void testSetUsername() {
		user.setUsername("newusername");
		assertEquals("newusername", user.getUsername());
	}

	@Test
	public void testSetUserPassword() {
		user.setUserPassword("newpassword");
		assertEquals("newpassword", user.getUserPassword());
	}

	@Test
	public void testIsLogged() {
		assertFalse(user.isLogged());
	}

	@Test
	public void testSetLogged() {
		user.setLogged(true);
		assertTrue(user.isLogged());
	}

}