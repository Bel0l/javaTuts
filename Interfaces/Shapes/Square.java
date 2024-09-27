package Interfaces.Shapes;

public class Square implements Shape{
    private double length, height;

    Square (double height, double length){
        this.height=height;
        this.length=length;
    }
    public double area (){
        return length*height;

    }
    public double perimeter(){
        return length;
    }
}
