/*Write a program to find a missing number
from an array containing N distinct numbers
from 0 to N.
- N = 8.
- array [1,2,4,5,7]
- o/p: array [3,6,8] */

import java.util.*;
public class question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr1[] = new int[500];
        System.out.println("enter the elements :");
        for(int i = 0;i<size;i++){

            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number :");
        int n = sc.nextInt();

        int count = 0;
        for(int i = 1; i <= n; i++){

           int flag = 0;
            for(int j = 0; j < size; j++){

                if(i == arr[j]){
                    flag = 1;
                }
            }
            if(flag == 0){
                arr1[count] = i;
                count++;
            }
            
        }
        for(int i = 0; i < count; i++){

            System.out.print(arr1[i]+" ");
        }
    }
}
