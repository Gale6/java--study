package oops;


public class Human {
	
	int legs = 2;
	int hands = 2;
	int eyes = 2;
	private int thirdEye = 1;
	
	public int getThirdEye() {
		return thirdEye;
	}
	
	public void setThirdEye(int thirdEye) {
		this.thirdEye = thirdEye;
	}

	//a method signature or method declaration with its implementation.
	public int addition(int a, int b) { //parameters
		
		System.out.println("adding two nums " + a + " and " + b);
		int result = a+b;
		System.out.println("result is " + result);
		return result ;
	}
	
	public void run() {
		System.out.println("Im running!");
		
	}
	public void stop() {
		System.out.println("Stopping!");
		
	}
	
	
	
	public float division(int a, int b) {
		System.out.println("dividing two nums " + a + " and " + b);
		
		float aa = a;
		float bb = b;
		
		
		float result = aa / bb;
		System.out.println("result is " + result);
		return result;
	}
	

}

