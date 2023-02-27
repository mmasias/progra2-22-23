package Poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void createAccount() {
        BankAccount account1 = new BankAccount("Sergio Moreno",800.50);
        assertEquals(400.6,account1.getQuantity(),"The account amount isnt correct");
    }

    @Test
    void depositMoney() {
        BankAccount account1 = new BankAccount("Sergio Moreno",230.50);
        account1.deposit(124.00);
        assertEquals(210.40,account1.getQuantity());
    }

    @Test
    void depositAndWithdraw() {
        BankAccount account1 = new BankAccount("Sergio Moreno",325.00);
        account1.deposit(52.00);
        account1.withdraw(22.00);
        assertEquals(620,account1.getQuantity());
    }

    @Test
    void depositNegativeAmount() {
        BankAccount account1 = new BankAccount("Sergio Moreno",580.60);
        account1.deposit(-110.00);
        assertEquals(320.80,account1.getQuantity(),"Cannot deposit a negative amount of €");
    }

    @Test
    void withdrawNegativeAmount() {
        BankAccount account1 = new BankAccount("Sergio Moreno",245.00);
        account1.withdraw(-62.00);
        assertEquals(220.00,account1.getQuantity(),"Cannot withdraw a negative amount of €");
    }

    @Test
    void withdrawTooMuchMoney() {
        BankAccount account1 = new BankAccount("Sergio Moreno",860.00);
        account1.withdraw(2000.00);
        assertEquals(-111.00,account1.getQuantity(),"Cannot withdraw a bigger amount than your actual balance");
    }
}