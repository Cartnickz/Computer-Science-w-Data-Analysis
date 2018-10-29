import java.util.Random;
public class ConditonalStatements {

	public static void main(String[] args) {
		int x, y;
		//random generator for testing
		Random gen = new Random();
		x = gen.nextInt(101) - 25;
		y = gen.nextInt(101) - 50;

		System.out.println("print" + x + "  " + y);

		if (!(x < 0) && !(y < 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
