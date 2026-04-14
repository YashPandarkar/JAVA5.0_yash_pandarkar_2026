/*- Write a program to merge two sorted arrays in one array.
- array1[1,4,5,8]
- array2[2,3,6,7]
- o/p: array3[1,2,3,4,5,6,7,8]
- Note: - If the given array is not sorted sort them first and then merge
- Do not use any inbuilt functions. */
import java.util.*;
public class question07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of 1 array :");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];

        System.out.println("enter the elemets :");
        for(int i = 0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the size of 2 array :");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        System.out.println("enter the elements :");
        for(int i = 0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size1+size2];
        for(int i = 0; i < size1; i++){

            arr3[i] = arr1[i];
        }
        for(int i = size1; i < size1+size2-1; i++){
             
            arr3[i] = arr2[i-size1];
        }
        for(int i = 0; i < size1+size2-1; i++){

            for(int j = 0; j < size1+size2-1-i; j++){

                if(arr3[j] > arr3[j+1]){
                    
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp; 
                }
            }
        }
        System.out.println("sorted array :");
        for(int i = 0;i<size1+size2-1;i++){
            System.out.print(" "+arr3[i]);
        }
    }   
}
