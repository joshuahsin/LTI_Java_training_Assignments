package Assignment9;

public class Student {
	private int studentId;
	private static int currentId = 550;
	private char studentType;
	private String studentName;
	
	public Student() {
		studentId = currentId;
		currentId++;
	}
	
	Student(char sType, String fname, String lname) {
		this();
		studentType = sType;
		studentName = fname + " " + lname;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int student) {
		this.studentId = student;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static void displayDetails(Student stu) {
		System.out.println("Student [studentId=" + stu.getStudentId() + ", studentType=" + stu.getStudentType() + ", studentName=" + stu.getStudentName()
				+ "]");
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		displayDetails(studentOne);
		
		Student studentTwo = new Student('H', "Dinil", "Bose");
		displayDetails(studentTwo);
	}
}
