import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		// 3.18 Write a code fragment that determines and prints the 
		// number of times the character 'a' appears in a String object called name
		System.out.println("What is your string?");
		String userString = input.next();
		int a = 0;
		
		for (int i = 0; i < userString.length(); i++) {
			if (userString.charAt(i) == 'a' || userString.charAt(i) == 'A') {
				a++;
			}
		}

		System.out.println("There are " + a + " \"a\"'s in your string");
		
		// 3.19 Write a code fragment that prints the characters stored 
		// in a String object called str backward
		System.out.println("\nWhat is your String?");
		String str = input.next();
		
		String backwards = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			backwards = backwards + str.charAt(i);
		}
		System.out.println(backwards);
		
	}

}
