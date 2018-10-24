import java.util.Scanner;
public class DayOfTheWeek {

	public static void main(String[] args) {
		//ask for input from user
		Scanner input = new Scanner(System.in);
		int monthIn, dayIn, yearIn;

		System.out.println("Please enter month as an integer: ");
		monthIn = input.nextInt();

		System.out.println("Please enter day as an integer: ");
		dayIn = input.nextInt();

		System.out.println("Please enter year as an integer: ");
		yearIn = input.nextInt();

		//begin computations
		int monthComp, yearComp, x, weekdayInt;

		yearComp = yearIn - (14 - monthIn) / 12;
		x = yearComp + yearComp/4 - yearComp/100 + yearComp/400;
		monthComp = monthIn + 12 * ((14 - monthIn)/12) - 2;
		weekdayInt = (dayIn + x + (31*monthComp)/12) % 7;

		//translate weekdayInt to a string containing the name of the day of the week
		String day = new String();

		if (weekdayInt == 0) {
			day = "Sunday";
		} else if (weekdayInt == 1) {
			day = "Monday";
		} else if (weekdayInt == 2) {
			day = "Tuesday";
		} else if (weekdayInt == 3) {
			day = "Wednesday";
		} else if (weekdayInt == 4) {
			day = "Thursday";
		} else if (weekdayInt == 5) {
			day = "Friday";
		} else if (weekdayInt == 6) {
			day = "Saturday";
		} else {
			System.out.println("Uh oh, something's not right...");
		}

		//print day to console
		System.out.println("\n" + monthIn + "/" + dayIn + "/" + yearIn);
		System.out.println("The day was a " + day + "!");

		input.close();
	}

}
