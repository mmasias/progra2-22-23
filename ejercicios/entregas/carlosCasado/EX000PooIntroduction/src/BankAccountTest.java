import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
     void firstTest(){

        // # Crear una cuenta bancaria con un titular y una cantidad inicial. #

        BankAccount bankAccount = new BankAccount("Carlos", 2000);

        assertEquals("Carlos", bankAccount.getAccountHolder());
        assertEquals(2000, bankAccount.getAmount());

        System.out.println("Holder: " + bankAccount.getAccountHolder());
        System.out.println("Amount: " + bankAccount.getAmount());

    }
    @Test
    void secondTest(){

        // # Crear una cuenta bancaria, ingresar una cantidad en la cuenta. #

        BankAccount bankAccount = new BankAccount("Carlos", 2000);

        bankAccount.deposit(2000);

        assertEquals(4000, bankAccount.getAmount());
        System.out.println("Amount: " + bankAccount.getAmount());

    }

    @Test
    void thirdTest(){

        // # Crear una cuenta bancaria, ingresar y retirar una cantidad. #

        BankAccount bankAccount = new BankAccount("Carlos", 2000);

        bankAccount.deposit(2000);

        assertEquals(4000, bankAccount.getAmount()); //verifica que se adentró la cantidad.

        bankAccount.withdraw(1050);

        assertEquals(2950, bankAccount.getAmount());

        System.out.println("Amount: " + bankAccount.getAmount());

    }

    @Test
    void fourthTest(){

        // # Crear una cuenta bancaria, ingresar una cantidad negativa. #

        BankAccount bankAccount = new BankAccount("Carlos", 2000);

        bankAccount.deposit(-2000);
        System.out.println("Amount: " + bankAccount.getAmount());

    }
    @Test
    void fifthTest(){

        // # Crear una cuenta bancaria, retirar una cantidad negativa. #

        BankAccount bankAccount = new BankAccount("Carlos", 2000);

        bankAccount.withdraw(-2000); //debido a que no se puede retirar valores negativos, matendra el mismo valor de la cuenta

        assertEquals(2000, bankAccount.getAmount());

        System.out.println("Amount: " + bankAccount.getAmount());

        // COMPROBACIÓN DE RESTA CORRECTA

        bankAccount.withdraw(2000);
        assertEquals(0, bankAccount.getAmount());
        System.out.println("Amount: " + bankAccount.getAmount());

    }

    @Test
    void sixteenthTest(){

        // # Crear una cuenta bancaria, retirar una cantidad mayor a la que hay en la cuenta. #

        BankAccount bankAccount = new BankAccount("Carlos", 2000);

        bankAccount.withdraw(3000); //se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
        assertEquals(0, bankAccount.getAmount());
        System.out.println("Amount: " + bankAccount.getAmount());

    }


}
