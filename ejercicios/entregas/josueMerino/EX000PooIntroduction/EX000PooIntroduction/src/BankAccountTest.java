import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {

    @org.junit.jupiter.api.Test
    void testCreateBankAccountWithOwnerAndInitialQuantity() {
        BankAccount bankAccount = new BankAccount("Joshua", 150);
        assertEquals("Joshua", bankAccount.getOwner());
        assertEquals(150, bankAccount.getQuantity());

    }

    @org.junit.jupiter.api.Test
    void testDepositBankAccount() {
        BankAccount bankAccount = new BankAccount("Joshua", 150);
        bankAccount.deposit(30.5);

        assertEquals(180.5, bankAccount.getQuantity());

    }

    @org.junit.jupiter.api.Test
    void testDepositAndWithdrawBankAccount() {
        BankAccount bankAccount = new BankAccount("Joshua", 150);
        bankAccount.deposit(20.5);
        bankAccount.withdraw(50);
        assertEquals(120.5, bankAccount.getQuantity());
    }

    @org.junit.jupiter.api.Test
    void testDepositNegativeQuantityBankAccount() {
        BankAccount bankAccount = new BankAccount("Joshua", 150);

        bankAccount.deposit(-20.5);

        assertEquals(150, bankAccount.getQuantity());
    }

    @org.junit.jupiter.api.Test
    void testWithdrawNegativeQuantityBankAccount() {
        BankAccount bankAccount = new BankAccount("Joshua", 150);
        bankAccount.withdraw(-50);
        assertEquals(150, bankAccount.getQuantity());
    }

    @org.junit.jupiter.api.Test
    void testOverWithdrawBankAccount() {
        BankAccount bankAccount = new BankAccount("Joshua", 150);
        bankAccount.withdraw(160);
        assertEquals(0, bankAccount.getQuantity());
    }
}