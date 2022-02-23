package oops;

import java.util.Scanner;




public class Main {

	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.animalSound();
		
		
		Pig myPig = new Pig();
		
		myPig.animalSound();
		
		
		
		int one = overLoad1.add(3, 5);
		double two = overLoad2.add(5.5, 6.6);
		
		
		System.out.println(one+"   " +two);
	
		String cars1 = "hi";
		
		String[] cars = {cars1,"j"};
		System.out.println(cars[0]);
		
		cars1 = "hi1";
		System.out.println(cars[0]);
		
		
		
		for (String s : cars) {
			System.out.println(s);
			
		}
		
		for(int i = 0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		
		
		int[][] myNum = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i< myNum.length;i++) {
			for (int j = 0; j < myNum[i].length;j++) {
				System.out.println(myNum[i][j]);
			}
		}
		
		
		
	}
}
