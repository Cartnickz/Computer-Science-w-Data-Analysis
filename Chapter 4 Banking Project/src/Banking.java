//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class Banking {
	//-----------------------------------------------------------------
	//  Creates some bank accounts and requests various services.
	//-----------------------------------------------------------------
	public static void main (String[] args) {
		// Using constructor to initialize three bank accounts
		Account acct1 = new Account ("Joe Schmoe", 72354, 102.56);
		Account acct2 = new Account ("College Student", 69713, 40.00);
		Account acct3 = new Account ("Rich Person", 93757, 798159.32);

		// Verify that getBalance, deposit, and withdraw methods are working
		System.out.println ("Joe Schmoe's initial balance: " +
				acct1.getBalance());

		acct1.deposit (25.85);
		System.out.println ("Joe Schmoe's balance after deposit: " +
				acct1.getBalance());

		System.out.println();

		acct2.deposit (500.00);
		System.out.println ("College student's balance after deposit: " +
				acct2.getBalance());

		acct2.withdraw (2.75, 1.50);
		System.out.println ("College student's balance after withdrawal: " + 
				acct2.getBalance());

		System.out.println();

		acct3.deposit (50000.00);
		System.out.println ("Rich person's balance after deposit: " +
				acct3.getBalance());

		System.out.println();

		acct1.withdraw (800.00, 0.0);  // exceeds balance and should give warning

		System.out.println();

		// Verify that getAccountNumber method is working
		System.out.println("Joe Schmoe's account number: " + acct1.getAccountNumber());
		System.out.println("College student's account number: " + acct2.getAccountNumber());
		System.out.println("Rich person's account number: " + acct3.getAccountNumber());

		// Add interest to all three accounts
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();

		System.out.println();

		// Make sure that new balance reflects added interest
		System.out.println(acct1.getBalance());
		System.out.println(acct2.getBalance());
		System.out.println(acct3.getBalance());

		System.out.println ();

		// Using the toString method.
		System.out.println (acct1);
		System.out.println (acct2);
		System.out.println (acct3);
	}
}

