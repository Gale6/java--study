package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	
	
	//HashSet, LinkedHashSet, LinkedHashSet maintain oder and elements
	//SortedSet - order is maintained ascending order
	//TreeSet - access and retrieval of elements are very very fast, sorted and ordered
	//no duplicate
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("ford");
		set.add("benz");
		set.add("lexus");
		set.add("toyota");


		System.out.println(set);
		
		Iterator itr = set.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
}
