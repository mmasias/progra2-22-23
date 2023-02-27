import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankAccountTest {
    @Test
    public void creationTest(){
        BankAccount myAccount1 = new BankAccount("Diego", 1000);
    }
    @Test
    public void depositTest(){
        BankAccount myAccount2 = new BankAccount("Diego", 1000);
        myAccount2.deposit(100);
    }
    @Test
    public void depositWithdrawTest(){
        BankAccount myAccount3 = new BankAccount("Diego", 1000);
        myAccount3.deposit(500);
        myAccount3.withdraw(600);
    }
    @Test
    public void creationNegativeTest(){
        BankAccount myAccount4 = new BankAccount("Diego", 1000);
        myAccount4.deposit(-900);
    }
    @Test
    public void withdrawNegativeTest(){
        BankAccount myAccount2 = new BankAccount("Diego", 1000);
        myAccount2.withdraw(-500);
    }
    @Test
    public void overWithdrawTest(){
        BankAccount myAccount2 = new BankAccount("Diego", 1000);
        myAccount2.withdraw(1500);
    }
}