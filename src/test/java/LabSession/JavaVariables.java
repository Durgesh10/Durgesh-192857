package LabSession;

public class JavaVariables {
	
	static String employeeBu = "HR";
	
	
	public static void employeedetails() {
		//local variables
		
		System.out.println(employeeBu);
	}
	public void employeedetails1() {
		//local variables
		String employeeName="Durgesh";
		System.out.println(employeeName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeedetails();
		JavaVariables test = new JavaVariables();
		test.employeedetails1();

	}

}
