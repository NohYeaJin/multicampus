package assignment;

public class BookDTO {

	// BookDTO 클래스가 가지고 있는 정보를 문자열로 리턴 시켜주는 toString()을 출력을 참고하여 작성

	private int isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;

	public BookDTO() {
	}

	public BookDTO(int isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return isbn + "	| " + title + "	| " + author + "	| " + publisher + "	| " + price + "	| " + desc;
	}

}
