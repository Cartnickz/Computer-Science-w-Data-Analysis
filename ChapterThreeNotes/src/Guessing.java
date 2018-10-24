import java.util.Scanner;

public class Guessing {
	public static void main(String[] args){
		double numGuesses = 0, highestPossible = 101, lowestPossible = 1;
		double guess;
		String response;
		boolean done = false;
		Scanner scan = new Scanner(System.in);

		System.out.print("Think of a number between 1 and 100 and then press enter.");
		response = scan.nextLine();

		while (!done){
			guess = (highestPossible + lowestPossible) / 2;
			numGuesses++;
			System.out.print("Is the number " + guess + " (Correct, Low, High)? ");
			response = scan.nextLine();

			if (response.equalsIgnoreCase("correct")) {
				done = true;
			} else if (response.equalsIgnoreCase("low")) {
				lowestPossible = guess;
			} else if (response.equalsIgnoreCase("high")) {
				highestPossible = guess;
			} else {
				System.out.println("Invalid input.  Try again.");
				numGuesses--; //don't count this as a guess
			}

			System.out.println("\nNumber of guesses: " + numGuesses);

		}
		scan.close();
	}
}