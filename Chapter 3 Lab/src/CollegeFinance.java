import java.text.NumberFormat;
import java.util.Scanner;

public class CollegeFinance {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double borrowed, interestRate, amount;
		int months;


		//ask user for input
		System.out.println("How much money will you be borrowing?: ");
		borrowed = input.nextDouble();

		System.out.println("What is your monthly interest rate (%)?");
		interestRate = input.nextDouble()/100;

		System.out.println("Over how many months will you pay back the loan?");
		months = input.nextInt();

		//Calculate amount
		amount = (borrowed * interestRate * months) 
				/ (1 - Math.pow((1 + interestRate), -months));

		System.out.println("\nYou will owe " + money.format(amount) 
				+ " after " + months + " months." );

		//Ask user info for determining four year cost
		double tuition = 0, room = 0, books = 0,
				fees = 0, other = 0, annualCost = 0, 
				fourYearCost = 0; 

		System.out.println("\nWould you like to use costs from Vanderbilt? (Y for yes)");
		String preset = input.next();

		if (preset.equalsIgnoreCase("Y")) {
			tuition = 46500;
			room = 15584;
			books = 1294;
			fees = 1164;
			other = 2850;
		} else {
			System.out.println("\nWhat is your tuition cost?: ");
			tuition = input.nextDouble();
			System.out.println("\nWhat does your room and board cost?: ");
			room = input.nextDouble();
			System.out.println("\nWhat do your books cost?: ");
			books = input.nextDouble();
			System.out.println("\nWhat do added fees cost?: ");
			fees = input.nextDouble();
			System.out.println("\nOther: ");
			other = input.nextDouble();
		}

		annualCost = (tuition + room + books + fees + other);

		System.out.println("\nWould you like to use Vanderbilt's annual increase (2.6%)?: ");
		String defaultRise = input.next();
		double tuitionRise = 0;

		if (defaultRise.equalsIgnoreCase("Y")) {
			tuitionRise = 0.026;
		} else {
			System.out.println("\nWhat is the average annual rate of increase in tuition (%)? ");
			tuitionRise = input.nextDouble()/100;
		}

		fourYearCost = annualCost;

		System.out.println("\nYear 1 Cost: " + annualCost);
		System.out.println("Avg. Tuition Rise per year: " + tuitionRise);

		for (int i = 1; i < 4; i++) {
			fourYearCost = fourYearCost + (annualCost * Math.pow((1 + tuitionRise), i));
		}

		System.out.println(money.format(fourYearCost));

		//Calculate Loan Interest
		System.out.println("\nWhat is the interest on your loan?: ");
		double monthlyInterest = input.nextDouble()/100;

		System.out.println("How long (months) will you pay off your loan?: ");
		int loanLength = input.nextInt();

		double loanInterest = 0;

		for (double p = 0.20; p <= 1; p += 0.20) {
			loanInterest = ((fourYearCost * p) * (monthlyInterest / 12) * loanLength) 
					/ (1 - Math.pow(1 + monthlyInterest / 12, -loanLength));
			System.out.println("\nFor a " + money.format(fourYearCost * p) + " loan at " 
					+ (monthlyInterest * 100) + "% interest with a pay off period of "
					+ loanLength + " months, you would pay a total of " + money.format(loanInterest)
					+ ".\nYour Monthly Payment is: " + money.format(loanInterest / loanLength));
		}
		
		System.out.println();
	}
}
