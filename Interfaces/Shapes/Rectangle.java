package Interfaces.Shapes;

public class Rectangle implements Shape {
    double length, height;

    Rectangle(double length, double height){
        this.length=length;
        this.height=height;
    }

    public double area (){
        return length*height ;

        
    }

    public double perimeter (){
        return height;
    }
}
