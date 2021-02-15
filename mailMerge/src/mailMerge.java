import java.util.Scanner;

public class mailMerge {
	public static void main(String[] args) {
		
		
//Input
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = scan.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = scan.nextLine();
		System.out.println("Please enter your house number: ");
		String houseNum = scan.nextLine();
		System.out.println("Please enter your street");
		String streetName = scan.nextLine();
		
//Output
		
		System.out.println("Dear " + firstName + " " + lastName + ",");
		System.out.println("Please confirm that your address is " + houseNum + " " + streetName + ".");
		System.out.println("Is this address correct?");
		String x = scan.nextLine();
		
		System.out.println("Your answer is: " + x + " Goodbye!");
		
		
		
	}
}
