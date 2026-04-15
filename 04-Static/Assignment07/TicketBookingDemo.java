/*

			Static Counter with Conditional Logic

Problem:
	- Create a TicketBooking class:
	- Each booking should have a unique booking ID (auto-generated using a static variable).
	- Booking IDs should start from 1001 but skip any number divisible by 5.
	- Write a program to create 10 bookings and print their IDs.

Key points tested:
	- Static counter logic.
	- Conditional incrementing.
	- Real-world mapping (ID generation).
	
*/
class TicketBooking{

    static int nextID = 1001;
    int bookingID;

    TicketBooking(){

        if(nextID % 5 == 0){
            nextID++;
        }
        this.bookingID = nextID;
        nextID++;
    }
    void showDetails(){
        System.out.println("Booking ID :" + bookingID);
    }
}
public class TicketBookingDemo{
    public static void main(String[] args) {
        
        TicketBooking ticket[] = new TicketBooking[10];
        for(int i = 0; i < ticket.length ; i++){
            ticket[i] = new TicketBooking();
            ticket[i].showDetails();
        }
    }
}