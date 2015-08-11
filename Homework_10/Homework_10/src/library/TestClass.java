package library;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TestClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		TreeMap<String, ArrayList<Book>> treeMap = new TreeMap<String, ArrayList<Book>>();
		System.out.println("Enter the name of library: ");
		String name = input.nextLine();
		System.out.println("Enter adress of library: ");
		String address = input.nextLine();
		Library neww = new Library(name, address, treeMap);
		System.out.println(neww);

		System.out.println("Demonstration - add two book:");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the title of the book:");
			String title = input.nextLine();
			System.out.println("Enter the author:");
			String author = input.nextLine();
			System.out.println("Enter the number of pages:");
			int pages = input.nextInt();
			neww.addBook(title, author, pages);
		}
		System.out.println(neww);
		System.out.println("Demonstration - remove a book:");
		System.out.println("Enter the name of the book you want to remove:");
		String namee = input.next();
		neww.removeBook(namee);
		input.close();

	}

}
