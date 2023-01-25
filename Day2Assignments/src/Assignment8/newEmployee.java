package Assignment8;

public class newEmployee {
	int i;
	int j;
	
	public newEmployee(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public boolean validAge() {
		if(i > 20 && i < 30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validIdNumber() {
		if(j >= 14000 && j < 20000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		newEmployee newEmployeeCheck = new newEmployee(22, 14000);
		
		boolean k = newEmployeeCheck.validAge();
		boolean l = newEmployeeCheck.validIdNumber();
		
		if(k == true && l == true) {
			System.out.print(" Is a new employee");
		}
		else {
			System.out.print(" Is not a new employee");
		}
	}
}
