import java.util.Scanner; 
public class FactorialCalc { 

	public static void main(String[] args) { 
		//Ask user for input 
		Scanner input = new Scanner(System.in); 
		System.out.println("What number (between 0 and 13) would you like to use?"); 
		int num = input.nextInt(); 
		int factorial = num; 

		//check if answer is valid (greater than 0 or less than 13) 
		while (num < 0 || num > 12) { 
			System.out.println("Please select a number greater than 0 and less than 13."); 
			System.out.println("What number would you like to use?"); 
			num = input.nextInt(); 
		} 

		//compute factorial 
		System.out.println("\n " + num); 
		if (num > 0) { 
			for (int i = 1; num - i > 0; i++) { 
				factorial = factorial * (num - i); 
				System.out.println("x" + (num - i) + " = " + factorial); 
			} 
		} else { 
			factorial = 1; 
			System.out.println(factorial); 
		} 

		System.out.println("\n" + num + " factorial is " + factorial + "."); 

		input.close();
	} 
} 