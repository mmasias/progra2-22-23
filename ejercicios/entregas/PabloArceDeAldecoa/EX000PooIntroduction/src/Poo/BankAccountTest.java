package Poo;
class BankAccountTest{
    void test1(){
        BankAccount bankAccount = new BankAccount();
        assertEquals("Pablo", bankAccount.setTitular());
        assertEquals(200, bankAccount.setAmount());
    }
    void test2(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(300);
    }
    void test3(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(300);
        bankAccount.withdraw(150);
    }
    void test4(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-100);
    }
    void test5(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(-100);
    }
    void test6(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-1000);
    }
}