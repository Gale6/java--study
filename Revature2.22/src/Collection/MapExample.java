package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		
		Map<Integer, String> m =  new HashMap<Integer,String>();
		
		
		m.put(1,"benz");
		m.put(2,"h");
		m.put(3,"z");
		m.put(4,"d");
		
		
		
		System.out.println(m);
		
		
		for(Map.Entry i: m.entrySet()) {
			System.out.println("pair " + i.getKey() + " value is "+ i.getValue());
			
		}
		
		
		
	}

}
