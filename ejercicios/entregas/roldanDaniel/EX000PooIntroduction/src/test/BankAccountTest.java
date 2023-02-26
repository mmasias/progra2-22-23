package test;

import clases.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {


    public BankAccountTest(){ //Constructor

    }

    @Test
    void validateCreationAccountHolderAndBalance(){ //Test 1

        BankAccount account = new BankAccount("Daniel",10);

        assertEquals(account.getAccountHolder(),"Daniel");
        assertEquals(account.getBalance(),10);

    }

    @Test
    void validateDeposit(){ //Test 2

        BankAccount account=new BankAccount();
        account.deposit(95);
        assertEquals(account.getBalance(),95);

    }

    @Test
    void validateDepositAndWithdrawal(){ //Test 3

        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdrawal(50);
        assertEquals(account.getBalance(),50);

    }

    @Test
    void validateDepositWithNegativeAmount(){ //Test 4 Extra

        BankAccount account = new BankAccount();
        account.deposit(-10);
        assertEquals(account.getBalance(),0);
    }


    @Test
    void validateWithdrawalWithNegativeAmountForUser(){ //Test 5 Extra

        BankAccount account= new BankAccount("Daniel",100);
        account.withdrawal(-10);
        assertEquals(account.getBalance(),100);

    }

    @Test
    void validateWithdrawalWithNegativeBalance(){ //Test 6 Extra

        BankAccount account= new BankAccount("Daniel",100);
        account.withdrawal(4324);
        assertEquals(account.getBalance(),100);

    }
}
