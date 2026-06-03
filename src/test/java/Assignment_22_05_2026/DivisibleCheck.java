package Assignment_22_05_2026;

import java.util.Scanner;

public class DivisibleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println(num + " is divisible by 5 & 11");
		} else if (num % 5 == 0) {
			System.out.println(num + " is divisible by 5");
		} else if (num % 11 == 0) {
			System.out.println(num + " is divisible by 11");
		} else  {
			System.out.println(num + " is not divisible by 5 or 11");
				}

	}

}
