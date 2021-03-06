import java.text.NumberFormat;
import java.util.Scanner;

public class Roulette {
	public static void main(String[] args) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		NumberFormat moneyText = NumberFormat.getCurrencyInstance();
		
		double result;
		int moneyStart, bet, money = 0;
		int finalResult = 0;
		int numSims;
		
		//ask user for the amount of simulations, starting money, and bet per spin
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much money will you spend? ");
		moneyStart = input.nextInt();
		
		System.out.println("\nHow much will you bet each round?: ");
		bet = input.nextInt();
		
		System.out.println("\nHow many simulations would you like to run?: ");
		numSims = input.nextInt();
		System.out.println();
		
		for (int simulation = 1; simulation <= numSims; simulation++){
			money = moneyStart;
			
			if (simulation % 250 == 0) {
				System.out.println("Simuation Progress: " + simulation);
			}
			// Simulate one player that plays for a lifetime
			for (int spin = 1; spin <= 100000; spin++) {
				result = Math.random();
				//System.out.println(result);
				// Subtract the wager
				money -= bet;

				// Betting on a single number has a 1 in 38 chance of succeeding
				// Generate a random double between 0 and 1 and if it's less than 1/38, we have won
				if (result < 1.0/38) {
					money += 36 * bet;
				}
			}
			finalResult += money;

		}
		
		double moneyLeft = finalResult/numSims;
		double avgChange = (moneyLeft-moneyStart) / moneyStart;
		
		System.out.println("\nAverage money left: " + moneyText.format(moneyLeft));
		System.out.println("Average Percent Gain or Loss: " + percent.format(avgChange));

		
//		1.	Use a Scanner object to instead ask the user for the money started with, the bet per spin, and the number of simulations
//		2.	Calculate and print out the average percent gain or loss for each simulation
//		3.	Calculate and print out the percent of simulations in which the user would run out of money
//		4.	Calculate and print out the percent of simulations in which the user ends up with more than they started with
//		5.	Calculate and print out the best and worst simulation results
//		6.	Calculate and print out the total casino profit or loss across all simulations
//		7.	Implement a few other strategies to see if there are any that yield a profit for you. For example, betting on Red or Black pays you back $2 for a bet of $1, and has an 18 out of 38 chance of succeeding.

	}

}
