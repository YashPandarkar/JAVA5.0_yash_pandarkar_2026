/*

			Static Initialization Order Problem

Problem:
	- Create a class with:
	- Static variable a initialized to 10.
	- Static block that prints a and then changes it to 20.
	- Another static block that prints a.
	- A static method that prints a.
	- Call the static method and observe the order of outputs.

*/class Initialization{

    static int a = 10;

    static{
        System.out.println("Static Block 1 : a = " + a);
        a = 20;
    }
    static{
        System.out.println("Static Block 2 : a = " + a);
    }
    static void print(){
        System.out.println("Static Method : a = " + a);
    }

}
public class InitializationOrder {
    public static void main(String[] args) {
        
        Initialization.print();
    }
}
