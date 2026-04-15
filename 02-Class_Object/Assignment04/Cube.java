/*
              Exercise 4

Create a class "Cube" in which declare variable 'N'.  
Create an object of class "Cube" which displays the sum of cube of N digits.			  

*/
class Cube {
    
    int n = 134;
    void display(int n){
        int sum = 0;
        int digit;

        while(n!=0){
            digit = n % 10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }
        System.out.println("sum is :"+sum);
    }
    public static void main(String[] args) {
        
        Cube c = new Cube();
        c.n = 3442;
        c.display(c.n); 
    }
}
