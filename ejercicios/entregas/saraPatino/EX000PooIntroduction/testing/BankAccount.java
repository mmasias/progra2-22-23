package testing;

public class BankAccount{
  private String owner;
  private double amount;

  public BankAccount(String owner, double amount){
    this.owner = owner;
    this.amount = amount;
  }
  
  public String getOwner() {
    return this.owner;
  }
  public void setOwner(String owner) {
      this.owner = owner;
  }
  public double getAmount() {
      return this.amount;
  }
  public void setAmount(double amount) {
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