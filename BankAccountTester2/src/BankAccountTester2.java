import java.util.ArrayList;

public class BankAccountTester2 {

	public static void main(String[] args) {

		int i = 0;
		String a = "";
		int b = 0;
		int c = 0;
		
		BankAccount gil = new BankAccount("Gil",500);
		BankAccount joe = new BankAccount("Joe",1000);
		BankAccount fred = new BankAccount("Fred",2000);
		BankAccount sally = new BankAccount("Sally",2500);
		
		ArrayList<BankAccount> accountList = new ArrayList();
		
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		System.out.println("The accounts are: ");

		for(BankAccount x: accountList) {
			System.out.println(x.getAccount());
		}
		
		accountList.add(sally);
		
		for(BankAccount y: accountList) {
			
			if(y.getBalance() > b) {
				a = y.getAccount();
			}
		}
		System.out.println("The account with the highest balance is: " + a);
		
		accountList.remove(sally);
		
		for(BankAccount z: accountList) {
			if(z.getBalance() > c);
			a = z.getAccount();
		}
		System.out.println("The account with the highest balance is : " + a);
		
}
}