package prog;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(6);
		pq.add(4);
		pq.add(9);
		pq.add(5);
		if(pq.isEmpty()) {
			System.out.println("its empty");
		}else {
			System.out.println("its not empty");
		}
		
		System.out.println(pq);
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
