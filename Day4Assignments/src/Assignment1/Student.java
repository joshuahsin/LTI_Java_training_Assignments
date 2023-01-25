package Assignment1;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
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
	
	public static void main(String[] args) {
		System.out.println("Hostelite");
		Hostelite h = new Hostelite(1, 'F', "Josh", 500, "Best Western", 65);
		System.out.println(h.getStudentId());
		System.out.println(h.getStudentType());
		System.out.println(h.getStudentName());
		System.out.println(h.getFeesPerMonth());
		System.out.println(h.getHostelName());
		System.out.println(h.getRoomNumber());
	}
}
