//1. Define a class which implements a logic to reverse a given array.

import java.util.*;
public class question01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int end = sc.nextInt();
        System.out.println("enter the elements :");

        int arr[] = new int[end];

        for(int i = 0; i < end; i++){

            arr[i] = sc.nextInt();
        
        }
        for(int i = 0; i < end/2; i++){

            int temp = arr[i];
            arr[i] = arr[end-1-i];
            arr[end-1-i] = temp;
        }
        for(int i = 0;i<end;i++){

         System.out.print(arr[i]);

        }
    }    
}
