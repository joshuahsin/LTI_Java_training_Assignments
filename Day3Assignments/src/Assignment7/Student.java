package Assignment7;

public class Student {
	private int studentId;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
	public Student() {
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String firstName, String lastName) {
		studentName = firstName + " " + lastName;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudentId(Integer.parseInt(args[0]));
		stu.setStudentName(args[1], args[2]);
		stu.setResidentialStatus(args[3]);

		if(args[3].equals("H")) {
			stu.setFeesPerMonth(Integer.parseInt(args[4]) + Integer.parseInt(args[5]));
		}
		else {
			stu.setFeesPerMonth(Integer.parseInt(args[4]));
		}
		
		System.out.println(stu.getStudentId());
		System.out.println(stu.getStudentName());
		System.out.println(stu.getResidentialStatus());
		System.out.println(stu.getFeesPerMonth());
	}
}
