package Model;

public class Book implements Comparable<Book>{
	private int bookid;
	private String name;
	private String author;
	private int price;
	private int quantity;
	
	public Book(int bookid, String name, String author, int price, int quantity) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	

}
