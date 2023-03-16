import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    //Tests
    @Test
    public void newAccountTest(){
        BankAccount testAccount = new BankAccount("Jose", 5000);
    }

    @Test
    public void depositTest(){
        BankAccount testAccount = new BankAccount("Jose", 5000);
        testAccount.deposit(1500);
    }
    @Test
    public void depositWithdrawTest(){
        BankAccount testAccount = new BankAccount("Jose", 5000);
        testAccount.deposit(3000);
        testAccount.withdraw(8000);
    }


    //Extra
    @Test
    public void depositNegativeTest(){
        BankAccount testAccount = new BankAccount("Jose", 5000);
        testAccount.deposit(-1500);
    }

    @Test
    public void withdrawTest(){
        BankAccount testAccount = new BankAccount("Jose", 5000);
        testAccount.withdraw(-600);
    }

    @Test
    public void withdrawExcessTest(){
        BankAccount testAccount = new BankAccount("Jose", 5000);
        testAccount.withdraw(25000);
    }

}
