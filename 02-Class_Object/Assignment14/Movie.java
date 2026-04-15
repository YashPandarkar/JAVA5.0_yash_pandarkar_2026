/*

	Exercise 14

- Define a class "Movie" with title, lead actor, and rating. 
- Accept 5 movies and display all movies with rating above 4.	

*/
import java.util.Scanner;
class Movie {
    String title;
	String leadActor;
	int rating;

	void display(){
		System.out.println("Title of movie :"+title);
		System.out.println("Lead Actor :"+leadActor);
		System.out.println("Rating "+rating+" star");
	}

	public static void main(String[] args) {

		Movie[] movie = new Movie[5];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 5 ; i++){
			movie[i] = new Movie(); 
		}
		for(int i = 0;i < 5;i++){
			System.out.println("Enter the title :");
			movie[i].title  = sc.nextLine();
			System.out.println("Enter the name of Lead Actor :");
			movie[i].leadActor = sc.nextLine();
			System.out.println("Enter the rating :");
			movie[i].rating = sc.nextInt();
			sc.nextLine();
		}
		for(int i = 0;i<5;i++){
			if(movie[i].rating > 4){
				System.out.println("Details of "+(i+1)+" movie :");
				movie[i].display();
			}
		}
	}
}
