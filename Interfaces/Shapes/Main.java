package Interfaces.Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.area();
        rectangle.perimeter();
        System.out.println("area of Rectangle " + rectangle.area() + " perimeter " + rectangle.perimeter());

        Square square = new Square(4, 4);
        square.area();
        square.perimeter();
        System.out.println(" area " + square.area() + " perimeter " + square.perimeter());
    }
}
