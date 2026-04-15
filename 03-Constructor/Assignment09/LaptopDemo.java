/*
	- Create a class Laptop with data members: brand, ramSize, and processor.
	- Define a parameterized constructor to initialize the values.
	- Define a method showSpecs() to display laptop specifications.

In the main method, 
	- create at least two Laptop objects with different values
	using the parameterized constructor and display their details.

*/

class Laptop{

    String brand;
    int ram;
    String processor;

    Laptop(String brand ,int ram ,String processor){

        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }
    void showSpecs(){

        System.out.println("Brand :" + brand);
        System.out.println("Ram :" + ram);
        System.out.println("Processor :" + processor);
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop("Apple", 8, "mac");
        Laptop l2 = new Laptop("Dell", 16, "i5");

        l1.showSpecs();
        l2.showSpecs();
    }
}
