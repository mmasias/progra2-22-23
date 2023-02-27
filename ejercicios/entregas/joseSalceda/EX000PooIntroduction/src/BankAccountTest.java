import org.junit.jupiter.api.Test;

public class BankAccountTest {

    //Tests Principales
    @Test
    public void newAccountTest(){
        BankAccount testAccount = new BankAccount("Menchu", 3000);
    }

    @Test
    public void depositTest(){
        BankAccount testAccount = new BankAccount("Ramoncin", 3000);
        testAccount.deposit(100);
    }
    @Test
    public void depositWithdrawTest(){
        BankAccount testAccount = new BankAccount("Joselito", 5000);
        testAccount.deposit(4000);
        testAccount.withdraw(9000);
    }


    //Test Extra
    @Test
    public void depositNegativeTest(){
        BankAccount testAccount = new BankAccount("Juanfran", 4000);
        testAccount.deposit(-3500);
    }

    @Test
    public void withdrawTest(){
        BankAccount testAccount = new BankAccount("Guille", 7000);
        testAccount.withdraw(-6000);
    }

    @Test
    public void withdrawExcessTest(){
        BankAccount testAccount = new BankAccount("Rosalinda", 3000);
        testAccount.withdraw(25000);
    }

}