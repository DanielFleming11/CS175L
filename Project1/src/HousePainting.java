import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {

		
//Inputs
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the cost per square foot: ");
		int sqFootPrice = scan.nextInt();
		System.out.println("Please enter the length of the house: ");
		int length = scan.nextInt();
		System.out.println("Please enter the width of the house: ");
		int width = scan.nextInt();
		System.out.println("Please enter the height of the house: ");
		int height = scan.nextInt();
		System.out.println("Please enter the number of windows: ");
		int numberOfWindows = scan.nextInt();
		System.out.println("Please enter the length of a window: ");
		int windowLength = scan.nextInt();
		System.out.println("Please enter the width of a window: ");
		int windowWidth = scan.nextInt();
		System.out.println("Please enter the number of doors: ");
		int numberOfDoors = scan.nextInt();
		System.out.println("Please enter the length of a door: ");
		int doorLength = scan.nextInt();
		System.out.println("Please enter the width of a door: ");
		int doorWidth = scan.nextInt();
		
//Equations
		int windowDimension = (windowWidth * windowLength);
		int windowSpace = (windowDimension * numberOfWindows);
		
		int doorDimension = (doorWidth * doorLength);
		int doorSpace = (numberOfDoors * doorDimension);
		
		int peakSide = ((length * width) + ((length * (height - width))/2));
		int peaks = (peakSide * 2);
		
		int normalSide = (length * width);
		int squares = (normalSide * 2);
		
		int finalDimensions = (squares + peaks - doorSpace - windowSpace);
				
//Price
		int finalPrice = (finalDimensions * sqFootPrice);
	
//Output
		System.out.println("Your total paintable surface area is " + finalDimensions + " square feet.");
		System.out.println("Your estimate is " + finalPrice + " dollars.");
	}

}
