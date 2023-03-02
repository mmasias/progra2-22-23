public class BankAccount {
    private String holder;
    private Double amount;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BankAccount(String holder, Double amount) {
        this.holder = holder;
        this.amount = amount;
    }

    void deposit(double depositMoney){

        if(depositMoney>0){
            double newQuantity = getAmount() + depositMoney;
            setAmount(newQuantity);
        }
    }
    void withdraw(double withdrewMoney){
        if(getAmount() < withdrewMoney){
            setAmount((double) 0);
        }else {
            double newQuantity = getAmount() - withdrewMoney;
            setAmount(newQuantity);
        }
    }
}
