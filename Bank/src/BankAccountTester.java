import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much would you like your initial deposit to be?");
		int open = scan.nextInt();
		BankAccount myBankAccount = new BankAccount();
		myBankAccount.deposit(open);

		
		
		System.out.println("How much money would you like to withdraw?");
		double x = scan.nextDouble();
		myBankAccount.withdraw(x);
		
		System.out.println("How much money would you like to deposit?");
		double y = scan.nextDouble();
		myBankAccount.deposit(y);
		
		System.out.println("Your balance is: " + myBankAccount.getBalance());
		
		scan.close();
	}

}
