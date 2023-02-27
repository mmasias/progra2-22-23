public class BankAccount {

  private String titular;
  private double cantidad;

  public BankAccount(String titular, double cantidad) {
    this.titular = titular;
    this.cantidad = cantidad;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      cantidad += amount;
    }
  }

  public void withdraw(double amount) {
    if (cantidad - amount < 0) {
      cantidad = 0;
    } else {
      cantidad -= amount;
    }
  }
}
