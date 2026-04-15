/*
                 Exercise 2.

Create a class “Verification”, in which assign a value to an integer variable and check whether the value is greater than 100. 
Create an object of class “Example_1” which prints “The number num1 is greater than 100” if the number is greater than 100, and “The number num1 is less than 100” if the number is less than 100.  

*/
class Example_1 {

    void compare(int num){
        if(num>100){
        System.out.println("number is greter than 100 ");
        }else{
            System.out.println("number is less than 100 ");
        }
    }
}

public class Verification {
    
    public static void main(String[] args) {
         
        int num = 249;

        Example_1 e = new Example_1();
        e.compare(num);
    }
}
