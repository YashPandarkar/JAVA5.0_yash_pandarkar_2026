/*
     	 
	- Create class "MathOperations1" with following member : 
        - Static counter: to track the no. of time a static method is called.
        - static int add(int a, int b):  sums two numbers and increments counter
		- int multiply(int a, int b): Returns the product of two numbers
		
	- Create another class "MathOperations2"	
	    - call add() twice and display counter 
		- Use an instance to call multiply() after the call add()
		- Display updated counter. 
		
*/
class MathOperations1{

    static int counter;

    static int add(int a ,int b){

        counter ++;
        return a+b;
    }
    int multiply(int a ,int b){

        return a*b;
    }
}
public class MathOperationsDemo {
    public static void main(String[] args) {
        
        MathOperations1 m1 = new MathOperations1();
        m1.add(10,20);
        m1.add(34,45);

        System.out.println("Counter :" + m1.counter);

        m1.multiply(10, 3);
        System.out.println("Counter :" + m1.counter);
    }
}
