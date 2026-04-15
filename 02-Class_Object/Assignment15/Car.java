/*

		Exercise 15
- Create a class Car with model, mileage, price. 
- Accept details for 4 cars and display the model 
  of the cheapest one with mileage above 20.		

*/
import java.util.Scanner;
class Car {
  
  String model;
	int mileage;
	int price;

	void display(){
    System.out.println("---------Details of Car-----------");
		System.out.println("model of car :"+model);
		System.out.println("mileage of car :"+mileage+" km/Ltr");
		System.out.println("price of car :"+price);
	}

	public static void main(String[] args) {

		Car[] car = new Car[4];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 4 ; i++){
			car[i] = new Car(); 
		}
		for(int i = 0;i < 4;i++){
			System.out.print("Enter the model of car :");
			car[i].model = sc.nextLine();
			System.out.print("Enter the mileage of car :");
			car[i].mileage = sc.nextInt();
			System.out.print("Enter the price of car :");
			car[i].price = sc.nextInt();
			sc.nextLine();
      System.out.println();

		}
    Car cheapest = null;
    int flag = 0;
		for(int i = 0 ; i < 4 ; i++){
			if(car[i].mileage > 20){
        if(cheapest == null || car[i].price < cheapest.price){
          cheapest = car[i];
          flag = 1;
        }
			}
		}
    if(flag == 1){
      cheapest.display();
    }else{
      System.out.println("there is no any car with mileage above 20 km/ltr");
    }
	}
}

    

