
public class DogTester {
	public static void main(String[] args) {
		//create another dog
		//write setter and getter methods for the dog age
		
		//creating dog objects
		Dog kylerDog = new Dog("Kylerito", "Kyler", 10, 60);
		Dog adamDog = new Dog("Adamito", "Adam", 12, 35);
		Dog zachDog = new Dog("Harper", "Zach", 9, 40);
		Dog sarahDog = new Dog("Rex", 5, 20);
		
		kylerDog.bark();
		adamDog.bark();
		
		kylerDog.setOwner("Frank");
		
		System.out.println(kylerDog);
		System.out.println(kylerDog.getOwner());
		
		zachDog.setAge(12);
		System.out.println(zachDog.getAge());
		
		System.out.println(sarahDog.getOwner());
		
		zachDog.bark();
		zachDog.bark(37);
	}
}
