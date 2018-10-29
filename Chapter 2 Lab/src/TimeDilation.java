
public class TimeDilation {
	public static void main(String[] args) {
		
		//  Calculates the time of travel observed by an outsider given the
		//   traveler's velocity, time passed in their frame of reference, and
		//   the speed of light.   
		
		final double C = 3000000; 
		double percentV = 0.01;  //can be modified based on desired percentage of C 
		double v = C * percentV;
		final double TTRAVELER = 100;
		
		double tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		
		System.out.println("Time Observed:\t\tPercentage:\tVelocity:");
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.10;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.50;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.90;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.95;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.99;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.999;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v);
		
		percentV = 0.9999;
		v = C * percentV;
		tObserver = TTRAVELER/(Math.sqrt(1-(Math.pow(v, 2)/Math.pow(C, 2))));
		System.out.println(tObserver + "\t" + percentV + "\t\t" + v + "\n");
	}
}

