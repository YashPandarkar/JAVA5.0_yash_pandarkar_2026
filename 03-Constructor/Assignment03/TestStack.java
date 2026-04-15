/*
      Stack
	  
	- Implement class "Stack". 
	- No of elements = 10. 
	- Methods:  
	       - Push(): to insert an element
		   - item(): to add an integer to stack
		   - Pop(): to remove an element.
 	- return the top integer. 
	- Ensure that stack will handle the overflow and underflow conditions with appropriate methods.
	
	
	- Write a class "TestStack" to demonstrate pushing and poping values from two stacks.
	
	
*/
class Stack {
    int top = 0;
    int[] arr = new int[10];

    void Push(int element){
        if(top == arr.length){
            System.out.println("Stack is overflow ");
        }else{
          
            arr[top++] = element;
            System.out.println("element is puished ");
        }
    }
    int Pop(){
        if(top == 0){
            System.out.println("Stack is underflow"); 
            return -1;
        }else{
            return arr[--top];
        }
    }
}
public class TestStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.Pop();
        s1.Push(11);
        s1.Push(12);
        System.out.println("Poped element :"+s1.Pop());
        s1.Push(20);
        s1.Push(01);
        System.out.println("Poped element :"+s1.Pop());
        System.out.println("Poped element :"+s1.Pop());
        s1.Push(03);
        s1.Push(02);
        s1.Push(04);
        s1.Push(03);
        s1.Push(34);
        System.out.println("Poped element :"+s1.Pop());
        
    }  
}
