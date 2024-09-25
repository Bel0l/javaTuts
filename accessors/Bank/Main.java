package accessors.Bank;

public class Main {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(90);
        
    
        System.out.println("Account Balance: " + account.getBalance());

        BankAccount account2 = new BankAccount(-50);

        System.out.println(" " + account2.getBalance());
    }

    
}
