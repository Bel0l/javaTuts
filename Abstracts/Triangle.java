package Abstracts;

public class Triangle extends Shape {
    
    double length, height;

    Triangle (double length, double height){
        this.length=length;
        this.height=height;
    }

     double area (){
        return length * height;
        
    }
}
