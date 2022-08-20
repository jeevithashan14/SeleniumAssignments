package assignments.week3.day1.org.students;

/*
 *  Class: Students
    Methods: getStudentInfo()

    Description: 
    Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
 */

public class Students {
	
	//Create a Method: getStudentInfo() by passing id argument alone
	public void getStudentId(int studentId) {		
		System.out.println("Student ID: "+studentId);
	}
	
	//Create a Method: getStudentInfo() by passing by id & name argument
	public void getStudentInfo(int studentRollNo, String studentName) {
		System.out.println("Student RollNo: "+studentRollNo);
		System.out.println("Student Name: "+studentName);
	}
    
	//Create a Method: getStudentInfo() by passing by email & phoneNumber argument
	public void getStudentInfo(String studentEmail, long studentPhoneNo) {
		System.out.println("Student Email: "+studentEmail);
		System.out.println("Student PhoneNo: "+studentPhoneNo);
	}
	
	//Main Method
	public static void main(String[] args) {
		//Creating an object for class
		Students students = new Students();
		students.getStudentId(234678);
		students.getStudentInfo(57, "Saraswathi Krishnamoorthy");
        students.getStudentInfo("test@testleaf.com", 6789023456L);
	}

}
