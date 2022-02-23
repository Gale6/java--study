package oops;

public class Car extends Vehicle{
	
	private String brand = "Benz";
	
	
	public static void main(String[] args) {


		Car myCar = new Car();
		
		myCar.bodyType = "SUV";
		
		myCar.honk();
		
		
		System.out.println(myCar.brand + "" + myCar.bodyType);

	}

}
