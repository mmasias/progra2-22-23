package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {
    @Test
    void validateOwnerAndAccount(){
        BankAccount owner = new BankAccount();
        owner.setAccountHolder("Carlos");
        BankAccount account = new BankAccount();
        account.setAmount(120);

        assertEquals("Carlos", owner.getAccountHolder());
        assertEquals(120, account.getAmount());
    }

    @Test
    void validateAccountAndDeposit(){
        BankAccount account = new BankAccount();
        account.setAmount(120);
        account.deposit(20.05);
        assertEquals(140.05,account.getAmount());
    }
    @Test
    void validateAccountDepositWithDraw(){
        BankAccount account = new BankAccount();
        account.setAmount(120);
        account.deposit(20.05);
        account.withdraw(30.05);
        assertEquals(110,account.getAmount(),1);
    }
    @Test
    void validateAccountAndWrongDeposit(){
        BankAccount account = new BankAccount();
        account.setAmount(120);
        account.deposit(-20.05);
        assertEquals(120,account.getAmount());
    }
    @Test
    void validateAccountAndWrongWithDraw(){
        BankAccount account = new BankAccount();
        account.setAmount(120);
        account.withdraw(-20.05);
        assertEquals(120,account.getAmount());
    }
    @Test
    void validateAccountAndBiggerWithDraw(){
        BankAccount account = new BankAccount();
        account.setAmount(120);
        account.withdraw(120.05);
        assertEquals(0,account.getAmount());
    }






}