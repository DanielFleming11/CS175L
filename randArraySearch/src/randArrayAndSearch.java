import java.util.Random;

public class randArrayAndSearch {

	public static void main(String[] args) {

		int l = 0;
		int s = 26;
		Random randInt = new Random();
		int[] arr = new int[50];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = 1 + randInt.nextInt(25);
			System.out.print(arr[i] + " ");
			
			
			if (arr[i] > l) {
				l = arr[i];
			}
			if(arr[i] < s) {
				s = arr[i];
			}
	}
		System.out.println("");
		System.out.println("Largest Int: " + l);
		System.out.println("Smallest Int: " + s);
		System.out.println("The Product is: " + (l * s));

}
}
