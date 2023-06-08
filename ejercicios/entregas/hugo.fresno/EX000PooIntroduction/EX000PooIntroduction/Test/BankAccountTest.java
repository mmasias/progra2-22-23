import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    @Test
    void depositMethod() {
        BankAccount banco = new BankAccount("Juan");
        banco.setAmount(100);
        banco.deposit(200);
        banco.withdraw(50);
    }

    @Test
    void withDrawMethod() {
        BankAccount banco = new BankAccount("Juan");
        banco.setAmount(100);
        banco.withdraw(50);
        banco.deposit(-10);
        banco.withdraw(-10);
        banco.withdraw(100);
    }
}