public class BankAccount{
 
    //Atributos
    private String headline; //titular
    private double amount; //cantidad

    //Constructores
    public BankAccount(String headline){
        this(headline, 0);
    }

    public BankAccount(String headline, double amount){
        this.headline = headline;

        if(amount <0){
            this.amount = 0;
        }else{
            this.amount = amount;
        }
    }

    //Metodos
    public String getHeadline() {
        return headline;
    }

    public double getAmount() {
        return amount;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Ingresa dinero en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param amount
     */
    public void deposit(double amount) {
        if(amount > 0){
            this.amount += amount;   
        }
    }

     /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (this.amount - amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    } 
    
    /**
     * Devuelve el estado del objeto
     * 
     * @return
     */
    @Override
    public String toString() {
        return "El titular " + headline + " tiene " + amount + " euros en la cuenta";
    }

    
    
}