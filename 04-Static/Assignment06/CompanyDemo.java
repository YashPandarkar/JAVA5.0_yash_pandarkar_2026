/*

			Company Branches
	
	- Create a Company class with:
		- Static variable companyName.
		- Static variable totalBranches.
	- Every time a new branch (object) is created, increment totalBranches.
	- Show that changing companyName reflects in all objects.
*/
class Company{

    static String companyName = "CodeNova";
    static int totalBranches = 0;

    Company(){
        totalBranches++;
    }
    void showDetails(){
        System.out.println("Company Name :" + companyName);
        System.out.println("Total Branches :" + totalBranches);
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();
        Company c4 = new Company();
        Company c5 = new Company();

        c5.showDetails();

        Company.companyName = "CodeNova Technologies";

        c2.showDetails();
    }
    
}
