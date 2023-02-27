package Poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class BankAccountTest {
    @Test
    void testCreatingAccount(){
        BankAccount bankAccount = new Poo.BankAccount("Santiago Gomez de la Torre", 150.36);
        Assertions.assertEquals("Santiago Gomez de la Torre", bankAccount.getName());
        Assertions.assertEquals(150.36, bankAccount.getAmount(), 0);
    }

    @Test
    void testCreatingBankAmount(){
        BankAccount bankAccount = new Poo.BankAccount("Santiago Gomez de la Torre", 150.36);

        bankAccount.Deposit(60);
        Assertions.assertEquals(210.36, bankAccount.getAmount(),0);
    }

    @Test
    void testCreatingBankDepositAndWithdraw(){
        BankAccount bankAccount = new Poo.BankAccount("Santiago Gomez de la Torre", 150.36);
        bankAccount.Deposit(60);
        bankAccount.Withdraw(120);

        Assertions.assertEquals(90.36000000000001, bankAccount.getAmount(),0);
    }

}
