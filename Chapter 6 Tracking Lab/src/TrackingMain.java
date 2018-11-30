import java.util.Arrays;
import java.util.Scanner;

public class TrackingMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] sales = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Price " + (i + 1) + ":");
			sales[i] = input.nextDouble();
		}
		
		System.out.println(Arrays.toString(sales));
		
		//find max
		double max = 0;
		
		for (int i = 0; i < 4; i++) {
			if (sales[i] >= sales [i + 1]) {
				max = sales[i];
			} else {
				max = sales[i+1];
			}
		}
		
		System.out.println(max);
	}

}
