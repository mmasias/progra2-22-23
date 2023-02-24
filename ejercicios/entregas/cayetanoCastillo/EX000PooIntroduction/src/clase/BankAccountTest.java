package clase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	@Test
	void testBankAccountObject() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	Assert.assertTrue(B1.getHeadline().equals("Persona 1"));
	Assert.assertTrue(B1.getAmount() == 20);
	}
	

	@Test
	void testGetHeadline() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	Assert.assertTrue(B1.getHeadline().equals("Persona 1" ));
	}
	@Test
	void testGetAmount() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	Assert.assertTrue(B1.getAmount() == 20);
	}
	@Test
	void testSetHeadline() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.setHeadline("Persona - 1");
	Assert.assertTrue(B1.getHeadline().equals("Persona - 1"));
	}
	@Test
	void testSetAmount() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.setAmount(30);
	Assert.assertTrue(B1.getAmount() == 30);
	}
	@Test
	void testDeposit() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.deposit(30);
	Assert.assertTrue(B1.getAmount() == 50);
	//Assert.assertFalse(B1.getAmount() == 40);
	
	
	}
	@Test
	void testWithdraw() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.withdraw(10);
	Assert.assertTrue(B1.getAmount() == 10);
	
	}
	@Test
	void testNegativeDeposit() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.deposit(-30);
	Assert.assertTrue(B1.getAmount() == 20);
	//Assert.assertFalse(B1.getAmount() == 40);
	
	}
	@Test
	void testNegativeWithdraw() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.withdraw(-30);
	Assert.assertTrue(B1.getAmount() == 20);
	
	}
	@Test
	void testPlusWithdraw() {
	BankAccount B1 = new BankAccount("Persona 1",20);
	B1.withdraw(30);
	Assert.assertTrue(B1.getAmount() == 0);
	
	}
}
