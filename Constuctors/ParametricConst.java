package Constuctors;

public class ParametricConst {
    String name;
    int age;

    ParametricConst( String name , int age) {
            this.name = name;
            this.age = age;

        System.err.println("this is parametric constructor");
    }

    public static void main(String[] args) {
        ParametricConst student1 = new ParametricConst("ali", 12);
       
        System.out.println("Student name " + student1.name + " Student age " + student1.age);
    }
}
