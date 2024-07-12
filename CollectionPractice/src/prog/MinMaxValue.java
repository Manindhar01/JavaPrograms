package prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>al=new ArrayList<>();
		al.add(3);
		al.add(5);
		al.add(18);
		al.add(4);
		System.out.println("The minimum value of list is:"+Collections.min(al));
		System.out.println("The maximum value of list is:"+Collections.max(al));

	}

}
