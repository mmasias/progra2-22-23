package src.Poo;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void newAccountTest(){
        BankAccount testAccount = new BankAccount("César García", 1000);
    }

    @Test
    public void depositTest(){
        BankAccount testAccount = new BankAccount("César García", 1000);
        testAccount.deposit(500);
    }
    @Test
    public void depositWithdrawTest(){
        BankAccount testAccount = new BankAccount("César García", 1000);
        testAccount.deposit(2000);
        testAccount.withdraw(4000);
    }
    @Test
    public void depositNegativeTest(){
        BankAccount testAccount = new BankAccount("César García", 1000);
        testAccount.deposit(-1500);
    }

    @Test
    public void withdrawTest(){
        BankAccount testAccount = new BankAccount("César García", 1000);
        testAccount.withdraw(-1000);
    }

    @Test
    public void withdrawExcessTest(){
        BankAccount testAccount = new BankAccount("César García", 1000);
        testAccount.withdraw(5000);
    }

}