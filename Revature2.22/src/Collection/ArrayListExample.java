package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// List Interface ArrayList, LinkedList, Vector, Stack
		
		// arrayList - duplicates and ordered objects
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Gale");
		list.add("Abel");
		list.add("Adama");
		list.add("Brandon");
		
		System.out.println(list);
		
		//Traversing through iterator
		
		Iterator itr = list.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
		//LinkedList
		
		//Vector
		
		//Stack
		

	}

}
