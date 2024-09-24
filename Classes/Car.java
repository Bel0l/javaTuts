package Classes;
public class Car {

    String make ;
    String model = "";
    int year = 0;
    String Color = "";

    void printCarInfo() {
        System.out.println( "make:" + make + " model:" + model + " year:" + year );
    }

}

class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.make="Toyota";
        car1.make="Civic";
        car1.year=2024;

        car2.make="Lexus";
        car2.model="L50";
        car2.year=2020;

        car1.printCarInfo();
        car2.printCarInfo();

    }
}