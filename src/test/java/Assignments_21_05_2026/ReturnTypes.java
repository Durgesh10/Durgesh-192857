package Assignments_21_05_2026;

public class ReturnTypes {
	
	int getIntValue() {
		return 10;
	}
	
	double getDoubleValue() {
		return 11.32;
	}
	
	String getStringValue() {
		return "Test world";
	}
	
	boolean getBooleanValue() {
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnTypes rt = new ReturnTypes();
		
		System.out.println("Int Value: "+rt.getIntValue());
		System.out.println("Double Value: "+rt.getDoubleValue());
		System.out.println("String Value: "+rt.getStringValue());
		System.out.println("Boolean Value: "+rt.getBooleanValue());

	}

}
