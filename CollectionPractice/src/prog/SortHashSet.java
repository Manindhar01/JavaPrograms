package prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("suriya");
		hs.add("vickram");
		hs.add("kamal");
		hs.add("ajith");
		System.out.println(hs);
		List<String> al=new ArrayList<>(hs);
		Collections.sort(al);
		System.out.println(al);
		

	}

}
