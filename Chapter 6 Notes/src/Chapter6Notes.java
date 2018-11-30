
public class Chapter6Notes {

	public static double calcAverage(int[] grades) {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / grades.length;
	}

	public static void main(String[] args) {
		//arrays must have values of the same data type + cannot be resized
		int[] heights = new int[5]; //sets aside space in memory for 5 integers

		//when youre unsure of what to put in when you create the array, you can set a size and enter values manually
		heights[0] = 70;
		heights[1] = 60;
		heights[2] = 50;
		heights[3] = 68;
		heights[4] = 34;

		//find how many values are in an array
		double[] temps = {34.5, 76.4, 23.6, 65.8, 83.8};
		int numTemps = temps.length; //length here is an attribute, not a method - don't include ()
		System.out.println(numTemps);

		//list values in an array
		for(int i = 0; i < numTemps; i++) {
			System.out.println(temps[i]);
		}

		System.out.println(java.util.Arrays.toString(temps));

		//test calcAverage()
		int[] mp1 = {98, 97, 21, 100, 100};
		System.out.println(calcAverage(mp1));

		//Prime.java
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};

		System.out.println ("Array length: " + primeNums.length);
		System.out.println ("The first few prime numbers are:");
		
		for (int prime: primeNums){ //cycle through all values of primeNums and temporarily assign the current value to prime
			System.out.println (prime);
		}
		System.out.println ();
		System.out.println(args[0]);
		
	}

}
