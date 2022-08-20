package assignments.week3.day1.org.student;

import assignments.week3.day1.org.college.College;
import assignments.week3.day1.org.department.Department;

public class Student extends Department {

	// Add a Method: Student Name
	public void studentName(String studentName) {
		System.out.println("Student Name: " + studentName);
	}

	// Add a Method: Student Department Name
	public void studentDept(String studentDeptName) {
		System.out.println("Student Department Name: " + studentDeptName);
	}

	// Add a Method: Student ID
	public void studentID(int studentID) {
		System.out.println("Student ID: " + studentID);
	}

	// Main Method
	public static void main(String[] args) {

		// Create an Object for Class: College and Call all methods present in CollegeClass
		College college = new College();
		System.out.println("Methods belongs to Class:College");
		// call method present in college class
		college.collegeName("Anna University");
		college.collegeCode(10021);
		college.collegeRank(2);
		System.out.println("");

		// Create an Object for Class: Department and Call all methods present in College and Department Class
		Department department = new Department();
		System.out.println("Methods belongs to Class: Department and inherited Class: College");
		// call method present in department class
		department.deptName("Computer Science");
		// call methods present in college class
		department.collegeName("Anna University");
		department.collegeCode(10021);
		department.collegeRank(2);
		System.out.println("");

		// Create an Object for Class: Student and Call all methods present in College,Department and Student Class
		Student student = new Student();
		System.out.println("Methods belongs to Class: Student and inherited Class: College & Department");
		// call method present in department class
		student.deptName("Computer Science");
		// call methods present in college class
		student.collegeName("Anna University");
		student.collegeCode(10021);
		student.collegeRank(2);
		// call methods present in college class
		student.studentID(1035);
		student.studentName("Saraswathi Krishnan");
		student.studentDept("Computer Science");

	}

}
