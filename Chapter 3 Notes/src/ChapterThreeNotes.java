//import java.util.Random;
import java.util.Scanner;
public class ChapterThreeNotes {
	public static void main(String[] args) {
//		//Chapter Three is more about logic and program statements
//		//If Statements
		Scanner input = new Scanner(System.in);
//		System.out.println("What's the temperature outside?: ");
//		double temperature = input.nextDouble();
//
//		if (temperature > 70) {
//			System.out.println("Not bad");
//		} else {
//			System.out.println("Not that warm");
//		}
//
//		//If Statements - Strings
//		String weather = "Partly cloudy";
//		if (weather.equals("Partly cloudy")) {
//			System.out.println("True");
//		}
//
//		if (weather.equalsIgnoreCase("pArTlY cLoUdY")){
//			System.out.println("True");
//		}
//
//		//Else If Statements
//		char grade = 'A';
//
//		if (grade == 'A') {
//			System.out.println("Good Job!");
//		} else if (grade == 'B') {
//			System.out.println("Good Job");
//		} else if (grade == 'C') {
//			System.out.println("Good Jo");
//		} else if (grade == 'D') {
//			System.out.println("Good J");
//		} else if (grade == 'F') {
//			System.out.println("Good");
//		} else {
//			System.out.println("Goo");
//		}
//
//		//Not Equals (!=)
//		if (!weather.equalsIgnoreCase("snowy")) {
//			System.out.println("Glad it's not snowy");
//		}
//
//		//Nested If Statements
//
//		if (temperature > 80) {
//			if (weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("partly cloudy")) {
//				System.out.println("Let's go to the beach");
//			} else {
//				System.out.println("Let's go to the pool");
//			}
//		} else {
//			System.out.println("Not shorts weather");
//		}
//
//		//comparing two strings
//		String name1 = "Zach";
//		String name2 = "Not Zach";
//
//		if (name1.equalsIgnoreCase(name2)) {
//			System.out.println("They match!");
//		} else {
//			System.out.println("they no match");
//		}
//
//		//Comparing float values
//		double x = 18.51;
//		double y = 5.288;
//		System.out.println(x + y);
//
//		if (x + y == 23.798) { //doesn't work
//			System.out.println("They're equal");
//		} else {
//			System.out.println("They're not equal");
//		}
//
//		double sum = x + y;
//		if (Math.abs(sum - 23.798) < 0.0001) { //do this instead
//			System.out.println("They actually are.");
//		} else {
//			System.out.println("still nah.");
//		}
//
//		//Assignment Operators
//		x = x + 3; //long way of adding three
//		x += 3; //short way of adding three
//		x++; //short way of adding 1
//
//		//while Statements
//		boolean isPlaying = true;
//		String response;
//		
//		while (isPlaying) {
//			System.out.println("This is is awesome, Right?");
//			response = input.nextLine();
//			if (response.equalsIgnoreCase("NO")) {
//				System.out.println("oops");
//				isPlaying = false;
//			}
//		}
//		
		//for statements (initialization; condition; increment)
		//initialization - is run only once (variable is destroyed after for loop is finished)
		//condition - the condition required to run the statement
		//increment - what happens after the statement inside the {} is run
		
		for (int count = 1; count <= 100; count++) {
			System.out.println(count);
		}
		
		
		input.close();
	}
}
