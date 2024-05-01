import java.util.*;

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(5000.0);
        ATM atm = new ATM(account);
        int option;
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("0. Exit");
        do {
            System.out.println("Select an option: ");
            option = sc.nextInt();
            if(option==1){
                System.out.println("Current balance: "+atm.getBalance());
            }else if (option==2) {
                System.out.println("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                atm.withdraw(amount);
            }else if (option==3) {
                System.out.println("Enter amount to deposit");
                double amount = sc.nextDouble();
                atm.deposit(amount);
            }
            System.out.println();
        } while (option!=0);
        sc.close();
    }
}
