import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
     void bankAccountTests(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Carlos");
        bankAccount.setAmount(2000);

        System.out.println("Holder: " + bankAccount.getAccountHolder());
        System.out.println("Amount: " + bankAccount.getAmount());

        bankAccount.deposit(2000);
        System.out.println("Amount: " + bankAccount.getAmount());

    }
    @Test
    void secondTest(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Carlos");
        bankAccount.setAmount(2000);

        bankAccount.deposit(2000);
        System.out.println("Amount: " + bankAccount.getAmount());

    }

    @Test
    void thirdTest(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Carlos");
        bankAccount.setAmount(2000);

        bankAccount.deposit(2000);
        bankAccount.withdraw(1050);
        System.out.println("Amount: " + bankAccount.getAmount());

    }

    @Test
    void fourthTest(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Carlos");
        bankAccount.setAmount(2000);

        bankAccount.deposit(-2000);
        System.out.println("Amount: " + bankAccount.getAmount());

    }
    @Test
    void fifthTest(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Carlos");
        bankAccount.setAmount(2000);

        bankAccount.withdraw(-2000); //debido a que no se puede retirar valores negativos, matendra el mismo valor de la cuenta
        System.out.println("Amount: " + bankAccount.getAmount());

        // COMPROBACIÓN DE RESTA CORRECTA

        bankAccount.withdraw(2000);
        System.out.println("Amount: " + bankAccount.getAmount());

    }

    @Test
    void sixteenthTest(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Carlos");
        bankAccount.setAmount(2000);

        bankAccount.withdraw(3000); //se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
        System.out.println("Amount: " + bankAccount.getAmount());

    }


}
