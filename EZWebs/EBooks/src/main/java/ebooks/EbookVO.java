/*
 * MemberVO : Value Object
 * TABLE : MEMBER
 */
package ebooks;

public class EbookVO {
	private int serial;
	private String title;
	private String author;
	private int price;
	private int qty;
	
	EbookVO() {}

	public EbookVO(int serial, String title, String author, int price, int qty) {
		super();
		this.serial = serial;
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	
}