package Interfaces;

 interface Animal {
    public void walk ();
}

class Horse implements Animal {
    public void walk (){
        System.out.println("Horse walks on 4 legss");
    }
}

class Fly implements Animal {
    public void walk (){
        System.out.println("Fly walks on 8 legs");
    }
    public void bird (){
        System.out.println("fly flies");
    }
} 

class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        Fly fly = new Fly();
        fly.bird();
        fly.walk();

    }
}