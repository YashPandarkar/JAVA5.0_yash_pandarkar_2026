/*
           Exercise 6
		 
Design a Java program to demonstrate how to define class with properties,
and compute the values with those properties. 

-Create a class "BOX" which has 3 variables of type double : 
    -Width
    -Height
    -depth

 In a seperate class named "BoxDemo" write main() method, 
 in this method: 
   
   -Create an object of type BOX. 
   -Assign following values to that instance variable of BOX object 
        -Width = 10.00,
        -Height = 20.00,
        -depth = 50.00.
    -Compute and display the volume of the box.
	
-Further more: 	
-Create two different objects box1 and box2 of type BOX, 
-Assign different values to instance variables and calculate volume of box for these two different objects.	
*/
class Box {

    double width;
    double height;
    double depth;

    double volume(double w,double h,double d){

        return(w*h*d);
    }
}

public class BoxDemo {
    
    public static void main(String[] args) {
        
        Box b = new Box();
        b.width = 10.00;
        b.height = 20.00;
        b.depth = 50.00;

        System.out.println("volume of cube is :"+b.volume(b.width,b.height,b.depth));

        Box box1 = new Box();
        box1.width = 38.00;
        box1.height = 32.00;
        box1.depth = 67.00;

        System.out.println("volume of cube is :"+box1.volume(box1.width,box1.height,box1.depth));

        Box box2 = new Box();
        box2.width = 68.00;
        box2.height = 36.00;
        box2.depth = 19.00;

        System.out.println("volume of cube is :"+box2.volume(box2.width,box2.height,box2.depth));
    }
}
