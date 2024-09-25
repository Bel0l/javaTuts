package accessors.Bank;

public class Data {
    
    String name ;
    private int cnic ;
    private double accountNum;

     Data (String name, int cnic , double accountNum){
        this.name= name;
        this.cnic=cnic;
        this.accountNum=accountNum;
     }

     public int getCnic() {
        return cnic;
     }
     public double getAccountNum(){
        return accountNum;
     }
}
