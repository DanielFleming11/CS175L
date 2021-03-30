package romanNumeral;
import java.util.Scanner;

public class RomanNumeral {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//Input
		System.out.println("Enter a year");
		int year = scan.nextInt();
		
//Blank String
		String roman = "";
		
//Break down each char	
		int millenia = year/1000%10;
		int centuries = year/100%10;
		int decades = year/10%10;
		int years = year/1%10;

//Millenia
		if(millenia == 1) {
			roman = roman + "M";
		}
		if(millenia == 2) {
			roman = roman + "MM";
		}
		if(millenia == 3) {
			roman = roman + "MMM";
		}

//Centuries
		if(centuries == 1) {
			roman = roman + "C";
		}
		if(centuries == 2) {
			roman = roman + "CC";
		}
		if(centuries == 3) {
			roman = roman + "CCC";
		}
		if(centuries == 4) {
			roman = roman + "CD";
		}
		if(centuries == 5) {
			roman = roman + "D";
		}
		if(centuries == 6) {
			roman = roman + "DC";
		}
		if(centuries == 7) {
			roman = roman + "DCC";
		}
		if(centuries == 8) {
			roman = roman + "DCCC";
		}
		if(centuries == 9) {
			roman = roman + "CM";
		}
		
//Decades
		if(decades == 1) {
			roman = roman + "X";
		}
		if(decades == 2) {
			roman = roman + "XX";
		}
		if(decades == 3) {
			roman = roman + "XXX";
		}
		if(decades == 4) {
			roman = roman + "XL";
		}
		if(decades == 5) {
			roman = roman + "L";
		}
		if(decades == 6) {
			roman = roman + "LX";
		}
		if(decades == 7) {
			roman = roman + "LXX";
		}
		if(decades == 8) {
			roman = roman + "LXXX";
		}
		if(decades == 9) {
			roman = roman + "XC";
		}
		
//Years
		if(years == 1) {
			roman = roman + "I";
		}
		if(years == 2) {
			roman = roman + "II";
		}
		if(years == 3) {
			roman = roman + "III";
		}
		if(years == 4) {
			roman = roman + "IV";
		}
		if(years == 5) {
			roman = roman + "V";
		}
		if(years == 6) {
			roman = roman + "VI";
		}
		if(years == 7) {
			roman = roman + "VII";
		}
		if(years == 8) {
			roman = roman + "VIII";
		}
		if(years == 9) {
			roman = roman + "IX";
		}
		
//Output
		System.out.println(year);
		System.out.println(roman);
		
		// C = 100
		// D = 50
		// M = 1000
		
		
		// L = 50
		// X = 10
		// V = 5
		// I = 1
		
	}

}
