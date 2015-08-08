package countries;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Capitals {
	public static void main(String[] args) {

		String path1 = "files/countries.txt";
		String path2 = "files/capitals.txt";
		readFile(path1, path2);
	}

	public static void readFile(String path1, String path2) {
		try {
			String answer;
			FileReader fileReader = new FileReader(path1);
			Scanner input = new Scanner(System.in);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				System.out.printf("What is tha capital of %s?\n", line);
				answer = input.nextLine();
				writeFile(answer, path2);
			}
			input.close();
			bufferedReader.close();

		} catch (Exception exc) {
			System.out.println("Error while reading the file.");
			return;

		}
	}

	public static void writeFile(String answer, String path) {
		try {
			FileWriter fileStream = new FileWriter(path, true);

			BufferedWriter write = new BufferedWriter(fileStream);
			write.write(answer);
			write.newLine();
			write.close();

		} catch (Exception e) {
			System.out.println("Error while writing the file.");
			return;
		}
	}
}