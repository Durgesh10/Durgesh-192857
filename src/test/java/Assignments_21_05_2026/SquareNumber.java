package Assignments_21_05_2026;

public class SquareNumber {
	
	int findSquare(int number) {
		return number*number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareNumber calc = new SquareNumber(); 
		
		int num =5;
		int result = calc.findSquare(num);
		
		System.out.println("Square of "+num+" is : "+result);

	}

}
