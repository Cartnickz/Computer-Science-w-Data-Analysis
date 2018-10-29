import java.util.Scanner;

public class MetamorphicGrades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What temperature was your rock in?: ");
		double temperature = input.nextDouble();

		System.out.println("What pressure was your rock experiencing?: ");
		double pressure = input.nextDouble();

		if (temperature < 200) {
			if (pressure < 2 && pressure > 0){
				System.out.println("Non-Metamorphic");
			}
		} else if (temperature > 200 && temperature < 450) {

		} else if (temperature > 450 && temperature < 600) {

		} else if (temperature > 600 && temperature < 1000) {

		}
		
		input.close();
	}
}