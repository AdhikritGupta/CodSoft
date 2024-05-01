public class Account {
    private double balance;
    public Account(){
        this(0.0);
    }
    public Account(double amount){
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
