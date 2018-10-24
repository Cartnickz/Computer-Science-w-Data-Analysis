import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		//ask the user for input
		Scanner input = new Scanner(System.in);
		double fTemp, windSpeed, windChill;

		System.out.println("What is the temperature outside?: ");
		fTemp = input.nextDouble();
		while (Math.abs(fTemp) > 50) { //check if answer is valid
			System.out.println("Sorry, you must choose an a temperature between -50 and 50 degrees fahrenheit..");
			System.out.println("What is the temperature outside?: ");
			fTemp = input.nextDouble();
		}

		System.out.println("What is the wind speed outside?: ");
		windSpeed = input.nextDouble();
		while (windSpeed > 120 || windSpeed < 3) { //check if answer is valid
			System.out.println("Sorry, you must choose an a wind speed between 3 and 120 miles per hour..");
			System.out.println("What is the temperature outside?: ");
			windSpeed = input.nextDouble();
		}

		//print values selected to user
		System.out.println("\nTemperature:\t" + fTemp + " degree(s) F" +
				"\nWind Speed:\t" + windSpeed + " miles per hour");

		//begin computations
		windChill = 35.74 + (0.6215 * fTemp) + (0.4275 * fTemp - 35.75) * Math.pow(windSpeed, 0.16);

		//print result
		System.out.println("\nThe wind chill temperature is " + windChill + " degrees F");

		input.close();
	}

}
