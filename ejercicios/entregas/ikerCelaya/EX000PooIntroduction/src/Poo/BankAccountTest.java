package Poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    //Crear una cuenta bancaria con un titular y una cantidad inicial
    //Comprueba los datos añadidos a la cuenta bancaria creada
    @Test
    void createAccount() {
        BankAccount account1 = new BankAccount("Iker Celaya",800.50);
        assertNotNull(account1, "The initial amount must be greater than 0");
        assertEquals(800.50,account1.getAmount(),"The account´s amount is not set correctly");
    }

    //Crear una cuenta bancaria, ingresar una cantidad en la cuenta
    //Comprueba que se añade el depósito al balance total
    @Test
    void depositMoney() {
        BankAccount account1 = new BankAccount("Iker Celaya",220.20);
        account1.deposit(100.00);
        assertEquals(320.20,account1.getAmount());
    }

    //Crear una cuenta bancaria, ingresar y retirar una cantidad
    //Comprueba que el balance total sea correcto tras depositar y retirar dinero
    @Test
    void depositAndWithdraw() {
        BankAccount account1 = new BankAccount("Iker Celaya",525.00);
        account1.deposit(50.00);
        account1.withdraw(25.00);
        assertEquals(550,account1.getAmount());
    }

    //Extra

    //Crear una cuenta bancaria, ingresar una cantidad negativa
    //Este test va a dar error, no podemos depositar una cantidad negativa de dinero
    @Test
    void depositNegativeAmount() {
        BankAccount account1 = new BankAccount("Iker Celaya",720.80);
        account1.deposit(-100.00);
        assertEquals(620.80,account1.getAmount(),"Cannot deposit a negative amount of €");
    }

    //Crear una cuenta bancaria, retirar una cantidad negativa
    //Este test va a dar error, ya que estamos sacando una cantidad negativa
    @Test
    void withdrawNegativeAmount() {
        BankAccount account1 = new BankAccount("Iker Celaya",375.00);
        account1.withdraw(-75.00);
        assertEquals(300.00,account1.getAmount(),"Cannot withdraw a negative amount of €");
    }

    //Crear una cuenta bancaria, retirar una cantidad mayor a la que hay en la cuenta
    //Este test va a dar error, porque no podemos sacar más dinero del que tenemos en la cuenta
    @Test
    void withdrawTooMuchMoney() {
        BankAccount account1 = new BankAccount("Iker Celaya",900.00);
        account1.withdraw(1000.00);
        assertEquals(-100.00,account1.getAmount(),"Cannot withdraw a bigger amount than your actual balance");
    }
}