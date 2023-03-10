package Day4Assignments;

public class Hostelite extends Student {
	private String hostelName;
	private int roomNumber;
	
	public Hostelite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hostelite(int studentId, char studentType, String studentName, double feesPerMonth, String hostelName,
			int roomNumber) {
		super();
		/*this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;*/
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("hostelName=" + hostelName);
		System.out.println("roomNumber=" + roomNumber);
	}
}
