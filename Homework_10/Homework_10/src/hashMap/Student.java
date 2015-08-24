package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String firstName;
	private String lastName;
	private int number;
	private static HashMap<String, ArrayList<Double>> grades = new HashMap<String, ArrayList<Double>>();

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, int number, HashMap<String, ArrayList<Double>> grades) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		setGrades(grades);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HashMap<String, ArrayList<Double>> getGrades() {
		return grades;
	}

	public void setGrades(HashMap<String, ArrayList<Double>> grades) {
		Student.grades = grades;
	}
	
	
	@Override
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName + " | number: " + this.number + " | gades: " + grades;
	}

	public void addSubjectMark(String Subject, double mark) {
		if (grades.containsKey(Subject)) {
			grades.get(Subject).add(mark);
		}
	}

	public static double calculateAverageMark(String Subject) {
		double average = 0;
		double all = 0;
		int count = 0;
		ArrayList<Double> gradesOnSubj = grades.get(Subject);
		if (grades.containsKey(Subject)) {
			while (count != gradesOnSubj.size()) {
				all += gradesOnSubj.get(count);
				count++;
			}
			average = all / gradesOnSubj.size();
		}
		return average;

	}
	
	
}