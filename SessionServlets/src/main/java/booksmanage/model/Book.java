package booksmanage.model;

public class Book {
	
	private int id;
	
	private String title;
	
	private String author;
	
	private String quantity;
	
	private String price;

	public Book(int id, String title, String author, String price, String qty) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;

		this.quantity = qty;
		this.price = price;
	}
	
	public Book(String title, String author, String price, String qty) {
		super();
		this.title = title;
		this.author = author;
		this.quantity = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
