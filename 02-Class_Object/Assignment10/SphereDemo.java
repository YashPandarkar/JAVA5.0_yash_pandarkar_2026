/*
                Exercise 10
				
- Create a class named Sphere with one instance variable: radius, of type double. 
- Create a method volume() that prints the volume of the sphere, 
- Create another method displayRadius() that prints the radius of the sphere.

-In a separate class named SphereDemo, write the main method. Within this method:
-Instantiate two objects of type Sphere.
-Assign the following value to sphere1: radius = 4.0.
-Assign the following value to sphere2: radius = 2.5.
-Call the volume() and displayRadius() methods on both sphere1 and sphere2.
- display the one with the largest volume.				
*/
class Sphere {
  double radius;

    double volume(){
        return ((4*3.14*radius*radius*radius)/3);
    }
    void displayRadius(){
        System.out.println("radius of Sphere :"+radius);
    }
}
public class SphereDemo {
    public static void main(String[] args) {
        
        Sphere c1 = new Sphere();
        c1.radius = 4.0;
        c1.displayRadius();
        System.out.println("volume of circle 1:"+c1.volume());
        System.out.println();

        Sphere c2 = new Sphere();
        c2.radius = 2.5;
        c2.displayRadius();
        System.out.println("volume of circle 2:"+c2.volume());
        System.out.println();

        if(c1.volume()>c2.volume()){
            System.out.println("circle 1 has largest volume ");
        }else{
            System.out.println("circle 2 has largest volume ");
        }
    } 
}
