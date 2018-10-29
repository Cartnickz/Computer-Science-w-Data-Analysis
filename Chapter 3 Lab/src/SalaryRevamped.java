import java.text.NumberFormat; 
import java.util.Scanner; 
public class SalaryRevamped { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		NumberFormat money = NumberFormat.getCurrencyInstance(); 
		NumberFormat percent = NumberFormat.getPercentInstance(); 

		double currentSalary, raiseAmount, newSalary; 
		double percentRaise = 0; 
		int rating; 

		//ask user for input 
		System.out.println("What is your current salary?: "); 
		currentSalary = input.nextDouble(); 
		System.out.println("What is your performance rating?"); 
		rating = input.nextInt(); 

		while (rating != 1 && rating != 2 && rating != 3) { 
			System.out.println("Your rating is not valid."); 
			System.out.println("What is your performance rating?"); 
			rating = input.nextInt(); 
		} 

		raiseAmount = 0; 
		newSalary = currentSalary; 
		double sum = currentSalary; 

		//compute percentRaise for different performance levels 
		System.out.println("How many years would you like the program to run?"); 
		int maxYears = input.nextInt(); 
		for (int years = 1; years <= maxYears; years++) { 
			if (rating == 1) { 
				percentRaise = 0.06; 
			} else if (rating == 2) { 
				percentRaise = 0.03; 
			} else if (rating == 3) { 
				percentRaise = 0.01; 
			} else { 
				System.out.println("Your performance rating ain't right."); 
			} 


			raiseAmount = percentRaise * newSalary; 
			newSalary = raiseAmount + newSalary; 
			sum += newSalary; 

			System.out.println(years + ":\t" + money.format(newSalary)); 
		} 

		//print 
		System.out.println("\nCurrent Salary:\t" + money.format(currentSalary)  
				+ "\nPercent Raise:\t" + percent.format(percentRaise) 
				+ "\nYears:\t\t" + maxYears 
				+ "\nRaise Amount:\t" + money.format(newSalary - currentSalary) 
				+ "\nNew Salary:\t" + money.format(newSalary) 
				+ "\nTotal Money:\t" + money.format(sum)); 
		input.close(); 
	} 

} 