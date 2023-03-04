
public class BankAccount {

    private String titular;
    private double amount;


    public BankAccount() {


    }

    public void deposit(double amount){


        if (amount>0) {this.amount = this.amount + amount;
            System.out.println("Se han ingresado "+amount+"€ a la cuenta de "+titular+"\n");
        } else {
            System.out.println("La cantidad que esta intentando ingresar es negativa, no puedes ingresar una cantidad negativa \n");
        }

    }

    public void withdraw(double amount){

        if (this.amount >= amount && amount > 0 ) {

            this.amount = this.amount - amount;
            System.out.println("Se han retirado " + amount + "€ desde la cuenta de "+titular+"\n");

        } else if (amount < 0) {

            System.out.println("La cantidad que ha intentado ingresar ("+amount+"€) es negativa, no es posible el retiro de dinero");

        } else {
            this.amount = 0;
            System.out.println("Se han intentado retirar "+amount+"€ su saldo pasa a ser de "+this.amount+"€\n");
        }
    }





    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return amount;
    }

    public void setCantidad(double cantidad) {
        this.amount = cantidad;
    }
}
