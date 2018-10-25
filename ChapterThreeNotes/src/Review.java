import java.util.Arrays;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		// 3.17 Write a code fragment that reads 10 integer values from the user
		// and prints the highest value entered
		System.out.println("Please enter 10 numbers: ");
		
		int[] tenNumbers = new int[10];
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Number #" + i + ": ");
			int num = input.nextInt();
			tenNumbers[i-1] = num;
		}
		
		int highestNumber = 0;
		for (int i = 0; i < 9; i++) {
			if (tenNumbers[i] >= highestNumber) {
				highestNumber = tenNumbers[i];
				System.out.println(tenNumbers[i]);
			}
		}
		
		System.out.println("\n" + Arrays.toString(tenNumbers));
		System.out.println("The highest number is: " + highestNumber);
		
		// 3.18 Write a code fragment that determines and prints the 
		// number of times the character 'a' appears in a String object called name
		input.nextLine();
		
		System.out.println("\nWhat is your string?");
		String userString = input.nextLine();
		int a = 0;
		
		for (int i = 0; i < userString.length(); i++) {
			if (userString.charAt(i) == 'a' || userString.charAt(i) == 'A') {
				a++;
			}
		}

		System.out.println("There are " + a + " \"a\"'s in your string");
		
		// 3.19 Write a code fragment that prints the characters stored 
		// in a String object called str backward
		System.out.println("\nWhat is your string?");
		
		String str = input.nextLine();
		
		String backwards = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			backwards = backwards + str.charAt(i);
		}
	
		System.out.println(backwards);
		
		// 3.20 Write a code fragment that prints every other character in a String object 
		// called word starting with the first character
		
		System.out.println("\nWhat is your string?");
		String strOther = input.nextLine();
		
		String word = "";
		for (int i = 0; i < strOther.length(); i = i + 2) {
			word = word + strOther.charAt(i);
		}
		
		System.out.println(word);
	}

}

/* Self Review Questions 
 *		3.1 - the steps to developing a program are:
 * 			1. Requirements - specifying what the program must do
 *			2. Design - specifies how a program will accomplish its requirements (pseudocode)
 *			3. Implementation - translate the design into source code
 *			4. Testing - look for bugs
 *		3.2 - An algorithm is a step by step process for solving a problem. Pseudocode is
 *			a way of expressing designs using code-like language but without following any
 *			context.
 *		3.3 - Flow of control is the order of statement execution of a program. Programming
 *			statements like for, if, or while loops can change the flow of control
 *		3.4 - Conditionals and loops are based off of boolean conditions that either result in
 *			true or false
 *		3.5 - The equality operator looks like (==) and is used to test whether or not two values
 *			are equal to one another. This will return an boolean value. Relational operators look
 *			like (<, >, <=, >=) and test how things relate to one other. Also returns boolean values
 *		3.6 - A nested if statement and a nested loop are statements that reside inside another statement
 *			of the same type. For example, a nested if statement is an if statement within an if statement
 *		3.7 - Using block statements to define the beginning and end of parts of code for
 *			if statements, while loops, etc..., allows the use of multiple lines of code
 *			within each statement
 *		3.8 - A truth table is a tool used for easily showing possible T/F combinations of terms
 *		3.9 - Strings are compared for equality using double equal signs
 *		3.10 - We need to be be careful when comparing floating point values because they are
 *			stored as binary numbers and might not be completely the same. 
 *		3.11 - An assignment operator is used to assign new values to a variable
 *		3.12 - An infinite loop is caused by a loop startment that never breaks out of the condition
 *				it tests for
 *		3.13 - A for loop is best for loops with a fixed amount of reruns
 */
