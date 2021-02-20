public class Book {
	private String title;
	private String author;
	private String publisher;
	private String copyright;

	public Book(String title, String author, String publisher, String copyright) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copyright = copyright;
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

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	
	public String toString() {
		String bookInfo = "Title: " + title + '\n';
		bookInfo += "Author: " + author + '\n';
		bookInfo += "Publisher: " + publisher + '\n';
		bookInfo += "Copyright: " + copyright + '\n';
		return bookInfo;
	}
}
