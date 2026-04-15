/*

   - Create a class "CallByeValue" 
   - in main() method initialise a variable x to 10 and 
   - call the method changeValue() to change the value of x to 20
   - print the value of x 

    - After this declare ChangeValue() as static  and repeat the above steps 




*/
class CallByeValue{

    static void changeValue(int x){

        x = 20;
       System.out.println("value of x in changeValue() method :" + x);
    }

}
public class Main {
    
    public static void main(String[] args) {
        
        int x = 10;
        System.out.println("value of x before calling changeValue() method :" + x);

        CallByeValue c = new CallByeValue();
        c.changeValue(x);

        System.out.println("value of x after calling changeValue() method :" + x);
        
    }
}
