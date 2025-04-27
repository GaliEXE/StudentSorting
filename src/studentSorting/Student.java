package studentSorting;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	/**
	 * Initialize Student Variables
	 */
	int rollno;
	String name;
	String address;
	
	/**
	 * Student Object For Sorting
	 * @param rollno Student ID
	 * @param name Student's Name
	 * @param address Student's Address
	 */
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	/**
	 * Returns Student Info As A String.
	 */
	public String toString() {
		return "Roll #: " + rollno + " |Name: " + name + " |Address: " + address;
	}
	
	/**
	 * Name Getter for Alphabetical Sorting
	 * @return Student Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Roll Number Getter For Numerical Sorting
	 * @return Student ID Number
	 */
	public int getRollNo() {
		return rollno;
	}
	
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scnr = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		
		/**
		 * Rolls Random Numbers For Student ID's from 1-10 will also ensure that no number is selected
		 * twice.
		 */
		ArrayList<Integer> rollNumbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
		    rollNumbers.add(i);
		}
		Collections.shuffle(rollNumbers);
		
		/**
		 * User Inputs All Student Names and Addresses Here
		 */
		for(int i= 0; i < 10; i++) {
			int studentID = rollNumbers.get(i);
			System.out.println("Please Enter The Students Name: ");
			String studentName = scnr.nextLine();
			System.out.println("Please Enter The Students Address: ");
			String studentAdrs = scnr.nextLine();
			
			Student newStudent = new Student(studentID, studentName, studentAdrs);
			studentList.add(newStudent);
		}
		for(int i = 0; i<10; i++) {
			String stringToGet = studentList.get(i).toString();
			System.out.println(stringToGet);
		}
		
		/**
		 * Sort Menu allows you to choose which way you would like to
		 * view the list of students and allows you to exit the program.
		 */
		System.out.println("You Can View This List Sorted");
		System.out.println("To Sort By Student ID type: num");
		System.out.println("To Sort By Student Name type: name");
		System.out.println("To Close The Program type: x");
		
		boolean runProgram = true;
		
		while(runProgram == true) {
			System.out.println("COMMAND: ");
			String userInput = scnr.nextLine();
			
			
			if(userInput.toLowerCase().equals("num")) {
				NumericSorting.numericSorting(studentList);
			} else if (userInput.toLowerCase().equals("name")) {
				AlphabeticalSort.alphabeticalSort(studentList);
			} else if(userInput.toLowerCase().equals("x")){
				scnr.close();
				runProgram = false;
			} else {
				System.out.println("Invalid Command");
			}	
		}
	}
}
