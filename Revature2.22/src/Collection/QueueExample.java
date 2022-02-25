package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
	
	// FIFO 
	//priority queue
	
	
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("ford");
		q.add("benz");
		q.add("lexus");
		q.add("toyota");


		System.out.println(q);
		
		System.out.println(q.element());
		System.out.println(q.peek()); // returns null when empty
		
		Iterator itr = q.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}

}
