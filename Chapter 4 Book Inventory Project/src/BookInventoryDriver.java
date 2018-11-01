
public class BookInventoryDriver {

	public static void main(String[] args) {
		BookInventory bandOfBrothers = new BookInventory("Band of Brothers", 9.99, 336, 12, 5, 427);
		BookInventory grendel = new BookInventory("Grendel", 7.99, 194, 3, 4, 325);
		BookInventory jekyllHyde = new BookInventory("The Strange Case of Dr. Jekyll and Mr. Hyde", 2.99, 55);
	
		//test get methods
		System.out.println("\nTesting get methods...");
		System.out.println(bandOfBrothers.getBookTitle());
		System.out.println(bandOfBrothers.getCopies());
		System.out.println(bandOfBrothers.getRating());
		
		//test addInventory & sellInventory
		System.out.println("\nTesting add and sell inventory methods...");
		System.out.println(jekyllHyde.getCopies());
		jekyllHyde.addInventory(5);
		System.out.println(jekyllHyde.getCopies());
		jekyllHyde.sellInventory(2);
		System.out.println(jekyllHyde.getCopies());
		
		//test updateRating
		System.out.println("\nTesting update ratings method...");
		System.out.println(grendel);
		grendel.updateRating(2);
		System.out.println(grendel);
		
		//test .setBookTitles
		System.out.println("\nTesting .setBookTitles method...");
		System.out.println(grendel);
		grendel.setBookTitle("gReNdEl!");
		System.out.println(grendel);
		
		//test .setPageTotal
		System.out.println("\nTesting .setPageTotal method...");
		System.out.println(jekyllHyde);
		jekyllHyde.setPageTotal(9999);
		System.out.println(jekyllHyde);
		
		//test .setPrice
		System.out.println("\nTesting .setPrice method...");
		System.out.println(jekyllHyde);
		jekyllHyde.setPrice(999.99);
		System.out.println(jekyllHyde);
		
		
	
	}
}
