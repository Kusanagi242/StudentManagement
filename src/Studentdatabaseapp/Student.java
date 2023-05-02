package Studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: Prompt users to enter student's name and year
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1. Freshman \n"
						+ "2. Sophmore \n"
						+ "3. Junior \n"
						+ "4. Senior \n"
						+ "Enter student class level: ");
		this.gradeYear = in.nextLine();
		setStudentID();
		
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}
	// Generate ID
	private void setStudentID() {
		// Student ID = Grade level + ID
		id++;
		this.studentID =  gradeYear + id;
		
	}
	// Enroll this class
	public void	enroll() {
		// Get inside the loop, user hit 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			
			if(!course.toUpperCase().equals("Q")) {
				courses = "." + courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				System.out.println("Submit done !");
				break;
			}

		}while(1 != 0);
		//System.out.println("ENROLLED IN :" + courses);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance + " $");
	}
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner(System.in);

		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of " + payment);
		viewBalance();
		
	}
	// Show status
	public String toString() {
		return "----------------------------------------------------------" +
				"\nPrint the information:" +
				"\nName: " + firstName + " " + lastName +
				"\nGrade Year: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: " + tuitionBalance + " $";
	}
}
