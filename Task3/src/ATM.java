public class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }
    
    public void withdraw(double amount){
        if(amount>account.getBalance()){
            System.out.println("Insuufficient Balance");
        }else{
            double balance = account.getBalance()-amount;
            System.out.println("Amount withdrawn: "+amount);
            System.out.println("Current balance: "+balance);
            account.setBalance(balance);
        }
    }

    public void deposit(double amount){
        double balance = account.getBalance()+amount;
        System.out.println("Deposited amount: "+amount);
        System.out.println("Current balance: "+balance);
        account.setBalance(balance);
    }

    public double getBalance(){
        return account.getBalance();
    }
}
