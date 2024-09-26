package Abstracts;

public class Main {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(8, 8);
        triangle.area();
        triangle.displayShape("triangle");

        System.out.println("area of triangle " + triangle.area());

        Rectangle rectangle = new Rectangle(4, 4);

        rectangle.displayShape("Rectangle");
        rectangle.area();
        System.out.println("area of rectangle " + rectangle.area());
        
    }
    
}
