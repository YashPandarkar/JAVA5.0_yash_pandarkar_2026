/*
	- Create a class Flight with the following details:
			- Data members:
				- flightNumber (String)
				- source (String)
				- destination (String)
				- seatsAvailable (int)

		- Requirements:
		- Define a parameterized constructor to initialize flight details.
		- Define a copy constructor that copies flight details from another object but allows you to change seatsAvailable (so that both flights don’t share the same seat count).
		- Define a method bookSeat(int seats) which reduces the available seats if booking is possible, otherwise prints “Not enough seats available”.
		- Define a method display() to show the flight details.

	- In the main method:
		- Create a Flight object f1 using the parameterized constructor.
		- Book some seats on f1.
		- Create another object f2 using the copy constructor (copying f1) but with a different seat availability.
		- Book seats on f2.

	- Display both objects to show they are independent.

*/

class Flight{

    String flightNo;
    String source;
    String destination;
    int seatAvailable = 50;

    Flight(String flightNo ,String source ,String destinartion ,int seatAvailable){

        this.flightNo = flightNo;
        this.source = source;
        this.destination = destinartion;
        this.seatAvailable = seatAvailable;
    }
    Flight(Flight f1 ,int seatAvailable){

        this.flightNo = f1.flightNo;
        this.source = f1.source;
        this.destination = f1.destination;
        this.seatAvailable = seatAvailable;
    }
    void bookSeat(int seats){

        System.out.println("Trying to book " + seats + "seats");
        if(seatAvailable > seats){

            System.out.println("your seat is booked");
            seatAvailable -= seats;

        }else{

            System.out.println("Not enought seats available ");
        }
    }
    void showDetails(){

        System.out.println("Flight Number :" + flightNo);
        System.out.println("Source :" + source);
        System.out.println("Destination :" + destination);
        System.out.println("Seats Available :" + seatAvailable);
    }
}
public class FlightDemo {
    public static void main(String[] args) {
        
        Flight f1 = new Flight("22ih5i2","pune","mumbai", 18);
        f1.bookSeat(12);
        f1.showDetails();

        Flight f2 = new Flight(f1, 25);
        f2.bookSeat(23);
        f2.bookSeat(5);
        f2.showDetails();

    }  
}
