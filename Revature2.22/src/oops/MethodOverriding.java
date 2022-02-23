package oops;

class Super {
	   void sample(int a, int b) {
	      System.out.println("Method of the Super class");
	   }
	}
public class MethodOverriding extends Super {
	   void sample(int a, Double b) {
	      System.out.println("overload Method of the Sub class");
	   }
	   void sample(int a, int b) {
		      System.out.println("Method of the Sub class");
		   }
	   public static void main(String args[]) {
	      MethodOverriding obj = new MethodOverriding();
	      obj.sample(20, 20.1);
	   }
	}