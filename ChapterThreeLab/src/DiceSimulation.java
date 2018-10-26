import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class DiceSimulation {

	public static void main(String[] args) {
		Random gen = new Random();
		DecimalFormat twoPlaces = new DecimalFormat("#.##");
		DecimalFormat integerRound = new DecimalFormat("#");
		integerRound.setRoundingMode(RoundingMode.HALF_UP);

		int randomNum = gen.nextInt(6) + 1;
		int randomNum2 = gen.nextInt(6) + 1;
		int sumDie = randomNum + randomNum2;
		int rolls = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("How many rolls would you like to simulate?: ");
		int rollMax = input.nextInt();

		//set up counting variables
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;
		int sevenCount = 0;
		int eightCount = 0;
		int nineCount = 0;
		int tenCount = 0;
		int elevenCount = 0;
		int twelveCount = 0;

		//run simulation and tally outcomes
		while (rolls <= rollMax){
			if (sumDie == 2) {;
			twoCount++;
			} else if (sumDie == 3) {;
			threeCount++;
			} else if (sumDie == 4) {;
			fourCount++;
			} else if (sumDie == 5) {;
			fiveCount++;
			} else if (sumDie == 6) {;
			sixCount++;
			} else if (sumDie == 7) {;
			sevenCount++;
			} else if (sumDie == 8) {;
			eightCount++;
			} else if (sumDie == 9) {;
			nineCount++;
			} else if (sumDie == 10) {;
			tenCount++;
			} else if (sumDie == 11) {;
			elevenCount++;
			} else {;
			twelveCount++;
			}

			randomNum = gen.nextInt(6) + 1;
			randomNum2 = gen.nextInt(6) + 1;
			sumDie = randomNum + randomNum2;
			rolls++;
		}

		//calculate expected outcomes given roll count
		double twoExpect = rollMax * .02778;
		double threeExpect = rollMax * .0556;
		double fourExpect = rollMax * .08333;
		double fiveExpect = rollMax * .11111;
		double sixExpect = rollMax * .13889;
		double sevenExpect = rollMax * .16667;
		double eightExpect = rollMax * .13889;
		double nineExpect = rollMax * .11111;
		double tenExpect = rollMax * .08333;
		double elevenExpect = rollMax * .05556;
		double twelveExpect = rollMax * .02778;

		System.out.println("\nSum:\tOccurrences\tExpected Number of Occurrences\t% Error"
				+ "\n2\t" + twoCount + "\t\t" + integerRound.format(twoExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((twoExpect - twoCount)/twoExpect * 100)) + "%"
				
				+ "\n3\t" + threeCount + "\t\t" + integerRound.format(threeExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((threeExpect - threeCount)/threeExpect * 100)) + "%"
				
				+ "\n4\t" + fourCount + "\t\t" + integerRound.format(fourExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((fourExpect - fourCount)/fourExpect * 100)) + "%"
				
				+ "\n5\t" + fiveCount + "\t\t" + integerRound.format(fiveExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((fiveExpect - fiveCount)/fiveExpect * 100)) + "%"
				
				+ "\n6\t" + sixCount + "\t\t" + integerRound.format(sixExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((sixExpect - sixCount)/sixExpect * 100)) + "%"
				
				+ "\n7\t" + sevenCount + "\t\t" + integerRound.format(sevenExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((sevenExpect - sevenCount)/sevenExpect * 100)) + "%"
				
				+ "\n8\t" + eightCount + "\t\t" + integerRound.format(eightExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((eightExpect - eightCount)/eightExpect * 100)) + "%"
				
				+ "\n9\t" + nineCount + "\t\t" + integerRound.format(nineExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((nineExpect - nineCount)/nineExpect * 100)) + "%"
				
				+ "\n10\t" + tenCount + "\t\t" + integerRound.format(tenExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((tenExpect - tenCount)/tenExpect * 100)) + "%"
				
				+ "\n11\t" + elevenCount + "\t\t" + integerRound.format(elevenExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((elevenExpect - elevenCount)/elevenExpect * 100)) + "%"
				
				+ "\n12\t" + twelveCount + "\t\t" + integerRound.format(twelveExpect) 
				+ "\t\t\t\t" + twoPlaces.format(((twelveExpect - twelveCount)/twelveExpect * 100)) + "%");
		
		//Average Sum
		double averageSum = (twoCount * 2 + threeCount * 3 + fourCount * 4
				+ fiveCount * 5 + sixCount * 6 + sevenCount * 7 + eightCount * 8
				+ nineCount * 9 + tenCount * 10 + elevenCount * 11 + twelveCount * 12) / (double) rollMax;
		
		System.out.println("\nAverage Sum: " + twoPlaces.format(averageSum));
		
		//Standard Deviation
		double standardDev = Math.sqrt(((Math.pow(2 - averageSum, 2)) * twoCount + (Math.pow(3 - averageSum, 2)) * threeCount
				+ (Math.pow(4 - averageSum, 2)) * fourCount + (Math.pow(5 - averageSum, 2)) * fiveCount
				+ (Math.pow(6 - averageSum, 2)) * sixCount + (Math.pow(7 - averageSum, 2)) * sevenCount
				+ (Math.pow(8 - averageSum, 2)) * eightCount + (Math.pow(9 - averageSum, 2)) * nineCount
				+ (Math.pow(10 - averageSum, 2)) * tenCount + (Math.pow(11 - averageSum, 2)) * elevenCount
				+ (Math.pow(12 - averageSum, 2)) * twelveCount )/ rollMax);
		
		System.out.println("Standard Dev: " + twoPlaces.format(standardDev));
		input.close();
	}

}
