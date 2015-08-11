package library;

public class Book {
	private String title;
	private String author;
	private int pages;

	public Book() {
		super();
	}

	public Book(String title, String author, int pages) {
		super();
		setTitle(title);
		setAuthor(author);
		setPages(pages);
		
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

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		 return "\nTitle-> "+this.title + " - " + "\nAuthor-> " + this.author + " - "+ "\nPages-> "+this.pages;
   }

}
