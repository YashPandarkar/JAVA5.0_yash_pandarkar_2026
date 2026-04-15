/*
                Exercise 9
				
-Create a class named Circle with one instance variable: radius, of type double. 
-Create a method area() that prints the area of the circle, 
-Create another method displayRadius(),that prints the radius of the circle.

-In a separate class named CircleDemo, write the main method. Within this method:
-Instantiate two objects of type Circle.
-Assign the following value to circle1: radius = 7.0.
-Assign the following value to circle2: radius = 3.5.
-Call the area() and displayRadius() methods on both circle1 and circle2.
- display the one with the largest area.
				
*/
class Circle {
    double radius;

    double area(){
        return (3.14*radius*radius);
    }
    void displayRadius(){
        System.out.println("radius of Circle :"+radius);
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.radius = 7.0;
        c1.displayRadius();
        System.out.println("area of 1 circle :"+c1.area());
        System.out.println();

        Circle c2 = new Circle();
        c2.radius = 3.5;
        c2.displayRadius();
        System.out.println("area of 2 circle :"+c2.area());
        System.out.println();

        if(c1.area()>c2.area()){
            System.out.println("circle 1 has largest area ");
        }else{
            System.out.println("circle 2 has largest area ");
        }
    } 
}
