import java.text.NumberFormat;
import java.util.Scanner;


public class NicoleCollegeFinance {

	public static void main(String[] args) {	
		int count;
		double loan = 0, amount, firstYearCost, secondYearCost, thirdYearCost, fourthYearCost, totalCost = 0, product, percent, monthly;
		final double INFLATION = .037, INTEREST_RATE=.005, MONTHS=180;
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		NumberFormat fmt1 = NumberFormat.getPercentInstance();
		Scanner scan = new Scanner (System.in);
		//        System.out.print("Please enter the amount you are borrowing monthly: ");
		//        loan = scan.nextDouble();
		//        System.out.print("Please enter the percent interest rate in the format 0.00 : ");
		//        interestRate = scan.nextDouble();
		//        System.out.print("Please enter the amount of months you will be borrowing for: ");
		//        months = scan.nextDouble();
		//        
		amount = ((loan * INTEREST_RATE) / (1-(Math.pow((1+INTEREST_RATE), (-1 * MONTHS))))) * MONTHS;
		//        System.out.println("Your monthly payment will be: " + (fmt.format (amount)));
		//        
		System.out.print("Enter the total cost for one year: ");
		firstYearCost = scan.nextDouble();

		secondYearCost = firstYearCost * (1+INFLATION);
		thirdYearCost = secondYearCost * (1+INFLATION);
		fourthYearCost = thirdYearCost * (1+INFLATION);
		totalCost = firstYearCost + secondYearCost + thirdYearCost + fourthYearCost;

		System.out.println("Your total cost for four years will be: " + (fmt.format(totalCost)));
		double copyTotalCost = totalCost;
		double amountPaid, percentMonth;
		for (percent=20 ; percent<=100; percent+=20)
		{
			totalCost = copyTotalCost * (percent/100.0); 

			amountPaid=((totalCost * INTEREST_RATE) / (1-(Math.pow((1+INTEREST_RATE), (-1 * MONTHS))))) * MONTHS;

			monthly=totalCost/180;
			percentMonth= monthly/3912.78;

			System.out.println("If you borrow " + percent + "% of the total tution you will have to pay "
					+ fmt.format(amountPaid) + " back in loans at the cost of " + fmt.format(monthly) + " per month");
			System.out.println("This would require " + fmt1.format(percentMonth) + " of my monthly take-home income." );
		}

	}

}

