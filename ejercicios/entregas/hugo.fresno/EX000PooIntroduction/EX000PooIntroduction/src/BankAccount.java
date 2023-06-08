public class BankAccount {


    private String titular;
    private double amount;

    public BankAccount(String titular, double amount) {
        this.titular = titular;
        this.amount = amount;
    }

    public BankAccount(String titular) {
        this.titular = titular;
    }

    void deposit(double amount){

        if(amount<0){
            this.amount = this.amount;
            System.out.println("ERROR - No se puede ingresar una cantidad negativa el saldo actual es "+this.amount+"€");
        }else{
            this.amount= this.amount +amount;
            System.out.println("Se han ingresado "+amount+"€ el sueldo actual es "+this.amount+"€");

        }

    }

    void withdraw(double amount) {


        if (amount < 0) {
            System.out.println("ERROR - No se puede retirar una cantidad negativa, el saldo es " + this.amount + "€");
        } else {
            if ((this.amount - amount) < 0) {
                this.amount = 0;
                System.out.println("Se han retirado " + amount + "€ el sueldo actual es " + this.amount + "€");
            } else {
                this.amount = this.amount - amount;
                System.out.println("Se han retirado " + amount + "€ el sueldo actual es " + this.amount + "€");
            }


        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
