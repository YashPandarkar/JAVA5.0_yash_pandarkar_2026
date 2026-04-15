/*
         Exercise 5
		 
Write a Java program to compute and display the distance that light travels in given no. of days, 
your program should: 
 
    - define variables  to represent speed of light, the number of days, total time and distance of liht travels
	- Initialise speed of light to 186000 miles per second.
	- Set the number of days to 1000 (You can change this value to compute different distances)
	- Calculate the total number of seconds in the specified number of days.
	- Compute the distance light travels by multiplying the total seconds by speed of light.
	- Print the result in the format: "In <number of days> days light will travel about <distance> miles
	 
*/
public class Distance {
    
    int speedOfLight;
    int numberOfDays;
    int totalTime;
    int distance;

    int secondsInDays(int days){
        return(68400*days);
    }
    int totalDistance(int second){
        return(second*186000);
    }

    public static void main(String[] args) {
        
        Distance d = new Distance();
        d.speedOfLight = 186000;
        d.numberOfDays = 1000;

        d.totalTime = d.secondsInDays(d.numberOfDays);
        d.distance = d.totalDistance(d.totalTime);

        System.out.println("In "+d.numberOfDays+" days light will travel about "+d.distance+" miles");
    }
}
