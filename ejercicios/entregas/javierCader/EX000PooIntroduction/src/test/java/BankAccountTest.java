import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void createAccountWithHolderAndAmount() {
        var account = new BankAccount("Javier", 100.25);
        assertEquals("Javier", account.getHolder());
        assertEquals(100.25, account.getAmount());
    }

    @Test
    void createAccountAndDepositAmount() {
        var account = new BankAccount("Javier", 100.25);
        assertEquals("Javier", account.getHolder());
        assertEquals(100.25, account.getAmount());

        account.deposit(50);
        assertEquals(150.25, account.getAmount());
    }

    @Test
    void createAccountDepositAndWithdraw() {
        var account = new BankAccount("Javier", 100.25);
        assertEquals("Javier", account.getHolder());
        assertEquals(100.25, account.getAmount());

        account.deposit(50);
        assertEquals(150.25, account.getAmount());

        account.withdraw(25);
        assertEquals(125.25, account.getAmount());
    }

    @Test
    void createAccountAndAddNegative() {
        var account = new BankAccount("Javier", 100.25);
        assertEquals("Javier", account.getHolder());
        assertEquals(100.25, account.getAmount());

        account.deposit(-50);
        assertEquals(100.25, account.getAmount());
    }

    @Test
    void createAccountAndWithdrawNegative() {
        var account = new BankAccount("Javier", 100.25);
        assertEquals("Javier", account.getHolder());
        assertEquals(100.25, account.getAmount());

        account.withdraw(-50);
        assertEquals(100.25, account.getAmount());
    }

    @Test
    void createAccountAndWithdrawGreaterAmount() {
        var account = new BankAccount("Javier", 100.25);
        assertEquals("Javier", account.getHolder());
        assertEquals(100.25, account.getAmount());

        account.withdraw(150);
        assertEquals(0, account.getAmount());
    }
}