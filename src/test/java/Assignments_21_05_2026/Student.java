package Assignments_21_05_2026;

public class Student {

  String name;
  int age;
  int rollNumber;
  
  public void displayDetails() {
	  System.out.println("Student name : "+name);
	  System.out.println("Student age : "+age);
	  System.out.println("Student rollNumber : "+rollNumber);
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.name = "Durgesh";
		std.age = 30;
		std.rollNumber = 1010;
		
		std.displayDetails();

	}

}
