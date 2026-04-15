/*

    - Create class "Book" which represents books in library.
	- Class Members: 
	       - BookName,
		   - Author
		   - PublishedYear
	
    - Write a default constructor which initialises 
	       - BookName to "Unkown";
           - Author to "Unknown Author";
           - PublishedYear to 0 ; 

    - Write a parameterized constructor which accepts values for 		   
           - BookName,
		   - Author
		   - PublishedYear
		   
	- Overload the constructor to allow the creation of book object by providing only
           - BookName,
		   - Author	
	    In this case PublishedYear set to 0. 
		
	- Write main() inside class "BookDemo".	

*/

import java.lang.classfile.instruction.StackInstruction;
import java.rmi.server.SocketSecurityException;

class Book {
    String BookName;
    String Author;
    int year;

    Book(){
        this.BookName = "unknown";
        this.Author = "unknown Author";
        this.year = 0;
    }
    Book(String BookName,String Author,int year){
        this.BookName = BookName;
        this.Author = Author;
        this.year = year;
    }
    Book(String BookName,String Author){
        this.BookName = BookName;
        this.Author = Author;
        this.year = 0;
    }
    void ShowDetails(){
        System.out.println("Book Name :"+BookName);
        System.out.println("Author :"+Author);
        System.out.println("Published Year :"+year);
    }

}
public class BookDemo {
    public static void main(String[] args) {
        
        Book b1 = new Book("Harry Potter Series","J.K.Rowling",1997);
        Book b2 = new Book("The Lord of the Rings","J. R. R. Tolkien");
        Book b3 = new Book();
        b3.BookName = "Think and Grow Rich";
        b3.Author = "Napoleon Hill";
        b3.year = 1937;

        b1.ShowDetails();
        b2.ShowDetails();
        b3.ShowDetails();
    }  
}
