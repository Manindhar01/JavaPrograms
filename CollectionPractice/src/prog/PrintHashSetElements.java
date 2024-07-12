package prog;

import java.util.HashSet;
import java.util.Iterator;

public class PrintHashSetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(2);
		hs.add(3);
		hs.add(6);
		hs.add(null);
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
