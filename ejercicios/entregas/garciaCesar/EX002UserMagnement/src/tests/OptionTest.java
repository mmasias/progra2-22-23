package tests;

import static org.junit.Assert.*;

import main.User;
import org.junit.Before;
import org.junit.Test;
import main.Option;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class OptionTest {
	private Scanner scanner;

	private Option option;

	@Before
	public void setUp() {
		option = new Option();
		scanner = new Scanner(System.in);
	}

	@Test
	public void testGetIsLoggedIn() {
		assertEquals(true, Option.getIsLoggedIn());
	}

	@Test
	public void testSetIsLoggedIn() {
		option.setIsLoggedIn(false);
		assertEquals(false, Option.getIsLoggedIn());
	}


	@Test
	public void testLogOut() {
		option.setIsLoggedIn(false);
		assertEquals(false, Option.getIsLoggedIn());
	}

}