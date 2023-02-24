public class EX000PooIntroduction {
    public static void main(String[] args) {
      BankAccountTest backAccountTest = new BankAccountTest();
    }
}

public class BankAccount{
  
  private String owner; 
  private double amount;

  public BankAccount(String owner, double amount){
    this.owner = owner;
    this.amount = amount;
  }

  public double deposit(double amount){
    if(amount > 0){
      this.amount += amount;
    } else {
      System.out.println("You can't deposit an amount below zero");
    }
    return this.amount;
  }

  public double withdraw(double amount){
    if(this.amount - amount <0){
      this.amount = 0;
    } else {
      this.amount -= amount;
    }
    return this.amount;
  }

}

public class BankAccountTest {
    BankAccount account1 = new BankAccount("Sara", 1000);

    double deposit = account1.deposit(-100);
    System.out.println(deposit);

    BankAccount account2 = new BankAccount("Aisha", 200);

    double withdraw = account2.withdraw(-100);
    System.out.println(withdraw);

    BankAccount account3 = new BankAccount("Sebastian", 500);

    double withdraw2 = account3.withdraw(1000);
    System.out.println(withdraw2);
}
