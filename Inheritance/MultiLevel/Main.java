package Inheritance.MultiLevel;

public class Main {
    public static void main(String[] args) {
        
        ECar car1 = new ECar();
         
        car1.brandName = "Tesla";
        car1.maxSpeed = 230;
        car1.model = "Neon";
        car1.type = "Sedan";
        car1.batteries= 2;
        car1.distance= "200km";
        car1.main();
    }
}
