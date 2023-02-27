package Poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void createBankAccount() {
        BankAccount account1 = new BankAccount("Paula", 1500);
    }
    @Test
    public void deposit() {
        BankAccount account2 = new BankAccount("Paula", 1500);
        account2.deposit(200);
    }
    @Test
    public void depositWithdraw() {
        BankAccount account3 = new BankAccount("Paula", 1500);
        account3.deposit(1000);
        account3.withdraw(400);
    }
    @Test
    public void creationNegative() {
        BankAccount account4 = new BankAccount("Paula", 1500);
        account4.deposit(-700);
    }
    @Test
    public void withdrawNegative() {
        BankAccount account5 = new BankAccount("Paula", 1500);
        account5.withdraw(-500);
    }
    @Test
    public void overWithdraw() {
        BankAccount account6 = new BankAccount("Paula", 1500);
        account6.withdraw(4000);
    }

}