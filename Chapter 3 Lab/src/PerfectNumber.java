import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		boolean inUse = true;

		//ask user for input
		while (inUse) {
			Scanner input = new Scanner(System.in);

			System.out.println("What number would you like to test?");
			int num = input.nextInt();
			int sum = 0;

			//determine if num is a perfect number
			System.out.println();
			for (int divide = num/2; divide > 0; divide--) { 
				if (num % divide == 0) {
					sum += divide;
					System.out.println(divide);
				}
			}

			System.out.println("\nSum: " + sum);

			//print results
			if (sum == num) {
				System.out.println("The number is perfect!");
			} else if (sum > num) {
				System.out.println("This number is not perfect. It is abundant.");
			} else {
				System.out.println("This number is not perfect. It is deficient.");
			}
			System.out.println("\nWould you like to continue? (Y/N)");
			String response = input.next();
			if (response.equalsIgnoreCase("N")) {
				inUse = false;
			} 
			while (!(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N"))) {
				System.out.println("\nPlease type Y or N to answer.");
				System.out.println("Would you like to continue? (Y/N)");
				response = input.next();
			}
			
		}
	}
}


