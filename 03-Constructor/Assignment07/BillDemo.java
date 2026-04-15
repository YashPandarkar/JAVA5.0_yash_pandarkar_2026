/*
 -Write a program to calculate an electricity bill using Object-Oriented Programming.
  Create a class named Bill that:
                   - Has a constructor which accepts the number of electricity units consumed.
				   - Calculates the total bill amount based on the following slab rates:
							- ₹3 per unit for the first 100 units
							- ₹5 per unit for the next 100 units (101–200)
							- ₹10 per unit for units above 200

 -The class should also have a method named display() to print:
		- Units consumed
		- Total bill amount

 -In the main program:
 -Create at least three objects of the Bill class with different unit values (e.g., 80, 150, 250).
 -Call the display() method for each object.
*/

class Bill{

    int unit;
   
    Bill(int unit){
        this.unit = unit;
    }
    void showDetails(){

        System.out.println("Units Consumed :" + unit);
        System.out.println("Total Bill Amount :" + calculateAmount(unit));
    }
    double calculateAmount(int unit){

        if(unit <= 100){

            return (unit * 3);

        }else if(unit > 100 && unit <= 200){

            return (unit * 5);

        }else{

            return (unit * 10);
        }
    }
}
public class BillDemo {
    public static void main(String[] args) {
        
        Bill b1 = new Bill(105);
        b1.showDetails();
        Bill b2 = new Bill(67);
        b2.showDetails();
        Bill b3 = new Bill(185);
        b3.showDetails();
        Bill b4 = new Bill(457);
        b4.showDetails();
        Bill b5 = new Bill(100);
        b5.showDetails();
    }
    
}
