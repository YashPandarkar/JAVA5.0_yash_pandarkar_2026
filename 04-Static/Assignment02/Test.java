/*

    - Create a class "Library" having members:
	    - static int totalBooks: which tracks the number of books. 
	    - static int addBooks(int count): to add books in library.
	    - int getBook(): to get the book from library.
	    
	- Ensure that whenever getBook method implemets it decreases the totalBook count.

    - Create another class "Test" which test the functions to add and get the books and display the counts of books at the end. 


*/
class Library{

    static int totalBooks;

    static int addBooks(int count){
        totalBooks += count;
        return totalBooks;
    }
    void getBook(){
        totalBooks--;
    }
    void display(){
        System.out.println("Total count of books in library :" + totalBooks);
    }
}
public class Test {
    public static void main(String[] args) {
        
        Library l1 = new Library();
        l1.display();
        l1.addBooks(12);
        l1.display();
        l1.getBook();
        l1.getBook();
        l1.display();

        Library l2 = new Library();
        l2.addBooks(20);
        l2.display();
        l2.getBook();
        l2.getBook();
        l2.display();
    }  
}
