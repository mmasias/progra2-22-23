package Poo;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
class BankAccountTest {

    /*Crear una cuenta bancaria con un titular y una cantidad inicial*/
    @Test
    void testCreteBankAccount(){
        BankAccount bankAccount = new Poo.BankAccount("Rene", 100);

        Assert.assertEquals("Rene", bankAccount.getHeadline());
        Assert.assertEquals(100, bankAccount.getAmount(),0);
    }

    /*Crear una cuenta bancaria, ingresar una cantidad en la cuenta*/
    @Test
    void testCreateBankAccountAmountTheAccount(){
        BankAccount bankAccount = new Poo.BankAccount("Rene", 100);

        bankAccount.Deposit(50);
        Assert.assertEquals(150, bankAccount.getAmount(),0);
    }

    /*Crear una cuenta bancaria, ingresar y retirar una cantidad*/
    @Test
    void testCreateBankAccountDepositAndWithdraw(){
        BankAccount bankAccount = new Poo.BankAccount("Rene", 100);
        bankAccount.Deposit(50);
        bankAccount.Withdraw(90);

        Assert.assertEquals(60, bankAccount.getAmount(),0);
    }


    /*-------------EXTRA TESTS-------------*/

    /*Crear una cuenta bancaria, ingresar una cantidad negativa*/
    @Test
    void testBankAccountNegativeDeposit(){
        BankAccount bankAccount = new Poo.BankAccount("Rene", 100);
        bankAccount.Deposit(-60);

        Assert.assertEquals(100, bankAccount.getAmount(),0);
    }

    /*Crear una cuenta bancaria, retirar una cantidad negativa.*/
    @Test
    void testBankAccountNegativeWithdraw(){
        BankAccount bankAccount = new Poo.BankAccount("Rene", 100);
        bankAccount.Withdraw(-50);

        Assert.assertEquals(100, bankAccount.getAmount(),0);
    }

    /*Crear una cuenta bancaria, retirar una cantidad mayor a la que hay en la cuenta.*/
    @Test
    void testBankAccountWithdrawLargeAmount(){
        BankAccount bankAccount = new Poo.BankAccount("Rene", 10);
        bankAccount.Withdraw(60);

        Assert.assertEquals(10, bankAccount.getAmount(),0);
    }

}