
//3. - Write a program to remove all duplicates from the given array.
//- array [1,1,2,4,6,5,6,8,2]
//- o/p: array [1,2,4,6,5,8].


public class question03 {

    public static void main(String[] args) {
        
        int arr[] = {1,1,2,4,6,5,6,8,2};
        int temp[] = new int[arr.length];

        int n = 0;
        int flag = 0;
       

        for(int i = 0;i<arr.length;i++){

            flag = 0;

            for(int j = i-1 ;j >= 0; j--){

                if(arr[i] == arr[j]){

                    flag = 1;
                    n++;
                }
            
            }
            if(flag == 0){

                temp[i-n] = arr[i];
            }
           
        }
        System.out.print("\narray with duplicate elements :");
        for(int i = 0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.print("\n\narray without duplicate elements :");
        for(int i = 0;i<arr.length-n;i++){

            System.out.print(temp[i]+" ");
        }
    }
}
