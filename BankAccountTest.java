import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount c1= new BankAccount("Rubén",650.13);
    BankAccount c2= new BankAccount("Manolo");
BankAccount c3= new BankAccount("Elder",341.15);
    BankAccount c4= new BankAccount("Saturnino",23.43);
    BankAccount c5= new BankAccount("Maria",150);
    BankAccount c6= new BankAccount("Jimena", 37);


    @org.junit.jupiter.api.Test
    void deposit() {
        c2.deposit(100);
        double expectedC2=100;
        assertEquals (expectedC2,c2.getAmount());

        c4.deposit(-10);
        double expectedC4=23.43;
        assertEquals(expectedC4,c4.getAmount());


    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        c3.withdraw(100.15);
        double expectedC3 =241;
        assertEquals(expectedC3,c3.getAmount());

        c5.withdraw(-100);
        double expectedC5=50;
        assertEquals(expectedC5,c5.getAmount());

        c6.withdraw(50);
        double expectedC6=0;
        assertEquals(expectedC6,c6.getAmount());
    }
}