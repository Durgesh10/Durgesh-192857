package Assignment_22_05_2026;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		
		if(num<=1) {
			System.out.println("No is not prime number");
			return;
		}
        boolean isPrime =true;
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}

		}
		if(isPrime) {
			System.out.println("No is prime number");
		}
		else {
			System.out.println("no is not prime number");
		}
	}

}
