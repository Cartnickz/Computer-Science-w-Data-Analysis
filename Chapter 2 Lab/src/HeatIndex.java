
public class HeatIndex {
	public static void main(String[] args) {
		//Calculates how hot the air feels to the human body given humidity and temperature.

		double t = 80;
		int r = 0;
		System.out.println("Relative Humidity:\t\tHeat Index:");

		while (r <= 100) {
			double heatIndex = -42.379 + 2.04901523 * t + 10.14333127 * r
					- (0.22475541 * t * r) 
					- (6.83783 * Math.pow(10,-3) * Math.pow(t, 2))
					- (5.481717 * Math.pow(10, -2) * Math.pow(r, 2)) 
					+ (1.22874 * Math.pow(10, -3) * Math.pow(t, 2) * r)
					+ (8.5282 * Math.pow(10, -4) * t * Math.pow(r, 2))
					- (1.99 * Math.pow(10, -6) * Math.pow(t, 2) * Math.pow(r, 2));
			System.out.println("\t" + r + "\t\t\t" + heatIndex);
			r += 10;	
		}
	}
}