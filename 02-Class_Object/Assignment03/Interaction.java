/*
              Exercise 3.

Create a class “Iteration”,
Create an object of class “Iteration” which displays  1 to 10 table. 

*/
class Interaction {

    void table(){

        for(int i = 1;i <= 10;i++){

            System.out.print("table of"+i+":");

            for(int j = 1;j <= 10;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){

    Interaction i = new Interaction();
    i.table();
    }
}