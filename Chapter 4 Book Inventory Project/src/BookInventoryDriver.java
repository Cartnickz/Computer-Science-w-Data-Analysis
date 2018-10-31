
public class BookInventoryDriver {

	public static void main(String[] args) {
		BookInventory bandOfBrothers = new BookInventory("Band of Brothers", 9.99, 336, 12, 5, 427);
		BookInventory grendel = new BookInventory("Grendel", 7.99, 194, 3, 4, 325);
		BookInventory jekyllHyde = new BookInventory("The Strange Case of Dr. Jekyll and Mr. Hyde", 2.99, 55);
	
		System.out.println(bandOfBrothers.getBookTitle());
		System.out.println(bandOfBrothers.getCopies());
		System.out.println(bandOfBrothers.getRating());
		
		System.out.println(grendel.setBookTitle("gReNdEl");
		System.out.println(grendel.setPageTotal(newPageTotal););
	
	}
}
