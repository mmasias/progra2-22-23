import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void depositTest() {
        BankAccount account = new BankAccount();
        account.setTitular("Edu");
        account.deposit(100.0);
        account.deposit(-50.0);

    }

    @Test
    void withdrawTest() {
        BankAccount account = new BankAccount();
        account.setTitular("Edu");
        account.setCantidad(200.0);
        account.withdraw(20.0);
        account.withdraw(300);
        account.withdraw(-10);

    }
}