import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    
    @Test
    public void testCreateAccountWithHolderAndInitialAmount() {
        BankAccount account = new BankAccount("John Doe", 100.0);
        assertEquals("John Doe", account.getHolder());
        assertEquals(100.0, account.getAmount(), 0.0);
    }
    
    @Test
    public void testDepositPositiveAmount() {
        BankAccount account = new BankAccount("John Doe", 100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getAmount(), 0.0);
    }
    
    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount("John Doe", 100.0);
        account.deposit(-50.0);
        assertEquals(100.0, account.getAmount(), 0.0);
    }
    
    @Test
    public void testWithdrawPositiveAmount() {
        BankAccount account = new BankAccount("John Doe", 100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getAmount(), 0.0);
    }
    
    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount("John Doe", 100.0);
        account.withdraw(-50.0);
        assertEquals(100.0, account.getAmount(), 0.0);
    }
    
    @Test
    public void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount("John Doe", 100.0);
        account.withdraw(150.0);
        assertEquals(0.0, account.getAmount(), 0.0);
    }
}