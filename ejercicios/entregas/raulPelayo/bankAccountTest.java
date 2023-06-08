
import static org.junit.jupiter.api.Assertions.*;

class bankAccountTest {
BankAccount b,c,d;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        b = new BankAccount("Raúl", 10000);
        c = new BankAccount("Pedro", 10000);
        d = new BankAccount("David", 10000);

        c.deposit(5000);
        d.deposit(3000);
        d.withdraw(1000);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getAccountHolder() {
    }

    @org.junit.jupiter.api.Test
    void setAccountHolder() {
    }

    @org.junit.jupiter.api.Test
    void getAccount() {
    }

    @org.junit.jupiter.api.Test
    void setAccount() {
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        assertEquals(10000,b.getAccount());
        assertEquals(15000,c.getAccount());
        assertEquals(12000,d.getAccount());
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        d.withdraw(100000000);
        assertEquals(0,d.getAccount());
    }
}
