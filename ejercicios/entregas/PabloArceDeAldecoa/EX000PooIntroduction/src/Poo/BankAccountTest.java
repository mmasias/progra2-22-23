package Poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void test1(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setTitular("Pablo");
        bankAccount.setAmount(200);
    }

    @Test
    void test2() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(300);
    }
    @Test
    void test3(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(300);
        bankAccount.withdraw(150);
    }
    @Test
    void test4(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-100);
    }
    @Test
    void test5(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(-100);
    }
    @Test
    void test6(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-1000);
        System.out.println(bankAccount.getAmount());
    }
}