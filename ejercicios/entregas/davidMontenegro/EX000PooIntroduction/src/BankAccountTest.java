import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.BankAccount;
public class BankAccountTest {
    @Test
    public void testBankAccountGetAttributes() {
        BankAccount bankAccount = new BankAccount("David", 5.0);
        Assertions.assertEquals("David", bankAccount.getOwner());
        Assertions.assertEquals(5.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountSetAttributes() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwner("Ivan");
        bankAccount.setAmount(0.0);
        Assertions.assertEquals("Ivan", bankAccount.getOwner());
        Assertions.assertEquals(0.0, bankAccount.getAmount(), 0.0);

    }
    @Test
    public void testBankAccountDeposit() {
        BankAccount bankAccount = new BankAccount("Carl", 5.0);
        bankAccount.deposit(10.0);
        Assertions.assertEquals(15.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountDepositAndWithdraw() {
        BankAccount bankAccount = new BankAccount("Dave", 5.0);
        bankAccount.deposit(10.0);
        bankAccount.withdraw(6.0);
        Assertions.assertEquals(9.0, bankAccount.getAmount(),0.0);
    }

    // Addicional Tests
    @Test
    public void testBankAccountNegativeDeposit() {
        BankAccount bankAccount = new BankAccount("Alex", 5.0);
        bankAccount.deposit(-3.0);
        Assertions.assertEquals(5.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountNegativeWithdraw() {
        BankAccount bankAccount = new BankAccount("Danielle", 5.0);
        bankAccount.withdraw(-10.0);
        Assertions.assertEquals(5.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountWithdrawLargerSumThanAmount() {
        BankAccount bankAccount = new BankAccount("Sam", 5.0);
        bankAccount.withdraw(50.0);
        Assertions.assertEquals(0.0, bankAccount.getAmount(),0.0);
    }
}