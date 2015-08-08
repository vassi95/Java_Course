package EvenOddLines;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class WriteToEvenAndOdd {
	public static void main(String[] args) {
		System.out.println("Choose file for reading!");
		String path1 = chooseDirectory();
		System.out.println("Choose file for writing the even lines!");
		String path2 = chooseDirectory();
		System.out.println("Choose file for writing the odd lines!");
		String path3 = chooseDirectory();
		readFile(path1, path2, path3);
	}

	public static String chooseDirectory() {
		JFrame parentFrame = new JFrame();
		String path = "";
		JFileChooser fileChooser = new JFileChooser();
		int userSelection = fileChooser.showSaveDialog(parentFrame);

		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			path = fileToSave.getAbsolutePath();
		}
		return path;
	}

	public static void readFile(String path1, String path2, String path3) {
		try {
			FileReader fileReader = new FileReader(path1);
			Scanner input = new Scanner(System.in);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int lineCounter = 1;
			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				if (lineCounter % 2 == 0) {
					writeFile(line, path2);
				} else {
					writeFile(line, path3);
				}
				lineCounter++;
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
