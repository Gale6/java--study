package Collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		e.name = "Gale";
		e.address= "hahaSt";
		e.ssn = 12345;
		e.number = 987;
		
		
		
		
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("./serialization.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			
		}catch (IOException ex) {
			
			ex.printStackTrace();
		}

	}

}
