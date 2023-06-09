import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testBankAccountConstructor() {
        BankAccount account = new BankAccount("Fernando William", 1000.0);
        assertEquals("Fernando William", account.getTitular());
        assertEquals(1000.0, account.getAmount(), 0.0);
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Fernando William", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getAmount(), 0.0);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("Fernando William", 1000.0);
        account.withdraw(500.0);
        assertEquals(500.0, account.getAmount(), 0.0);
    }

    @Test
    public void testWithdrawOverAmount() {
        BankAccount account = new BankAccount("Fernando William", 1000.0);
        account.withdraw(1500.0);
        assertEquals(0.0, account.getAmount(), 0.0);
    }

    @Test
    public void testSetTitular() {
        BankAccount account = new BankAccount("Fernando William", 1000.0);
        account.setTitular("Fernando Calvo");
        assertEquals("Fernando Calvo", account.getTitular());
    }

    @Test
    public void testSetAmount() {
        BankAccount account = new BankAccount("Fernando William", 1000.0);
        account.setAmount(1500.0);
        assertEquals(1500.0, account.getAmount(), 0.0);
    }
}
