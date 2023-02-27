public class BankAccount {
  private String holder;
  private double amount;

  public BankAccount(String holder, double amount) {
      this.holder = holder;
      this.amount = amount;
  }

  public String getHolder() {
      return holder;
  }

  public void setHolder(String holder) {
      this.holder = holder;
  }

  public double getAmount() {
      return amount;
  }

  public void setAmount(double amount) {
      this.amount = amount;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          this.amount += amount;
      }
  }

  public void withdraw(double amount) {
      if (this.amount - amount < 0) {
          this.amount = 0;
      } else {
          this.amount -= amount;
      }
  }
}
