public class BankAccount {
        private String owner;
        private double amount;

        public BankAccount(String owner, double amount) {
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
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.amount = this.amount + amount;
            }
        }

        public void withdraw(double amount) {
            this.amount = this.amount - amount;
            if (this.amount < 0) {
                this.amount = 0;
            }
        }

}
