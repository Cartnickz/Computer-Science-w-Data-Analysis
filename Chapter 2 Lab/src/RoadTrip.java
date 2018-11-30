//Zach Cartnick
//Dr. Bixler
//Computer Science
//1 October 2018

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class RoadTrip {
	public static void main(String[] args) {
		double days;
		Locale us = new Locale("en","US");
		NumberFormat money = NumberFormat.getCurrencyInstance(us);
		DecimalFormat twoPlaces = new DecimalFormat("#.##");
		twoPlaces.setRoundingMode(RoundingMode.HALF_UP);

		//ask user input
		Scanner input = new Scanner(System.in);

		System.out.println("How far away (miles) is your final destination?: "); 
			//doubled assuming same distance coming back
		double totalMiles = input.nextDouble() * 2;

		System.out.println("Highway miles per gallon of your vehicle: ");
		double highwayMileage = input.nextDouble();

		System.out.println("City miles per gallon of your vehicle: ");
		double cityMileage = input.nextDouble();

		System.out.println("How many hours will you be driving to your final destination?: ");
		double drivingTime = input.nextDouble();

		System.out.println("What is the average gas price along your route?: ");
		double gasPrice = input.nextDouble();

		System.out.println("What is the average hotel room cost (per night)?: ");
		double hotelCost = input.nextDouble();

		System.out.println("How much money will you spend on food each day?: ");
		double foodCost = input.nextDouble();

		System.out.println("How many people (including you) will be taking this trip?: ");
		int headCount = input.nextInt();

		System.out.println("How much does your activity cost?");		
		double activitiesCost = input.nextDouble();

		/*how many days the trip will take (assuming max 7 hours of driving a day 
		+ doubled assuming takes as long to reach destination as it does to get back) */
		days = Math.ceil(drivingTime / 7 * 2);
		System.out.println("\nThis trip will take " + days + " days and span " 
				+ twoPlaces.format(totalMiles) + " miles.");

		//total cost of the hotels assuming one person per room
		double hotelTotal = hotelCost * days;
		System.out.println("\nHotel Cost: \t\t" + money.format(hotelTotal));

		//total cost of the gas assuming all travelers in one car
		double averageMileage = (0.90 * highwayMileage) + (0.10 * cityMileage); 
			//assuming 90% of the mileage will be highway and %10 will be city
		double gasTotal = totalMiles / averageMileage * gasPrice;
		System.out.println("Gas Cost: \t\t" + money.format(gasTotal));

		//cost of food per person
		double foodTotal = foodCost * days * headCount;
		System.out.println("Food Cost: \t\t" + money.format(foodTotal));

		//total cost of the trip
		System.out.println("Activities Cost: \t" + money.format(activitiesCost));

		double totalCost = gasTotal + hotelTotal + foodTotal + activitiesCost;
		System.out.println("TOTAL: \t\t\t" + money.format(totalCost));

		//your share of the total cost
		double yourShare = totalCost / headCount;
		System.out.println("\nYou will need to pay " + money.format(yourShare) + ".");

		/*how many hours at work (assuming $8.60 hourly wage, 8 hour work day, 
		and 14.84% salary tax rate from smartasset.com)*/
		final double SALARY = (8.60 * 8) * (1 - 0.1484);
		double workDays = Math.ceil(yourShare / SALARY);
		System.out.println("You will need to work " + workDays 
				+ " days to pay for this trip.");

		//save per week (36 weeks)
		double weeklySavings = yourShare / 36;
		System.out.println("You can pay for this trip by graduation by saving " 
				+ money.format(weeklySavings) + " per week.");

		input.close();

	}

}
