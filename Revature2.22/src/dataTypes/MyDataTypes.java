package dataTypes;



public class MyDataTypes {

	public static void main(String[] args) {
		
		byte myByte = 127;
		short myShort = (short) 32_934;
		int myInt = 75_5443;
		long myLong = 2344L;
		
		float myFloat = 3.45f;
		double myDouble = 34.23232d;
		
		char myChar = 'c';
		Boolean myBoolean = true;
		
		String myString = "Hellow World";
		
		//how to use variables
		
		System.out.println( myByte );
		System.out.println( myShort  );
		System.out.println( myInt  );
		System.out.println( myLong  );
		System.out.println( myFloat  );
		System.out.println( myDouble  );
		System.out.println( myBoolean  );
		
		
		//how to chain the variable
		myInt = 100;
		System.out.println( myInt );
		
		
		String myString1 = "Hellow World";
		System.out.println(myString == myString1 );
		
		
		
		int k = 10;
		int j = 15;
		int age = 35;
		
		//condition
		if (k<j) {
			System.out.println("k is less than j");
		}else if (age<k) {
			System.out.println("j is not less than j");
			
		}else {
			System.out.println("hihi");
		}
		
		// for loop
		
		for (int i1 = 0; i1<myString.length();i1++) {
			System.out.println("this is i1 and the value is " + i1);
			
		}
		
		while (myByte < 0) {
			System.out.println('c');
			
		}
		
		//switch
		
		switch(myChar ) {
		
		case 'A': System.out.println('A');		
		}
		
	}

}
