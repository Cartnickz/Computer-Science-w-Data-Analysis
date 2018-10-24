//Zach Cartnick
//Dr. Bixler
//Computer Science
//1 October 2018
//Base Conversion Lab

import java.util.Scanner;
public class BaseConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String baseBNum;
		
		int base;
		int inputNumber;
		int quotient;
		
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		//ask user input
		System.out.println("What base (between 2-9) would you like to use?: ");
		base = input.nextInt();
		while (base < 2 || base > 9) {
			System.out.println("You must choose a base between 2 and 9. You chose " 
					+ base + ". Please try again.");
			System.out.println("What base would you like to use?: ");
			base = input.nextInt();
		}
		double maxNumber = Math.pow(base, 4) - 1;
		System.out.println("You chose base " + base + ". You can convert numbers up to " 
				+ maxNumber);
		
		System.out.println("What number would you like to convert?");
		inputNumber = input.nextInt();
		while (inputNumber < 0 || inputNumber > maxNumber) {
			System.out.println("The number you chose was invalid. "
					+ "Please choose a numbe between 0 and " + maxNumber + ".");
			System.out.println("What number would you like to convert?");
			inputNumber = input.nextInt();
		}
				
		//begin algorithm
		fourthDigit = inputNumber % base;
		quotient = inputNumber / base;
		
		thirdDigit = quotient % base;
		quotient = quotient / base;
		
		secondDigit = quotient % base;
		quotient = quotient / base;
		
		firstDigit = quotient % base;
		quotient = quotient / base;
		
		System.out.println("\n" + base + "^4\t" + base + "^3\t" 
				+ base + "^2\t" + base + "^1\t");
		System.out.println(firstDigit + "\t" + secondDigit + "\t" 
				+ thirdDigit + "\t" + fourthDigit);
			
		baseBNum = "" + firstDigit + secondDigit + thirdDigit + fourthDigit;
		
		System.out.println("\nBase " + base + ":\t" + baseBNum);
		input.close();
	}

}
