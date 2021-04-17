import java.util.Scanner;


public class CardNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String creditCard;
		int i = 0;
		boolean a = true;
		
		
		while(a == true) {
			
			System.out.println("Enter a Credit Card number or -99 to end:");
			creditCard = scan.nextLine();
			
			if(creditCard.contentEquals("-99")) {
				a = false;
				System.out.println("Goodbye.");
			}
			
			else {
				while(i<creditCard.length()) {
					char count = creditCard.charAt(i);
					
					if(count == '-' || count == ' ') {
						String previous = creditCard.substring(0,i);
						String after = creditCard.substring(i + 1);
						creditCard = previous + after;
					}
					
					else {
						i++;
					}
				}
				
				i = 0;
				System.out.println(creditCard);
				
			}
		}
		
		
		}
	}


