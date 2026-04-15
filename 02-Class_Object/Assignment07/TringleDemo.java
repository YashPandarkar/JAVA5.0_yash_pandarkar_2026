/*
             Exercise 7

Write a program in Java in which 

-Create a class named Triangle with three instance variables: side1, side2, and side3, all of type double. 
-Create a method area() that calculates and prints the area of the triangle using Heron's formula, 
-create method displaySides() that prints the lengths of the sides.

-In a separate class named TriangleDemo, 
-write the main method. Within this method:
-Instantiate two objects of type Triangle.
-Assign the following values to tri1: side1 = 6.0, side2 = 8.0, side3 = 10.0.
-Assign the following values to tri2: side1 = 3.0, side2 = 4.0, side3 = 5.0.
-Call the area() and displaySides() methods on both tri1 and tri2.
- display the one with the largest area.
*/
class Triangle {

    double side1;
    double side2;
    double side3;

    double area(double a,double b,double c){

         double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    void displaySides(){

        System.out.println("side1 :"+side1);
        System.out.println("side2 :"+side2);
        System.out.println("side3 :"+side3);
    }
}
public class TringleDemo {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.side1 = 6.0;
        t1.side2 = 8.0;
        t1.side3 = 10.0;

        Triangle t2 = new Triangle();
        t2.side1 = 3.0;
        t2.side2 = 4.0;
        t2.side3 = 5.0;

        if(t1.area(t1.side1,t1.side2,t1.side3)>t2.area(t2.side1,t2.side2,t2.side3)){
            System.out.println("t1 has greter area ");
            t1.displaySides();
        }else{
            System.out.println("t2 has greter area");
            t2.displaySides();
        }
    }
}
