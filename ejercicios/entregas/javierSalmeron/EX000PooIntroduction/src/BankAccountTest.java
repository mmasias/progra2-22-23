
//Unit Test Code
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testGetHolder() {
        BankAccount account = new BankAccount("Javier S", 1000);
        assertEquals("Javier S", account.getholder());
    }

    @Test
    public void testSetHolder() {
        BankAccount account = new BankAccount("Javier S", 1000);
        account.setholder("Javier S");

        assertEquals("Javier S", account.getholder());
    }

    @Test
    public void testGetAmount() {
        BankAccount account = new BankAccount("Javier S", 1000);

        assertEquals(1000, account.getAmount(), 0);
    }

    @Test
    public void testSetAmount() {
        BankAccount account = new BankAccount("Javier S", 1000);

        account.setAmount(2000);

        assertEquals(2000, account.getAmount(), 0);
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Javier S", 1000);

        account.deposit(500);

        assertEquals(1500, account.getAmount(), 0);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("Javier S", 1000);

        account.withdraw(500);

        assertEquals(500, account.getAmount(), 0);
    }
}