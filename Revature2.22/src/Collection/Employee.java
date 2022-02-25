package Collection;

import java.io.Serializable;

public class Employee implements Serializable {

	//object serialization
	//convert serialized object, write it to a file 
	//read from file and de-serialize it
	public String name;
	public String address;
	public int ssn;
	public int number;
	
	public void mailCheck() {
		System.out.println("Mailling a check to "+  name + "" +address);
	}
	
}
