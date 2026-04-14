/*Write a program to check if given array is sorted in increasing order
- array [5,12,45,87,90]
- o/p: Array is sorted in Increasing order
- Try to achieve best complexity. */

import java.util.*;
public class question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements :"); 
        
        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();
        }
        int flag = 0;

        for(int i = 0; i < size-1; i++){
            if(arr[i] > arr[i+1]){
                flag = 1;
            }     
        }
        if(flag == 1){
                System.out.println("array is not sorted !");
            }else{
                System.out.println("Array is sorted in Increasing order");
            }
    }    
}
