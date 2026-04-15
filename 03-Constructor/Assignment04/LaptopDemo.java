/*
	-Create a class Laptop with company name, model, and price. 
	-Overload constructors to initialize:
										- Only company name
										- Company name + model
										- Company name + model + price
*/
class Laptop{
    String companyName;
    String model;
    double price;

    Laptop(){
        this.companyName = "none";
        this.model = "none";
        this.price = 0;
    }
    Laptop(String companyName){
        this.companyName = companyName;
        this.model = "none";
        this.price = 0;
    }
    Laptop(String companyName,String model){
        this.companyName = companyName;
        this.model = model;
        this.price = 0;
    }
    Laptop(String companyName,String model,double price){
        this.companyName = companyName;
        this.model = model;
        this.price = price;
    }
    void showDetails(){
        System.out.println("Comapany Name :"+companyName);
        System.out.println("Model :"+model);
        System.out.println("price :"+price);
    }
}
public class LaptopDemo {
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop("Macbook","M1",100000);
        Laptop l2 = new Laptop("Asus","TUFF");
        Laptop l3 = new Laptop("Dell");

        l1.showDetails();
        l2.showDetails();
        l3.showDetails();
    }
}
