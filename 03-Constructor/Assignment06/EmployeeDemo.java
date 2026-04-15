
/*
	- Create a class Employee with name and basic salary. 
	- Constructor should calculate gross salary = basic salary + 20% HRA + 10% DA.
*/
class Employee{

   private String name;
   private double baseSalary;

   Employee(String name ,double Salary){

        this.name = name;
        this.baseSalary = Salary + (Salary * (0.2)) + (Salary * (0.1));
    }
    void showDetails(){

        System.out.println("Name : " + name);
        System.out.println("Gross Salary :" + baseSalary);
    }

}
public class EmployeeDemo {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("yash", 100000);

        e1.showDetails();

    }
    
}
