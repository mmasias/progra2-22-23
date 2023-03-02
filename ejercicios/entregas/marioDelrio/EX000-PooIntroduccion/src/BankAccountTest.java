import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void newAccountTest(){
        BankAccount Account1 = new BankAccount("Mario",500.0);
    }
    @Test
    public void depositTest(){
        BankAccount Account2 = new BankAccount("Mario", 500.0);
        Account2.deposit(200);
    }

    @Test
    public void depositAndWithdrawTest(){
        BankAccount Account3 = new BankAccount("Mario", 500.0);
        Account3.deposit(200);
        Account3.withdraw(170);
    }

    @Test
    public void depositNegativeTest(){
        BankAccount Account2 = new BankAccount("Mario", 500.0);
        Account2.deposit(-200);
    }

    @Test
    public void withdrawNegativeTest(){
        BankAccount Account3 = new BankAccount("Mario", 500.0);
        Account3.withdraw(-170);
    }

    public void withdrawExcessTest(){
        BankAccount Account3 = new BankAccount("Mario", 500.0);
        Account3.withdraw(570);
    }
}