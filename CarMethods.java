public class CarMethods { 

    String make ;
    String model ; 
    int year = 0;

    void available() {
        System.out.println("make:" + make +" model:" + model + " year:" + year + " This Car is Available" );
    }

    void notAvailable() {
        System.out.println("make:" + make +" model:" + model + " year:" + year + " This Car is Available");
    }

    
}
class carInfo {
    public static void main (String[] args) {

        CarMethods car1 = new CarMethods();
        CarMethods car2 = new CarMethods();

        car1.make=("Toyota");
        car1.model=("Mark X");
        car1.year=2024;
        car1.notAvailable();

        car2.make=("Lexus");
        car2.model=("L30");
        car2.year=2020;
        car2.available();
    
    }

}

// constructor def
// parametric constructor with attributes initialization