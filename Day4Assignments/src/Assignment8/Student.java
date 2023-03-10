package Assignment8;

import Assignment8.DayScholar;
import Assignment8.Hostelite;

public abstract class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student() {
		super();
	}

	public Student(int studentId, char studentType, String studentName, double feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void displayStudentDetails() {
		System.out.println("studentId=" + studentId);
		System.out.println("studentType=" + studentType);
		System.out.println("studentName=" + studentName);
		System.out.println("feesPerMonth=" + feesPerMonth);
	}
	
	public abstract void calculateFees(double semesterFees);

	public static void main(String[] args) {
		Student student;
		if(args[0].equals("H")) {
			student = new Hostelite(1, 'F', "Joey", 500, "Best Western", 25);
		}
		else {
			student = new DayScholar(1, 'F', "Joey", 500, "250 W 5th St");
		}
		student.calculateFees(1200.0);
		student.displayStudentDetails();
	}
}
