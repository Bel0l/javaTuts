package Classes;
public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 0;

    void changeCadence ( int newValue) {
        cadence = newValue;
    }

    void changeGear ( int newValue) {
        gear = newValue;
    }

    void changeSpeed ( int newValue) {
        speed = newValue;
    }
    
    void speedUp ( int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates () {
        System.out.println( "cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}

    class BicycleDemo {
        public static void main(String[] args){

            // creating two different bicycle objects

            Bicycle bike1 = new Bicycle();
            Bicycle bike2 = new Bicycle();

            // invoking methods on these objects

            bike1.changeCadence(50);
            bike1.changeGear(2);
            bike1.speedUp(10);
            bike1.applyBrakes(2);
            bike1.printStates();

            bike2.changeCadence(30);
            bike2.changeGear(1);
            
            bike2.speedUp(10);
            
            bike2.changeSpeed(5);
            bike2.printStates();
        }
    }
