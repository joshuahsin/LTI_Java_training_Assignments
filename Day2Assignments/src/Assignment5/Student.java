package Assignment5;

public class Student {
	private int studentId;
	private char studentType;
	
	public Student() {
		
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
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setStudentId(1);
		student.setStudentType('S');
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
	}
}
