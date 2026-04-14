//2. - Write a program to find second largest element in given array.
//- array [10,20,1,48,90] O/P: 48.
//- Note: do not use any inbuilt functions

public class question02 {

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 1, 48, 90};
        
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}