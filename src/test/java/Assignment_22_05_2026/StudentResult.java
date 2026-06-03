package Assignment_22_05_2026;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's marks : ");
		
		int marks = sc.nextInt();
		
		int passMarks = 35;
		
		if(marks>=passMarks) {
			System.out.println("Student is PASSED");
		} else {
			System.out.println("Student is FAILED");
		}

	}

}
