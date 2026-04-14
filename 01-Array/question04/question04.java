//4. - Write a program to rotate an array to right by 'K’th steps.
//- array [1,2,3,4,5,6].
//- K = 3
//- o/p: array [4,5,6,1,2,3]

import java.util.*;
public class question04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the elements");
        for(int i = 0 ;i<size ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number of steps");
        int k = sc.nextInt();
       
        for(int i = 0;i < k;i++){

            int temp = arr[size-1];
            for(int j = size-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp; 
        }
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]);
        }   
    }
}
