package accessors.Task1;

public class ATM {
    private double totalAmount;
    // private double noAmount;
    private String bankName;
    
    private void setAmount (double TotalAmount){
        totalAmount = TotalAmount ;
    }

    private double getAmount (){
        return totalAmount;
    }

    // protected void setNoAmount (double NoAmount){
    //     if (noAmount < 100);
    // }
    protected void setBank (String BankName){
        bankName = BankName;
    }

    protected String getBankName () {
        return bankName;
    }

    public static void main(String[] args) {
        
        ATM bank = new ATM();
        bank.bankName="HBL";
        bank.totalAmount=505050505;

        System.out.println("Branch: " + bank.getBankName() + " Amount: " + bank.getAmount()  );

    }

}

