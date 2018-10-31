
public class BookInventory {
	private String bookTitle;
	private double price;
	private double ratingAvg;
	private int pageTotal;
	private int copies;
	private int ratingCount;
	
	
	//constructor method for all info
	public BookInventory(String bookTitle, double price, int pageTotal, int copies, double ratingAvg, int ratingCount) {
		this.bookTitle = bookTitle;
		this.price = price;
		this.pageTotal = pageTotal;
		this.copies = copies;
		this.ratingAvg = ratingAvg;
		this.ratingCount = ratingCount;
		}
	
	//secondary constructor
	public BookInventory(String bookTitle, double price, int pageTotal) {
		this.bookTitle = bookTitle;
		this.price = price;
		this.pageTotal = pageTotal;
		this.copies = 1;
		this.ratingAvg = 0;
		this.ratingCount = 0;
	}
	
	public void addInventory(int booksAdded) {
		copies =+ booksAdded;
	}
	
	public void sellInventory(int booksSold) {
		copies =- booksSold;
	}
	
	public void updateRating (int newRating) {
		double totalRating = ratingAvg * ratingCount;
		totalRating =+ newRating;
		ratingCount++;
		ratingAvg = totalRating / ratingCount;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public double getRating() {
		return ratingAvg;
	}
	
	public void setBookTitle(String newBookTitle) {
		bookTitle = newBookTitle;
	}
	
	public void setPageTotal(int newPageTotal) {
		pageTotal = newPageTotal;
	}

	public void setPrice(double newPrice) {
		double thresholdOver = price * 1.25;
		double thresholdUnder = price * .75;
		price = newPrice;
		
		if (newPrice > thresholdOver || newPrice < thresholdUnder) {
			System.out.println("WARNING: Your price was very different from your original price.");
		}
	}
	
	public String toString() {
		return "\nBook: " + bookTitle 
				+ "\tPrice: " + price 
				+ "\tPage Total: " + pageTotal
				+ "\tCount: " + copies 
				+ "\rRating: " + ratingAvg
				+ "\tRating Count: " + ratingCount;
	}
}
