public class BankAccount {

    private String titular;
    private double cantidad;

    // Constructor
    public BankAccount(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos get y set
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

    // Método para depositar dinero
    public void deposit(double amount) {
        if (amount > 0) {
            this.cantidad += amount;
        }
    }

    // Método para retirar dinero
    public void withdraw(double amount) {
        if (amount > 0 && this.cantidad - amount >= 0) {
            this.cantidad -= amount;
        } else {
            this.cantidad = 0;
        }
    }
}
