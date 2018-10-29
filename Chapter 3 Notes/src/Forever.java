//********************************************************************
//  Forever.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates an INFINITE LOOP.  WARNING!!
//********************************************************************

public class Forever {
	//-----------------------------------------------------------------
	//  Prints ever-decreasing integers in an INFINITE LOOP!
	//-----------------------------------------------------------------
	public static void main (String[] args) {
		int count = 1;

		while (count <= 25)
		{
			count = count - 1;
			if (count % 100000 == 0) {
				System.out.println(count);
			}
		}
		System.out.println(count);
		System.out.println ("Done");  // this statement is never reached
	}
}
