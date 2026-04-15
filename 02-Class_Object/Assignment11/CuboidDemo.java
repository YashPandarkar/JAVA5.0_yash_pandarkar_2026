/*
                Exercise 11
				
-Create a class named Cuboid with three instance variables: length, width, and height, all of type double. 
-Create a method volume() that prints the volume of the cuboid, 
-Create another method displayDimensions() that prints the dimensions of the cuboid.

-In a separate class named CuboidDemo, write the main method. Within this method:
-Instantiate two objects of type Cuboid.
-Assign the following values to cuboid1: length = 10.0, width = 5.0, height = 2.0.
-Assign the following values to cuboid2: length = 6.0, width = 4.0, height = 3.0.
-Call the volume() and displayDimensions() methods on both cuboid1 and cuboid2.
- display the one with the largest volume.
				
*/
class Cuboid {
    double length;
    double width;
    double height;

    double volume(){
        return (length*width*height);
    }
    void displayDimensions(){
        System.out.println("length of Cubiod :"+length);
        System.out.println("width of Cubiod :"+width);
        System.out.println("height of Cubiod :"+height);
        System.out.println("volume of Cuboid :"+volume());
    }
}
public class CuboidDemo {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        c1.length = 10.00;
        c1.width = 5.00;
        c1.height = 2.00;
        c1.displayDimensions();
        System.out.println();

        Cuboid c2 = new Cuboid();
        c2.length = 6.00;
        c2.width = 4.00;
        c2.height = 3.00;
        c2.displayDimensions();

        if(c1.volume()>c2.volume()){
            System.out.println("Cuboid 1 has larger volume ");
        }else{
            System.out.println("Cuboid 2 has larger volume ");
        }
    }
}
