/*

				Bank Account Tracker

	- Create a BankAccount class.
	- Each account has an accountNumber (auto-generated using a static variable, starts from 10001).
	- A static variable should keep track of the total accounts created.
	- A static method showTotalAccounts() displays the count.


*/
class BankAccount{

    static int count = 0;
    int accountNumber;

    BankAccount(){
        this.accountNumber = count + 10001;
        count ++; 
    }
    static void showTotalAccounts(){
        System.out.println("total Accounts created :" + count);
    }
    void displayAccountDetails(){
        System.out.println("Account Number :" + accountNumber);
        showTotalAccounts();
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        
        BankAccount acc[] = new BankAccount[20];
        for(int i = 0; i < acc.length ; i++){
            acc[i] = new BankAccount();
            acc[i].displayAccountDetails();
        }
    }    
}
