/*
	- Create a class Circle which calculates area and circumference using constructor.
	- Input radius at runtime.

*/
import java.util.Scanner;
class Circle{
    double radius;
    double perimeter;
    double area;

    Circle(){
        this.radius = 0;
        this.perimeter = 0;
        this.area = 0;
    }
    Circle(double radius){
        this.radius = radius;
        this.perimeter = 0;
        this.area = 0;
    }
    double perimeter(){
        return (2*3.14*radius);
    }
    double area(){
        return (3.14*radius*radius);
    }
    void ShowDetails(){
        System.out.println("radius :"+radius);
        System.out.println("Perimeter :"+perimeter());
        System.out.println("area :"+area());
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the radius :");
        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);
        c1.ShowDetails();
    } 
}
