package prog;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class ConvertHashMapToTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Java");
		hm.put(2, "Python");
		hm.put(3,"Is a programming language");
		System.out.println(hm);
		TreeMap<Integer,String> tm=new TreeMap<>(hm);
		System.out.println(tm);

	}

}
