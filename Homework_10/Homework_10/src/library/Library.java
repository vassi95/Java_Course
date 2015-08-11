package library;
import java.util.ArrayList;
import java.util.TreeMap;

public class Library {
	private String name;
	private String address;
	private TreeMap<String, ArrayList<Book>> map = new TreeMap<String, ArrayList<Book>>();
	ArrayList<Book> list = new ArrayList<Book>();

	public Library() {
		super();
	}

	public Library(String name, String address, TreeMap<String, ArrayList<Book>> map) {
		super();
		setName(name);
		setAddress(address);
		setMap(map);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TreeMap<String, ArrayList<Book>> getMap() {
		return map;
	}

	public void setMap(TreeMap<String, ArrayList<Book>> map) {
		this.map = map;
	}

	public String toString() {
		return "Library-> " + name + "| address-> " + address + "| books-> " + list;
	}

	public void addBook(String name, String author, int pages) {

		Book book = new Book(name, author, pages);
		list.add(book);
	}

	public void removeBook(String name) {
		for (Book book : list) {
			if (book.getTitle().equals(name)) {
				list.remove(book);
			}
		}
	}

}
