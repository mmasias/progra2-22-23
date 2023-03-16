package tests;

import main.Manager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ManagerTest {

	@Test
	public void testScannerString() {
		String input = "test input";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		assertEquals(input, Manager.scannerString());
	}

	@Test
	public void testGetIsLogged() {
		Manager manager = new Manager();
		assertFalse(manager.getIsLogged());

		manager.setIsLogged(true);
		assertTrue(manager.getIsLogged());

		manager.setIsLogged(false);
		assertFalse(manager.getIsLogged());
	}
}