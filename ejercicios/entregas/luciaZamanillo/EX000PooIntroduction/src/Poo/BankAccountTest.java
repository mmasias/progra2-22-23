package Poo;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTest {

    @Test
    public void createAccount() {
        BankAccount accountOne = new BankAccount("Jorge", 2365.5);
        assertEquals("Jorge", accountOne.getTitular());
    }

    @Test
    public void doDeposit() {
        BankAccount accountTwo = new BankAccount("Mary", 127.13);
        accountTwo.deposit(20.5);
        assertEquals(147.63, accountTwo.getAmountAccount());
    }

    @Test
    public void doWithdraw() {
        BankAccount accountThree = new BankAccount("Sam", 315.85);
        accountThree.withdraw(100.05);
        assertEquals(215.8, accountThree.getAmountAccount());
    }

    // extra tests
    @Test
    public void depositNegativeAmount() {
        BankAccount accountFour = new BankAccount("Elsa", 58.96);
        accountFour.deposit(-75.2);
        assertEquals(58.96, accountFour.getAmountAccount());
    }

    @Test
    public void withdrawNegativeAmount() {
        BankAccount accountFive = new BankAccount("Luigi", 100.03);
        accountFive.withdraw(-32);
        assertEquals(100.03, accountFive.getAmountAccount());
    }

    @Test
    public void withdrawHigherAmount() {
        BankAccount accountSix = new BankAccount("Luca", 87.65);
        accountSix.withdraw(225);
        assertEquals(0, accountSix.getAmountAccount());
    }

}
