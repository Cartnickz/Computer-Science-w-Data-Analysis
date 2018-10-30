import java.util.Scanner;

public class Student {
	//set instance variables
	private String studentName;
	private int testScore1;
	private int testScore2;
	
	Scanner input = new Scanner(System.in);
	
	//constructor
	public Student(String name) {
		studentName = name;
	}
	
	public void inputGrades() {
		System.out.println("Enter " + studentName + "'s score for Test 1: ");
		testScore1 = input.nextInt();
		
		System.out.println("Enter " + studentName + "'s score for Test 2: ");
		testScore2 = input.nextInt();
	}
	
	public double getAverage() {
		return (testScore1 + testScore2)/2.0;
	}
	
	public String getName() {
		return studentName;
	}
	
	public String toString(){
		return "Name: " + studentName + "\tTest 1: " + testScore1 + "\tTest 2: " + testScore2;
	}
	
}
