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
	
	public void setStudent( StudentInfo arg ) {
		studentNumber = arg.studentNumber;
		firstName = arg.firstName;
		lastName = arg.lastName;
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
		return this.studentNumber;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public StudentInfo getLeft() {
		return this.left;
	}
	
	public StudentInfo getRight() {
		return this.right;
	}
	
}
