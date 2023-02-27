import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void newAccountTest(){
        BankAccount testAccount = new BankAccount("user", 1000);
    }

    @Test
    public void depositTest(){
        BankAccount testAccount = new BankAccount("user", 1000);
        testAccount.deposit(100);
    }
    @Test
    public void depositWithdrawTest(){
        BankAccount testAccount = new BankAccount("user", 1000);
        testAccount.deposit(4000);
        testAccount.withdraw(9000);
    }
    @Test
    public void depositNegativeTest(){
        BankAccount testAccount = new BankAccount("user", 1000);
        testAccount.deposit(-3500);
    }

    @Test
    public void withdrawTest(){
        BankAccount testAccount = new BankAccount("user", 1000);
        testAccount.withdraw(-6000);
    }

    @Test
    public void withdrawExcessTest(){
        BankAccount testAccount = new BankAccount("user", 1000);
        testAccount.withdraw(25000);
    }

}