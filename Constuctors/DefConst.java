package Constuctors;

public class DefConst {
    String name;
    int age;

    DefConst( ) {

        System.err.println("this is default constructor");
    }

    public static void main(String[] args) {
        DefConst student1 = new DefConst();
        student1.name = "ali";
        student1.age = 12;
        System.out.println("Student name " + student1.name + " Student age " + student1.age);
    }
}
