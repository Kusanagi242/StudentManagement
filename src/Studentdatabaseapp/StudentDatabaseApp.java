package Studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many users we want to add ?
		System.out.print("Enter numbers of students: ");
		Scanner scan = new Scanner(System.in);
		int numOfStudents = scan.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of new student
		for(int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		for(int i = 0; i < numOfStudents; i++)
		{
			System.out.println(students[i].toString());
		}
		
	}

}
