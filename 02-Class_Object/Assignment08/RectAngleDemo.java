/*
                Exercise 8
				
-CreateCreate a class named "Rectangle" with two instance variables: length and width, both of type double. 
-create a method perimeter() that prints the perimeter of the rectangle,
-Create another method displayDimensions(),that prints the dimensions of the rectangle.

-In a separate class named RectangleDemo, write the main method. Within this method:
-Instantiate two objects of type Rectangle.
-Assign the following values to rect1: length = 12.0, width = 8.0.
-Assign the following values to rect2: length = 5.0, width = 3.0.
-Call the perimeter() and displayDimensions() methods on both rect1 and rect2.
- display the one with the largest Parimeter.				
*/
class RectAngle {

    double length;
    double width;

    double perimeter(){
        return (2*(length+width));
    }
    void displayDimensions(){
        System.out.println("length of rectangle :"+length);
        System.out.println("width of rectangle :"+width);
        System.out.println("perimeter of rectangle :"+perimeter());
    }
}
public class RectAngleDemo {
    public static void main(String[] args) {
        RectAngle r1 = new RectAngle();
        r1.length = 12.00;
        r1.width = 8.00;
        System.out.println("dimensions of rectangle 1 :");
        r1.displayDimensions();
        System.out.println();

       RectAngle r2 = new RectAngle();
       r2.length = 5.00;
       r2.width = 3.00;
       System.out.println("dimensions of rectangle 2 :");
       r2.displayDimensions();

       if(r1.perimeter()>r2.perimeter()){
        System.out.println("Rectangle 1 has greter area ");
       }else{
        System.out.println("Rectangle 2 has greter area ");
       }
    }
}
