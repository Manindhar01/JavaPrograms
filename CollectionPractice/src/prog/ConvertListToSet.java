package prog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println("List values Are="+l);
		Set<Integer> s=new HashSet<>();
	    s.addAll(l);
		System.out.println("Set values="+s);

	}

}
