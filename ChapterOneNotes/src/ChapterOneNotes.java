public class ChapterOneNotes {
	public static void main(String[] args) {
		
	// Examples of different data types
		
		// 32-bit, can only take integers
		int age = 18; 
		
		// 64-bit, can take decimals
		double temp = 75.6; 
		
		// "S" in "String" must be uppercase, used for text
		String firstName = "Zach"; 
		String lastName = "Cartnick";
		
		// only takes true and false, make name descriptive
		boolean isWarm = true;
		
		// when doing math operations, using int values will result in an int value
		int x = 22;
		int y = 7;
		
		System.out.println(x/y); //answer is 3
	
	// Math Operations
		
		// Mod Operator (%)
		int remainder = 25 % 3; 
		
		System.out.println(remainder); // answer should be 1
		
		// Power (Math.pow)
		double base = 2;
		double power = 5;
		double value = Math.pow(base, power);
		
		System.out.println(value); // answer should be 32
		
		// Mod Operator Application (LAB #1)
		int evenTest = 7492;
		
		if (evenTest % 2 == 0){
			System.out.println("The result is even!");
		} else {
			System.out.println("The number is odd");
		}
		
		// Properties of a Circle (LAB #2)
		int radius = 14;
				
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("The circumference of the circle is: " + circumference);
		System.out.println("The area of the circle is: " + area);
		
		// Greatest Number (LAB #3)
		double num1 = Math.random(); //Math.random() generates a random number between 0 and 1
		double num2 = Math.random();
		double num3 = Math.random();
		
		System.out.println("Your first number is: " + num1);
		System.out.println("Your second number is: " + num2);
		System.out.println("Your third number is: " + num3);
		
		if (num1 > num2 && num1 > num3){
			System.out.println("Your first number is the greatest.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Your second number is the greatest.");
		} else {
			System.out.println("Your third number is the greatest");
		}
		
	// Conditional Statements
		
		// if statements - GPA acknowledger
		double gpa = 3.8;
		
		if (gpa > 3.0) {
			System.out.println("Good Job!");
		}
		
		// if/else statement - Balance checker
		double yourBalance = 0.01;
		double adamBalance = 0.001;
		
		if (yourBalance > adamBalance) {
			System.out.println("nice");
		} else {
			System.out.println("nope");
		}
		
		// OR statements (|| = OR operator)
		int a = 3, b = 4;
		if (a > 10 || b <= 5) {
			System.out.println("One of these statements is true");
		}
		
		// AND statement (&& = AND operator)
		if (a == 3 && b == 2) {
			System.out.println();
		}
		
	//Printing strings using variables
		
		String favFood = "Pizza";
		String name = "Dudeman";
		
		System.out.println("Someone named " + name + " liked " + favFood + ".");
		
		// Variable can be overwritten; will be used with new value for lines of code underneath; cannot change data type
		favFood = "NOT pizza";
		
		System.out.println("Someone named " + name + " likes " + favFood + ".");
		
	// To comment large chunks of code, highlight text and hit ctrl + /
		
//				this is a
//				clunk of code that
//				i would like to comment
//				easily
		
	/* Tips and Info
		- Don't put two completely different classes in the same project
		- Don't mess with JRE Library
		- Don't forget main method
		- Sometimes IDE will think a piece of code is wrong but i might ujst be unsaved
		- If you close a window, you can go to Window -> Reset Perspective to fix
		- Classes and Variable names CANNOT have spaces but project names can
		- Don't overuse comments; only use it to explain general processes (if its an equation, don't reiterate math, explain why the equation is being used)
		- "*" next to the class name = UNSAVED
		- With multiple programs: Right-click project -> Run As -> Java Application
		- Close Projects when not in use
		- To automatically add main method, type "ma" and ctrl + space
		- Ctrl + F11 will run current program
		- To fix indentation, select all (Ctrl + A), and hit Ctrl
	*/
		
	}
}
