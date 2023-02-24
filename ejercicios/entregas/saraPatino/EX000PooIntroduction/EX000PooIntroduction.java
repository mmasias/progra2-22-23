public class BankAccount{
  
  private String owner; 
  private double amount;

  public BankAccount(String owner, double amount){
    this.owner = owner;
    this.amount = amount;
  }

  public deposit(double amount){
    if(amount > 0){
      this.amount += amount;
    } else {
      System.out.println("You can't deposit an amount below zero");
    }
  }

  public withdraw(double amount){
    if(this.amount - amount <0){
      this.amount = 0;
    } else {
      this.amount -= amount;
    }
  }

}

public class BankAccountTest {
    BankAccount account1 = new BankAccount("Sara", 1000);
    account1.deposit(-100);
    System.out.println(account1.amount);

    BankAccount account2 = new BankAccount("Aisha", 200);
    account2.withdraw(100);
    System.out.println(account2.amount);

    BankAccount account3 = new BankAccount("Sebastian", 500);
    account3.withdraw(1000);
    System.out.println(account3.amount);
}