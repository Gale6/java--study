package oops;

class Person extends Human{
	
	int age = 0;
	String name = "";
	int weight = 0;
	
	
	public static void  main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "baby1";
		p1.weight = 3;
		System.out.println("p1 name is "+p1.name+", and weights " + p1.weight);
		
		Person p2 = new Person();
		p2.name = "baby2";
		
		p2.weight = 4;
		
		System.out.println("p1 name is "+p2.name+", and weights " + p2.weight);
		
		Human h1 = new Human();
		
		System.out.println("h1 has " + h1.eyes + " eyes");
		h1.addition(6,7);
		
		
		h1.division(5, 6);
		
		System.out.println(h1.getThirdEye());
		h1.setThirdEye(5);
		System.out.println(h1.getThirdEye());
		
		
		
		
	}
	@Override
	public int addition(int a, int b) { //parameters
		
		System.out.println("adding two nums " + a + " and " + b);
		int result = a+b;
		System.out.println("result is " + result);
		return result ;
	}
	
	
	
	
}