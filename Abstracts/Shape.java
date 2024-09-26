package Abstracts;

abstract class Shape {
    abstract double area ();

    void displayShape( String shapeName){
        System.out.println( "Shape " + shapeName);
    }
}
