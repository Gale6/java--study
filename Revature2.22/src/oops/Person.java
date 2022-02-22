package oops;

class Person {
	
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
		
	}
	
	
	
}