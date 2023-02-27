package Poo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTest {

    @Test
    void createBankAccount() {
        BankAccount accountOne = new BankAccount("Sam", 623.25);
        assertEquals(623.25, accountOne.getAccountAmount());
    }

    @Test
    void doDeposit() {
        BankAccount accountTwo = new BankAccount("Luca", 100.69);
        accountTwo.deposit(15.3);
        assertEquals(115.99,accountTwo.getAccountAmount());
    }

    @Test
    void doWithdraw() {
        BankAccount accountThree = new BankAccount("Anne", 136.25);
        accountThree.withdraw(30.2);
        assertEquals(106.05, accountThree.getAccountAmount());
    }




}
