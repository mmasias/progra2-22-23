package src;
import org.junit.Test;
import org.junit.Assert;

public class BankAccountTest {
    @Test
    public void testBankAccountGetAttributes() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        Assert.assertEquals("John", bankAccount.getOwner());
        Assert.assertEquals(5.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountSetAttributes() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwner("Pedro");
        bankAccount.setAmount(0.0);
        Assert.assertEquals("Pedro", bankAccount.getOwner());
        Assert.assertEquals(0.0, bankAccount.getAmount(), 0.0);

    }
    @Test
    public void testBankAccountDeposit() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        bankAccount.deposit(10.0);
        Assert.assertEquals(15.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountDepositAndWithdraw() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        bankAccount.deposit(10.0);
        bankAccount.withdraw(6.0);
        Assert.assertEquals(9.0, bankAccount.getAmount(),0.0);
    }

    // Addicional Tests
    @Test
    public void testBankAccountNegativeDeposit() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        bankAccount.deposit(-3.0);
        Assert.assertEquals(5.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountNegativeWithdraw() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        bankAccount.withdraw(-10.0);
        Assert.assertEquals(5.0, bankAccount.getAmount(),0.0);
    }
    @Test
    public void testBankAccountWithdrawLargerSumThanAmount() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        bankAccount.withdraw(100.0);
        Assert.assertEquals(0.0, bankAccount.getAmount(),0.0);
    }
}