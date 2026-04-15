/*     
           Exercise 1.

-Create a class “Multiplication”, in which declare an integer variable num1, inside main() method assign num1 to 100. 
-Create an object of class “Example_1” which display the number num1 and Display it after multiplying it by 2. 

*/
class Example_1 {
   
    void display(int num){

        System.out.println("num1 :"+num);
        System.out.println("After multiply by 2 :"+num*2);
    }
}
public class Multiplication {
    int num1;
    public static void main(String[] args) {
        
        Multiplication m = new Multiplication();
        m.num1 = 100;

        Example_1 e = new Example_1();
        e.display(m.num1);
    }
}