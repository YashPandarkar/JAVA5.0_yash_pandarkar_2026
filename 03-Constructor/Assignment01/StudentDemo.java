/*
 Create a class Student having variables:
	- name
	- RollNo
	- age
	
	- Create 3 objects of  class "Student".
	- assign  values for class members. 
    - Create 2 objects using Parameterized constructor
    - create 1 object using Default constructor. 
 
    - Display if the student is applicable for Leadership  

*/
class Student {
    String name;
    int rollNo;
    int age;

    Student(){
        this.name = "none";
        this.rollNo = 0;
        this.age = 0;
    }
    Student(String name,int rollNo,int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    void checkLeadership(){
        System.out.println("name :"+name);
        System.out.println("Roll No :"+rollNo);
        System.out.println("Age :"+age);

        if(age >= 18){
            System.out.println("Leadership : Applicable");
        }else{
            System.out.println("LeaderShip : Not Applicable ");
        }
    }
}
public class StudentDemo{
    public static void main(String[] args) {
        Student s1 = new Student("yash",21,22);
        Student s2 = new Student("sanket",31,22);

        Student s3 = new Student();
        s3.name = "atharv";
        s3.rollNo = 34;
        s3.age = 17;

        s1.checkLeadership();
        s2.checkLeadership();
        s3.checkLeadership();
    }
}