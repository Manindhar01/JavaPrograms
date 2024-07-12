package prog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m=new HashMap<>();
		m.put("A","Angular");
		m.put("P", "Python");
		m.put("J", "Java");
		m.put("H","Hypernet");
		System.out.println(m);
		
		for(Map.Entry<String,String> s:m.entrySet()) {
			System.out.println(s.getKey()+":"+s.getValue());
		}

	}

}
