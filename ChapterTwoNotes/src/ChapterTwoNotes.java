import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class ChapterTwoNotes {
	public static void main(String[] args) {

		//Countdown.java exercise
		System.out.print("Three… ");
		System.out.print("Two… ");
		System.out.print("One… ");
		System.out.print("Zero… ");
		System.out.println("Liftoff!"); //appears on first output line
		System.out.println("Houston, we have a problem.");

		double class1 = Math.random() * 100;
		System.out.println("Class 1: " + class1);

		//Write a story
		String name = "Zach Cartnick";
		String location = "Point Pleasant Beach";
		String hobby = "guitar";
		int age = 18;
		char grade = 'A';
		int fishCount = 6;
		double gpa = 3.78;
		int ageInMonths = age * 12;

		System.out.println("Hi everyone! My name is " + name + " and I'm from \n" + location  
				+ ". " + "In my free time, I like to play " + hobby + "." + " I am " + age + " years old or \n"
				+ ageInMonths + " months if you like to go by months. I have " + fishCount + " fish and do pretty well \n"
				+ "in school. My GPA is " + gpa + " which is an " + grade + "!");

		//Data Conversion
		//Assignment conversion (Integer saved as double
		double number = 6;

		//Arithmetic conversion (3 is converted into a float)
		double sum = 3 + 4.5; 
		//Casting
		int total = 22;
		int count = 7;
		double result = (double) total / count;
		System.out.println(result);

		//Examples
		System.out.println(5 / 3); //gives wrong answer
		System.out.println(5 / 3.0); //corrects problem but if 3 was a variable, you wouldn't be able to add a zero

		int three = 3;
		System.out.println(5 /(double) three); //casting solves this problem

		System.out.println((double) (5 / three)); //nesting in parenthesis is BAD. Computes quotients and throws away decimals before turning into double

		//System.out.println(3 % 10);
		//System.out.println(4 % 8);
		//System.out.println(7 % 8);
		//System.out.println(0 % 7);

		//Creating an object reference variable
		String hometown; //creates the object reference variable
		String savingsAccount = new String("Zach's"); //creates the reference variable AND the object itself
		//String [object name] = new String(parameter);
		String checkingAccount = "Dude's"; //shorthand way
		String favFood = new String("burger");
		String favFood2 = new String("pizza");
		String favFood3 = new String("burger");
		String favFood4 = new String("bUrGeR");
		String favFood5 = new String("Zach thinks a burger is the best!");

		//Examples of methods of String Class
		System.out.println(favFood.length()); 
		System.out.println(favFood.charAt(2)); //char charAt (int index) 

		System.out.println(favFood.equals(favFood2)); //boolean equals (String str)
		System.out.println(favFood.equals(favFood3));
		System.out.println(favFood.equalsIgnoreCase(favFood4));//boolean equalsIgnoreCase (String str)

		System.out.println(favFood.toUpperCase()); //String toUpperCase ()
		System.out.print(favFood5.substring(0, 4)); 
		System.out.println(favFood5.substring(20, 33)); //String substring (int offset, int endIndex)

		String phrase = new String ("Change is inevitable");
		String mutation1, mutation2, mutation3, mutation4;

		System.out.println("Original String: \"" + phrase + "\"");
		System.out.println("Length of String: " + phrase.length());

		//Created an object
		Random generator = new Random();

		//ObjectName.Method()
		int random1;
		double random2;

		//nextInt(n) creates a number from 0 to n (basically defines the range)
//		random1 = generator.nextInt(10);
//		System.out.println ("From 0 to 9: " + random1);
//
//		random1 = generator.nextInt(10) + 1;
//		System.out.println ("From 1 to 10: " + random1);
//
//		random1 = generator.nextInt(15) + 20;
//		System.out.println ("From 20 to 34: " + random1);
//
//		random1 = generator.nextInt(20) - 10;
//		System.out.println ("From -10 to 9: " + random1);
//
//		//nextDouble gives a double between 0-1
//		random2 = generator.nextDouble();
//		System.out.println ("A random double [between 0-1]: " + random2);
//
//		random2 = generator.nextDouble() * 6;  // 0.0 to 5.999999
//		random1 = (int) random2 + 1;
//		System.out.println ("From 1 to 6: " + random1);
//
//		random1 = generator.nextInt(10);
//		System.out.println ("From 0 to 9: " + random1);
//
//		random1 = generator.nextInt(10) + 1;
//		System.out.println ("From 1 to 10: " + random1);
//
//		random1 = generator.nextInt(15) + 20;
//		System.out.println ("From 20 to 34: " + random1);
//
//		random1 = generator.nextInt(20) - 10;
//		System.out.println ("From -10 to 9: " + random1);
//
//		random2 = generator.nextDouble();
//		System.out.println ("A random double [between 0-1]: " + random2);
//
//		random2 = generator.nextDouble() * 6;  // 0.0 to 5.999999
//		random1 = (int) random2 + 1;
//		System.out.println ("From 1 to 6: " + random1);
//
//		int result1 = generator.nextInt(38) + 1;
//		System.out.println(result1);
//
//		int trial = 0;
//		while (trial < 100){
//			if (result1 % 2 == 0) {
//				System.out.println("Trial: " + trial + " The result is even: " + result1 );
//			} else {
//				System.out.println("Trial: " + trial + " The result is odd: "+ result1);
//			}
//
//			trial += 1;
//			result1 = generator.nextInt(38) + 1;
//
//		}
		//echo.java
		//		String message;
		//		Scanner scan = new Scanner (System.in);
		//
		//		System.out.println ("Enter a line of text:");
		//
		//		message = scan.nextLine();
		//
		//		System.out.println ("You entered: \"" + message + "\"");

		//quadratic equation
//		double a, b, c;  // ax^2 + bx + c
//		Scanner scan1 = new Scanner (System.in);
//
//		System.out.print ("Enter the coefficient of x squared: ");
//		a = scan1.nextDouble();
//
//		System.out.print ("Enter the coefficient of x: ");
//		b = scan1.nextDouble();
//
//		System.out.print ("Enter the constant: ");
//		c = scan1.nextDouble();

		// Use the quadratic formula to compute the roots.
		// Assumes a positive discriminant.

//		double discriminant = Math.pow(b, 2) - (4 * a * c);
//		double root1, root2;
//
//		if (discriminant > 0){
//			root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
//			root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
//			System.out.println ("Root #1: " + root1);
//			System.out.println ("Root #2: " + root2);
//		} else if (discriminant == 0){
//			root1 = (-1 * b) + (2 * a);
//			System.out.println("Root #1: " + root1);
//		} else {
//			System.out.println("No Real Solutions");
//		}

		//Price.java
//		final double TAX_RATE = 0.06;  // 6% sales tax
//
//		int quantity;
//		double subtotal, tax, totalCost, unitPrice;
//		Scanner scan = new Scanner (System.in);
//
//		System.out.print ("Enter the quantity: ");
//		quantity = scan.nextInt();
//
//		System.out.print ("Enter the unit price: ");
//		unitPrice = scan.nextDouble();
//
//		subtotal = quantity * unitPrice;
//		tax = subtotal * TAX_RATE;
//		totalCost = subtotal + tax;

		// Print output with appropriate formatting
//		NumberFormat money = NumberFormat.getCurrencyInstance();
//		NumberFormat percent = NumberFormat.getPercentInstance();
//
//		System.out.println ("Subtotal: " + money.format(subtotal));
//		System.out.println ("Tax: " + money.format(tax) + " at "
//				+ percent.format(TAX_RATE));
//		System.out.println ("Total: " + money.format(totalCost));

		//CircleStats.java
		double radius;
		double area, circumference;

		Scanner scan = new Scanner (System.in);

		System.out.print ("Enter the circle's radius: ");
		radius = scan.nextDouble();

		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;

		// Round the output to three decimal places
		DecimalFormat fmt = new DecimalFormat ("0.##"); //how to define the decimal place

		System.out.println ("The circle's area: " + fmt.format(area));
		System.out.println ("The circle's circumference: "
				+ fmt.format(circumference));
	}

}
