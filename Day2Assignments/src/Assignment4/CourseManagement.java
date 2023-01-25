package Assignment4;

public class CourseManagement {
	public static void main(String[] args) {
		int id = 1;
		char type = 'F';
		
		Student stu = new Student();
		stu.setStudentId(id);
		stu.setStudentType(type);
		
		System.out.println(stu.getStudentId());
		System.out.println(stu.getStudentType());
	}
}
