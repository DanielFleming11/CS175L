import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
// Start amount
		System.out.println("Enter amount to start the account: ");
		double open = scan.nextDouble();
		
// Interest rate
		System.out.println("Enter the interest rate for this account: ");
		double in = scan.nextDouble();
//Open account
		BankAccount myBankAccount = new BankAccount(open,in);
// Deposit
		System.out.println("Enter amount to deposit in the account: ");
		double depo = scan.nextDouble();
		myBankAccount.deposit(depo);
//Withdraw 1
		System.out.println("Enter amount to withdraw from the account: ");
		double withd = scan.nextDouble();
		myBankAccount.withdraw(withd);
//Withdraw 2
		System.out.println("Enter amount to withdraw from the account: ");
		double with = scan.nextDouble();
		myBankAccount.withdraw(with);
//Interest
		System.out.println("if you want me to generate interest enter 'Yes': ");
		String dec = scan.next();

		if (dec.equals("Yes")) {
			System.out.println("Interest: " + myBankAccount.calcInterest());
			System.out.println("The account balance is: " + myBankAccount.getBalance());
		}
		else {
			System.out.println("The account balance is: " + myBankAccount.getBalance());
		}

		scan.close();
	}

}
