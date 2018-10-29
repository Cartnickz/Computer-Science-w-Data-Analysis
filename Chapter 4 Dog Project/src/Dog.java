
public class Dog {
	
	//set instance variables
	private String name; //private means that it can only be used in this class
	private String owner;
	private int age;
	private int weight;
	
	
	//contructor - initializes object; MUST be public and MUST match class name
	public Dog(String name, String owner, int age, int weight ) { // formal parameters - must give class these things in this order 
		this.name = name; //take input user gave me and set it to those instance variables
		this.owner = owner;
		this.age = age;
		this.weight = weight;
	}
	
	//writing a method
	//if a method is private, it can only be found in this class
	//public allows the class to be seen anywhere
	
	//visibility modifier - return type - name of method
	//  visibility modifier "public"
	//  return type - what the program returns "void = doesn't return anything"
	//  name of method "bark()"
	
	public void bark() {
		if (weight > 50) {
			System.out.println("woof");
		} else {
			System.out.println("yeet");
		}
	}
	
	//asks user for name of new dog and replaces owner
	public void setOwner(String newOwner) {
		owner = newOwner;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	//returns the value of a specific instance variable of an object
	public String getOwner() {
		return owner;
	}
	
	public int getAge() {
		return age;
	}
	
	//toString method is called when the class is asked to print out an object
	//can return anything - put at bottom of class
	public String toString() {
		return (name + "\t" + owner + "\t" + age + "\t" + weight);
		
	}
}
