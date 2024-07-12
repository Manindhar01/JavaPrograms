package prog;

import java.util.HashMap;
import java.util.Map;

public class KeyExitsInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1,"java");
		m1.put(2, "Python");
		m1.put(3,"Angular");
		System.out.println(" Is m1 contain key 2: "+m1.containsKey(2));
		Map<Integer,String> m2=new HashMap<>();
		m2.put(1,"j");
		m2.put(2,"a");
		m2.put(3,"v");
		m2.put(4,"a");
		System.out.println("Is m2 contain key 10: "+m2.containsKey(10));

	}

}
