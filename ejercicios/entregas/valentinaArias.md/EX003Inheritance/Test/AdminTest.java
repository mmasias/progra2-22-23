package test;

import main.Admin;
import main.User;
import org.junit.Test;

public class AdminTest {

	Admin userAdmin = new Admin();

	@Test
	public void isAdmin(){

		boolean expectedValue = true;
		boolean actualValue;
		actualValue = userAdmin.isAdmin;
	}
}
