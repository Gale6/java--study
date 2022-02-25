package oops;

public class PigInterface implements AnimalInterface, VeicleInterFace{
	public static void main(String[] args) {
		
		String s= "hi";
		
		String jString = "j";
		
		PigInterface myPig = new PigInterface();
		
		myPig.honk();
		myPig.animalSound();
		myPig.run();
		
		
		
		AnimalInterface ani = new PigInterface();
		
		ani.run();
		
	}

	//@Override
	public void animalSound() {
		System.out.println("wee we");
		
	}

	//@Override
	public void run() {
		System.out.println("running");
		
	}

	@Override
	public void honk() {
		System.out.println("honk honk");
		
	}
}
