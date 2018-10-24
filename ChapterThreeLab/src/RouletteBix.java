import java.util.Scanner;

public class RouletteBix {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double result;
		System.out.println("How much money does each person start with?");
		int money = scan.nextInt();
		int copyMoney = money;
		System.out.println("How much is bet on each spin?");
		int bet = scan.nextInt();
		System.out.println("How many people are we simulating?");
		int numSims = scan.nextInt();
		int finalResult = 0, numBroke = 0, madeMoney = 0, casinoProfit = 0;
		int bestResult = Integer.MIN_VALUE, worstResult = Integer.MAX_VALUE;

		// We are going to do 1000 simulations of 100000 spins each
		for (int simulation = 1; simulation <= numSims; simulation++){
			money = copyMoney;
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
				if (money <= 0) {
					//System.out.println("Sorry buddy. You're broke!");
					numBroke++;
					break;
				}
			}
			if (money > copyMoney) {
				madeMoney++;
			}
			if (money > bestResult) {
				bestResult = money;
			}
			else if (money < worstResult) {
				worstResult = money;
			}

			finalResult += money;
			casinoProfit += (copyMoney - finalResult);
		}
		System.out.println("Average money left: $" + finalResult/numSims);
		System.out.println("Average percent gain or loss: " + 100* (finalResult/numSims - copyMoney)/(copyMoney) + "%.");
		System.out.println("Users that went broke (out of " + numSims + "): " + numBroke );
		System.out.println("Users that made money (out of " + numSims + "): " + madeMoney );
		System.out.println("Best result: $" + bestResult);
		System.out.println("Worst result: $" + worstResult);
		System.out.println("Casino profit: $" + casinoProfit);
		scan.close();
	}
}

// Your task:
// 1. Use a Scanner object to instead ask the user for the money started with, the bet per spin,
// and the number of simulations
// 2. Calculate and print out the average percent gain or loss for each simulation
// 3. Calculate and print out the percent of simulations in which the user would run out of money
// 4. Calculate and print out the percent of simulations in which the user ends up with more
// than they started with
// 5. Calculate and print out the best and worst simulation results
// 6. Calculate and print out the total casino profit or loss across all simulations
// 7. If time permits, try another strategy as opposed to betting on a single number
