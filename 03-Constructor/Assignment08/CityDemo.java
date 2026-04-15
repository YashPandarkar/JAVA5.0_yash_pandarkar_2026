/*
	- Create a class City with data members: name, population, and area.
	-Define a parameterized constructor to initialize these values.
	-Define a copy constructor to create a new city object by copying another city object.
	-Define a method display() to print city details.

	- In the main method:
	- Create one City object using the parameterized constructor.
	- Create another City object using the copy constructor.

	- Display both objects to verify the copied values.

*/
class City{

    private String name;
    private int population;
    private float area;

    City(String name ,int population ,float area){

        this.name = name;
        this.population = population;
        this.area = area;
    }
    City(City c1){

        this.name = c1.name;
        this.population = c1.population;
        this.area = c1.area;
    }
    void showDetails(){

        System.out.println("Name :" + name);
        System.out.println("Population :" + population);
        System.out.println("Area :" + area);
    }
}
public class CityDemo {

    public static void main(String[] args) {
        
        City c1 = new City("pune",4500000,23536);
        City c2 = new City(c1);

        c1.showDetails();
        c2.showDetails();
    }
    
}
