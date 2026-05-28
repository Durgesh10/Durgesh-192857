package Assignments_21_05_2026;

public class Car {
	
	String brand = "Hyundai";
	String model= "verna";
	int price= 2000000;
	
	void startcar() {
		System.out.println(brand+" "+model+" car is starting");
	}
	
    void stopcar() {
    	System.out.println(brand+" "+model+" car is stopped");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.startcar();
		car.stopcar();

	}

}

