import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
BankAccount g,f,k;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        g=new BankAccount("David",8800);
        f=new BankAccount("Belén",3200);
        k=new BankAccount("Alicia",12800);
        f.deposit(790);
        k.deposit(9000);
        k.whithdraw(8000);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getHolder() {
    }

    @org.junit.jupiter.api.Test
    void setHolder() {
    }

    @org.junit.jupiter.api.Test
    void getAmount() {
    }

    @org.junit.jupiter.api.Test
    void setAmount() {
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        assertEquals(8800,g.getAmount());
    }

    @org.junit.jupiter.api.Test
    void whithdraw() {
        k.whithdraw(1000000);
        assertEquals(0,k.getAmount());
    }
}