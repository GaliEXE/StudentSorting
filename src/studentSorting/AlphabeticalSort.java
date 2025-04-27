package studentSorting;

import java.util.ArrayList;


public class AlphabeticalSort {

	/**
	 * Sorts Student Objects By Alphabetical Order
	 * @param studentList List Of Student Objects held in an ArrayList
	 */
	public static void alphabeticalSort(ArrayList<Student> studentList) {
		
		Student temp;
		int n = studentList.size();
	
		for(int i = 0; i < n - 1; i++) {
			for(int j = i+1; j < n; j++) {
				if(studentList.get(i).getName().compareTo(studentList.get(j).getName()) > 0) {
					
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
