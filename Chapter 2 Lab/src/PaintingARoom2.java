//Zach Cartnick
//Dr. Bixler
//Computer Science
//1 October 2018
import java.util.Scanner;
public class PaintingARoom2 {
	public static void main(String[] args) {
		//declare variables
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		final int doorSize = 20;
		final int windowSize = 15;
		double length, width, height;
		double doors, windows;
		double totalSqFt;
		double paintNeeded;
		
		//declare and initialize Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt for and read in the dimensions of the room
		System.out.println("What is the length (ft.) of your room?: ");
		length = input.nextDouble();
		
		System.out.println("What is the width (ft.) of your room?: ");
		width = input.nextDouble();
		
		System.out.println("What is the height (ft.) of your room?: ");
		height = input.nextDouble();
		
		System.out.println("How many doors do you have?: ");
		doors = input.nextDouble();
		
		System.out.println("How many windows do you have?: ");
		windows = input.nextDouble();
		
		//Compute the total square feet to be painted 
		double widthSides = 2 * width * height;
		double lengthSides = 2 * length * height;
		
		double doorSpace = doors * doorSize;
		double windowSpace = windows * windowSize;

		totalSqFt = widthSides + lengthSides - doorSpace - windowSpace;
		
		//Compute the amount of paint needed
		paintNeeded = Math.ceil(totalSqFt / COVERAGE);
		
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		System.out.println("\nLength: " + length + " ft. \tWidth: " + width 
				+ " ft. \tHeight: " + height + " ft.");
		System.out.println("Doors: " + doors + " \tWindows: " + windows);
		System.out.println("Your room needs " + totalSqFt + " Sq. Ft. of paint.");
		System.out.println("You must buy " + paintNeeded + " buckets of paint.");
		
		input.close();
	}
}
