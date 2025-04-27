package studentSorting;

import java.util.ArrayList;

public class NumericSorting {

	/**
	 * Sorts The List Of Students by Student ID from smallest to largest
	 * @param studentList List Of Student Objects held in an ArrayList
	 */
	public static void numericSorting(ArrayList<Student> studentList) {

		Student temp;
		int n = studentList.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (studentList.get(i).getRollNo() > studentList.get(j).getRollNo()) {

					temp = studentList.get(i);
					studentList.set(i, studentList.get(j));
					studentList.set(j, temp);
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			String stringToGet = studentList.get(i).toString();
			System.out.println(stringToGet);
		}
	}
}
