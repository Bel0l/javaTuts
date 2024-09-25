package accessors.Bank;

public class BankAccount {
    private double balance;

    public BankAccount (double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance () {
        if (balance < 0 ){
            System.out.print("Negative Balance");
        }
        return balance;
    } 
}
