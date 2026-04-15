/*

		Employee ID Generator
	Create an Employee class.
	Each employee should have a unique employeeID starting from 101.
	Skip IDs that are multiples of 7.
	Add a static method to print how many employees are created.


*/
class Employee{

    static int count = 0;
    static int nextID = 101;
    int employeeID;

    Employee(){
      
        if(nextID % 7 == 0){
            nextID++;
        }
        this.employeeID = nextID;
        nextID++;
        count++;
    }
    void display(){
        System.out.println("Employee ID :" + employeeID);
        count();
    }
    static void count(){
        
        System.out.println("total employees are created :" + count);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        

        Employee obj[] = new Employee[50];

        for(int i = 0; i < obj.length ; i++){
            obj[i] = new Employee();
            obj[i].display();
        }   
    }  
}
