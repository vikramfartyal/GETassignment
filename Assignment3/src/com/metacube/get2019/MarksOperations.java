package com.metacube.get2019;

/**
 * It is a class which has methods to find average, maximum, minimum and
 * percentage of grades
 * @author Admin
 *
 */
public class MarksOperations {

	/**
	 * It is a method which is used to find average of grades.
	 * @param grades of students
	 * @param numberOfStudents
	 * @return average of grades of students
	 */
	public float averageOfGrades(float[] grades_arr, int numberOfStudents) {
		float average = 0;
		float sum = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			sum += grades_arr[i];
		}
		try {
			average = sum / numberOfStudents;
		} catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}
		return average;
	}

	/**
	 * It is a method which is used to find maximum among grades of students.
	 * @param grades of students
	 * @param numberOfStudents
	 * @return maximum of grades among grades of all students.
	 */
	public float maxOfgrades(float[] grades_arr, int numberOfStudents) {
		float maxOfGrades = grades_arr[0];
		for (int i = 0; i < numberOfStudents; i++) {
			if (maxOfGrades < grades_arr[i]) {
				maxOfGrades = grades_arr[i];
			}
		}
		return maxOfGrades;
	}

	/**
	 * It is a method which is used to find minimum among grades of students.
	 * @param grades of students
	 * @param numberOfStudents
	 * @return minimum of grades among grades of all students.
	 */
	public float minOfGrades(float[] grades_arr, int numberOfStudents) {
		float minOfGrades = grades_arr[0];
		for (int i = 0; i < numberOfStudents; i++) {
			if (minOfGrades > grades_arr[i]) {
				minOfGrades = grades_arr[i];
			}
		}
		return minOfGrades;
	}

	/**
	 * It is a method which is used to find percentage of students.
	 * @param grades of students
	 * @param numberOfStudents
	 * @return percentage
	 */
	public float percentageOfPassStudents(float[] grades_arr, int numberOfStudents) {
		int numberOfStudentsPass = 0;
		float percentageOfPassStudents = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			if(Float.compare(grades_arr[i], 40) > 0) {
				numberOfStudentsPass++;
			
			}
		}
		try {
			percentageOfPassStudents = ((float)numberOfStudentsPass/(float)numberOfStudents)*100;
		} catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}
		return percentageOfPassStudents;
	}
}

