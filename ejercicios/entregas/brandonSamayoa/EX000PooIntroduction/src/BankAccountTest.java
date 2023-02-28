import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount Account = new BankAccount("Juan", 1000.0);
        Account.deposit(500.0);
        assertEquals(1500.0, Account.getAmount(), 0.001);
    }

    @Test
    public void testNegativeDeposit() {
        BankAccount Account = new BankAccount("Juan", 1000.0);
        Account.deposit(-500.0);
        assertEquals(1000.0, Account.getAmount(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount Account = new BankAccount("Juan", 1000.0);
        Account.withdraw(500.0);
        assertEquals(500.0, Account.getAmount(), 0.001);
    }

    @Test
    public void testWithdrawBiggerThanCuantity() {
        BankAccount Account = new BankAccount("Juan", 1000.0);
        Account.withdraw(1500.0);
        assertEquals(0.0, Account.getAmount(), 0.001);
    }

    @Test
    public void GetTitular() {
        BankAccount Account = new BankAccount("Juan", 1000.0);
        assertEquals("Juan", Account.getOwner());
        Account.deposit(500.0);

    }

}
