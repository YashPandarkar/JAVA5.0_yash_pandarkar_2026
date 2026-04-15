/*

		Exercise 13

- Create a class BankAccount with account number, holder name, and balance.
- Implement deposit and withdraw methods.
- Display updated balance after each transaction.

*/

class BankAccount {

	int accNo;
	String name;
	double balance;

	void deposite(double amount){
		balance = balance + amount;
		System.out.println("Deposited Amount :"+amount);
		System.out.println("Amount is Deposited");
		System.out.println("Total Balance :"+balance);
	}
	void withdraw(double amount){

		if(amount > balance){
			System.out.println("withdrawal Amount :"+amount);
			System.out.println("Insufficient Balance");
			
		}else{
			balance = balance - amount;
			System.out.println("withdrawal Amount :"+amount);
			System.out.println("Amount Withdraw ");
			System.out.println("Total Balance :"+balance);
		}
	}
    public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.accNo = 234;
		b1.name = "yash";
		b1.balance = 200000;

		b1.withdraw(2000);
		b1.deposite(5000);
		b1.withdraw(10000);
		b1.deposite(1000);
		b1.withdraw(250000);
	}
}
