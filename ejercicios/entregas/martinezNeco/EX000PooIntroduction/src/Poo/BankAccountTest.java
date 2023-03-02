import org.junit.jupiter.api.Test;

public class BankAccountTest {

    //Tests Principales
    @Test
    public void newAccountTest(){
        BankAccount testAccount = new BankAccount("Jessica", 6000);
    }

    @Test
    public void depositTest(){
        BankAccount testAccount = new BankAccount("Perroviejo", 2000);
        testAccount.deposit(200);
    }
    @Test
    public void depositWithdrawTest(){
        BankAccount testAccount = new BankAccount("Ceciarmy", 7000);
        testAccount.deposit(3000);
        testAccount.withdraw(8000);
    }


    //Test Extra
    @Test
    public void depositNegativeTest(){
        BankAccount testAccount = new BankAccount("Pirris", 1000);
        testAccount.deposit(-1500);
    }

    @Test
    public void withdrawTest(){
        BankAccount testAccount = new BankAccount("Kheis", 4000);
        testAccount.withdraw(-3000);
    }

    @Test
    public void withdrawExcessTest(){
        BankAccount testAccount = new BankAccount("Zane", 9000);
        testAccount.withdraw(12000);
    }

}