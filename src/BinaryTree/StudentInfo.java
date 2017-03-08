package BinaryTree;

public class StudentInfo {
	
	private StudentInfo left;
	private StudentInfo right;
	
	private int studentNumber;
	private String firstName;
	private String lastName;
	
	public void setStudent( int number, String fName, String lName) {
		studentNumber = number;
		firstName = fName;
		lastName = lName;
	}
	
	public void setStudentNumber( int arg ) {
		studentNumber = arg;
	}
	
	public void setFirstName( String arg ) {
		firstName = arg;
	}

	public void setLastName( String arg ) {
		lastName = arg;
	}

	public void setLeft( StudentInfo arg ) {
		left = arg;
	}
	
	public void setRight( StudentInfo arg ) {
		right = arg;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public StudentInfo getLeft() {
		return left;
	}
	
	public StudentInfo getRight() {
		return right;
	}
	
}
