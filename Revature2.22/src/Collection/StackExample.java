package Collection;

import java.util.Stack;
import java.util.Iterator;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> list = new Stack<String>();
		
		list.push("Gale");
		list.push("Abel");
		list.push("Adama");
		list.push("Brandon");
		
		System.out.println(list);
		
		//Traversing through iterator
		list.pop();
		
		System.out.println(list);
		
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
		

	}

}
