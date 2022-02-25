package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
	
	

	public static void main(String[] args) {
		
		
		Employee e = null;
		
		try {
			
			FileInputStream fileIn = new FileInputStream("./serialization.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
			
			System.out.println(e.name);
			
		}catch (IOException ex) {
			
			ex.printStackTrace();
		}catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}
		
		
		

	}

}
